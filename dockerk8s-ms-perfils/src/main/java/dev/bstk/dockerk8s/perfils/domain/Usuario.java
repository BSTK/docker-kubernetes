package dev.bstk.dockerk8s.perfils.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class Usuario implements Serializable {

    @NotNull
    private final UUID id;

    @NotNull @NotEmpty
    private final String nome;

    @NotNull @NotEmpty
    private final String email;

    @NotNull @NotEmpty
    private final String biografia;

    @NotNull @NotEmpty
    private final List<Receita> ultimasReceitas;
}
