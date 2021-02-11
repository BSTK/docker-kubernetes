package dev.bstk.dockerk8s.perfils.domain.formageometrica;

import java.util.Map;

public interface CacularForma {

    String RAIO = "raio";
    String LADO = "lado";
    String BASE = "base";
    String FORMA = "forma";
    String ALTURA = "altura";
    String LARGURA = "largura";

    double calcular(final Map<String, String> dados);

}
