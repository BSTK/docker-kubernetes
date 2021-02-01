package dev.bstk.dockerk8s.perfils.api.response;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
public class PerfilResponse implements Serializable {

    @NotNull
    private UUID id;

    @NotNull @NotEmpty
    private String nome;

    @NotNull @NotEmpty
    private String email;

    @NotNull @NotEmpty
    private String biografia;

    @NotNull @NotEmpty
    private List<ReceitaResponse> ultimasReceitas;

}
