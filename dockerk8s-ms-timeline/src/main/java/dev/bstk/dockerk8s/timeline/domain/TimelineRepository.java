package dev.bstk.dockerk8s.timeline.domain;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TimelineRepository {

    private static final List<Timeline> DADOS = List.of(
        Timeline.builder()
            .data(LocalDate.now())
            .usuario("Arthur de Azevedo")
            .receitas(List.of("Peixe Amarelo", "Batata á Marsele"))
            .build(),

        Timeline.builder()
            .data(LocalDate.now())
            .usuario("Maria Luz")
            .receitas(List.of("Torta de Batatas", "Arroz Rosado", "Bife a cavalo"))
            .build(),

        Timeline.builder()
            .data(LocalDate.now())
            .usuario("Patricia Silva")
            .receitas(List.of("Macarrão do campo"))
            .build()
    );

    public List<Timeline> timelines() {
        return new ArrayList<>(DADOS);
    }
}
