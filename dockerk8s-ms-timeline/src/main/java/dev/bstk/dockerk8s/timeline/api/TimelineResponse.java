package dev.bstk.dockerk8s.timeline.api;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class TimelineResponse implements Serializable {

    @NotNull @NotEmpty
    private String usuario;

    @NotNull
    private LocalDate data;

    @NotNull @NotEmpty
    private List<String> receitas;

}
