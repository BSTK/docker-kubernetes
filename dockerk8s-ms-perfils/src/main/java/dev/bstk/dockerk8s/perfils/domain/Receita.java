package dev.bstk.dockerk8s.perfils.domain;


import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Receita implements Serializable {

    @NotNull
    private UUID id;

    @NotNull @NotEmpty
    private String nome;

    @NotNull
    private LocalDate dataCriacao;

    @NotNull @NotEmpty
    private List<String> ingredientes;
}
