package dev.bstk.dockerk8s.perfils.domain.formageometrica;

import java.util.Map;

import static dev.bstk.dockerk8s.perfils.domain.formageometrica.FormaGeometrica.QUADRADO;

public class Quadrado implements CacularForma {

    @Override
    public double calcular(final Map<String, String> dados) {
        if (QUADRADO.name().equalsIgnoreCase(dados.get(FORMA))) {
            final var lado = Double.parseDouble(dados.get(LADO));

            /// POSTAR NUMA FILA
            /// ENVIAR UM EMAIL
            /// GERAR UM REALTORIO EM PDF
            /// GERAR UM REALTORIO EM EXCEL

            return Math.pow(lado, 2);
        }

        return -1;
    }

}
