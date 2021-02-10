package dev.bstk.dockerk8s.msreceitas.api;

import dev.bstk.dockerk8s.msreceitas.domain.ReceitaRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/v1/receitas")
public class ReceitasResource {

    private final ModelMapper mapper;
    private final ReceitaRepository repository;

    @Autowired
    public ReceitasResource(final ModelMapper mapper,
                            final ReceitaRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @RequestMapping
    public ResponseEntity<List<ReceitaResponse>> usuarios() {
        final var receitas = repository.receitas();
        final var receitasResponse = receitas.stream()
            .map(receita -> mapper.map(receita, ReceitaResponse.class))
            .collect(Collectors.toList());

        log.warn("Request endpoint: /receitas");
        return ResponseEntity.ok(receitasResponse);
    }

    @RequestMapping("/{uuid}")
    public ResponseEntity<ReceitaResponse> usuario(@PathVariable("uuid") final UUID uuid) {
        final var receita = repository.receita(uuid);
        final var receitaResponse = mapper.map(receita, ReceitaResponse.class);

        log.warn("Request endpoint: /receitas/{uuid}");
        return ResponseEntity.ok(receitaResponse);
    }
}
