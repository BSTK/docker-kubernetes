package dev.bstk.dockerk8s.perfils.domain;

import dev.bstk.dockerk8s.perfils.domain.entidades.Receita;
import dev.bstk.dockerk8s.perfils.domain.entidades.Usuario;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class UsuarioRepository {

    private static final Map<UUID, Usuario> DADOS = Map.of(
        UUID.fromString("8495a353-296f-4594-a188-29d13c861ebc"), Usuario.builder()
            .id(UUID.fromString("8495a353-296f-4594-a188-29d13c861ebc"))
            .nome("Arthur de Azevedo")
            .email("arthur.azevedo@gmail.com")
            .ultimasReceitas(
                List.of(
                    Receita.builder()
                        .id(UUID.fromString("59f4265c-64a1-11eb-ae93-0242ac130002"))
                        .nome("Peixe Amarelo")
                        .dataCriacao(LocalDate.now())
                        .ingredientes(List.of("Pacu", "Almerão", "Pimenta do reino"))
                        .build(),
                    Receita.builder()
                        .id(UUID.fromString("60985b40-64a1-11eb-ae93-0242ac130002"))
                        .nome("Batata á Marsele")
                        .dataCriacao(LocalDate.now())
                        .ingredientes(List.of("Batatas", "Pimentinha do sertão", "Pimenta do reino"))
                        .build()
                )
            )
            .biografia("Conzinheiro profissional")
            .build(),

        UUID.fromString("674e90d6-64a0-11eb-ae93-0242ac130002"), Usuario.builder()
            .id(UUID.fromString("674e90d6-64a0-11eb-ae93-0242ac130002"))
            .nome("Maria Luz")
            .email("maria.luz@gmail.com")
            .ultimasReceitas(
                List.of(
                    Receita.builder()
                        .id(UUID.fromString("b0559e7c-64a1-11eb-ae93-0242ac130002"))
                        .nome("Torta de Batatas")
                        .dataCriacao(LocalDate.now())
                        .ingredientes(List.of("Batatas", "Almerão", "Pimenta do reino"))
                        .build(),
                    Receita.builder()
                        .id(UUID.fromString("b4d7e2de-64a1-11eb-ae93-0242ac130002"))
                        .nome("Arroz Rosado")
                        .dataCriacao(LocalDate.now())
                        .ingredientes(List.of("Arroz do mato", "Almerão", "Pimenta do reino", "Coral"))
                        .build(),
                    Receita.builder()
                        .id(UUID.fromString("b98c247a-64a1-11eb-ae93-0242ac130002"))
                        .nome("Bife a cavalo")
                        .dataCriacao(LocalDate.now())
                        .ingredientes(List.of("Contra Filé", "Pimenta do reino", "Ovo"))
                        .build()
                )
            )
            .biografia("Chefe de conzinha com 15 anos de experiência")
            .build(),

        UUID.fromString("6e43c884-64a0-11eb-ae93-0242ac130002"), Usuario.builder()
            .id(UUID.fromString("6e43c884-64a0-11eb-ae93-0242ac130002"))
            .nome("Patricia Silva")
            .email("patricia.silva@gmail.com")
            .ultimasReceitas(
                List.of(
                    Receita.builder()
                        .id(UUID.fromString("c3d6b9e0-64a1-11eb-ae93-0242ac130002"))
                        .nome("Macarrão do campo")
                        .dataCriacao(LocalDate.now())
                        .ingredientes(List.of("1 pacote de macarrão", "Milho verde", "Ervilhas", "Calabresa"))
                        .build()
                )
            )
            .biografia("Massas, Doces & Salgados da Patty")
            .build()
    );

    public List<Usuario> usuarios() {
        return new ArrayList<>(DADOS.values());
    }

    public Usuario usuario(final UUID uuid) {
        return DADOS.get(uuid);
    }
}
