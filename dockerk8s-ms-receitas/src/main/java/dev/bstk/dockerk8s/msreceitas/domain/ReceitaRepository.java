package dev.bstk.dockerk8s.msreceitas.domain;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class ReceitaRepository {

    private static final Map<UUID, Receita> DADOS = Map.of(
        UUID.fromString("59f4265c-64a1-11eb-ae93-0242ac130002"), Receita.builder()
            .id(UUID.fromString("59f4265c-64a1-11eb-ae93-0242ac130002"))
            .nome("Peixe Amarelo")
            .dataCriacao(LocalDate.now())
            .ingredientes(List.of("Pacu", "Almerão", "Pimenta do reino"))
            .build(),

        UUID.fromString("60985b40-64a1-11eb-ae93-0242ac130002"), Receita.builder()
            .id(UUID.fromString("60985b40-64a1-11eb-ae93-0242ac130002"))
            .nome("Batata á Marsele")
            .dataCriacao(LocalDate.now())
            .ingredientes(List.of("Batatas", "Pimentinha do sertão", "Pimenta do reino"))
            .build(),

        UUID.fromString("b0559e7c-64a1-11eb-ae93-0242ac130002"), Receita.builder()
            .id(UUID.fromString("b0559e7c-64a1-11eb-ae93-0242ac130002"))
            .nome("Torta de Batatas")
            .dataCriacao(LocalDate.now())
            .ingredientes(List.of("Batatas", "Almerão", "Pimenta do reino"))
            .build(),

        UUID.fromString("b4d7e2de-64a1-11eb-ae93-0242ac130002"), Receita.builder()
            .id(UUID.fromString("b4d7e2de-64a1-11eb-ae93-0242ac130002"))
            .nome("Arroz Rosado")
            .dataCriacao(LocalDate.now())
            .ingredientes(List.of("Arroz do mato", "Almerão", "Pimenta do reino", "Coral"))
            .build(),

        UUID.fromString("b98c247a-64a1-11eb-ae93-0242ac130002"), Receita.builder()
            .id(UUID.fromString("b98c247a-64a1-11eb-ae93-0242ac130002"))
            .nome("Bife a cavalo")
            .dataCriacao(LocalDate.now())
            .ingredientes(List.of("Contra Filé", "Pimenta do reino", "Ovo"))
            .build(),

        UUID.fromString("c3d6b9e0-64a1-11eb-ae93-0242ac130002"), Receita.builder()
            .id(UUID.fromString("c3d6b9e0-64a1-11eb-ae93-0242ac130002"))
            .nome("Macarrão do campo")
            .dataCriacao(LocalDate.now())
            .ingredientes(List.of("1 pacote de macarrão", "Milho verde", "Ervilhas", "Calabresa"))
            .build()
    );

    public List<Receita> receitas() {
        return new ArrayList<>(DADOS.values());
    }

    public Receita receita(final UUID uuid) {
        return DADOS.get(uuid);
    }
}
