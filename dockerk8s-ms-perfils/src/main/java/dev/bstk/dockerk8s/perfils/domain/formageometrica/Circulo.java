package dev.bstk.dockerk8s.perfils.domain.formageometrica;

import java.util.Map;

import static dev.bstk.dockerk8s.perfils.domain.formageometrica.FormaGeometrica.CIRCULO;

public class Circulo implements CacularForma {

    @Override
    public double calcular(final Map<String, String> dados) {
        if (CIRCULO.name().equalsIgnoreCase(dados.get(FORMA))) {
            final var raio = Double.parseDouble(dados.get(RAIO));
            return Math.PI * Math.pow(raio, 2);
        }

        return -1;
    }

}
