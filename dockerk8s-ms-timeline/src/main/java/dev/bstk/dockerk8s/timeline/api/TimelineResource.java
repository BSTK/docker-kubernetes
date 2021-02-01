package dev.bstk.dockerk8s.timeline.api;

import dev.bstk.dockerk8s.timeline.domain.TimelineRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/timeline")
public class TimelineResource {

    private final ModelMapper mapper;
    private final TimelineRepository repository;

    @Autowired
    public TimelineResource(final ModelMapper mapper,
                            final TimelineRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @RequestMapping
    public ResponseEntity<List<TimelineResponse>> usuarios() {
        final var timelines = repository.timelines();
        final var timelinesResponse = timelines.stream()
            .map(receita -> mapper.map(timelines, TimelineResponse.class))
            .collect(Collectors.toList());

        return ResponseEntity.ok(timelinesResponse);
    }

}
