package dev.bstk.dockerk8s.perfils.domain.formageometrica;

import java.util.Map;

import static dev.bstk.dockerk8s.perfils.domain.formageometrica.FormaGeometrica.TRIANGULO;

public class Triangulo implements CacularForma {
    @Override
    public double calcular(final Map<String, String> dados) {
        if (TRIANGULO.name().equalsIgnoreCase(dados.get(FORMA))) {
            final double base = Double.parseDouble(dados.get(BASE));
            final double altura = Double.parseDouble(dados.get(ALTURA));

            /// POSTAR NUMA FILA

            return (base * altura) / 2;
        }

        return -1;
    }
}
