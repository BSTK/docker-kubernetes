package dev.bstk.dockerk8s.perfils.domain.formageometrica;

import java.util.Map;

import static dev.bstk.dockerk8s.perfils.domain.formageometrica.FormaGeometrica.RETANGULO;

public class Retangulo implements CacularForma {

    @Override
    public double calcular(final Map<String, String> dados) {
        if (RETANGULO.name().equalsIgnoreCase(dados.get(FORMA))) {
            final var largura = Double.parseDouble(dados.get(LARGURA));
            final var altura = Double.parseDouble(dados.get(ALTURA));

            /// GERAR UM REALTORIO EM PDF
            /// GERAR UM REALTORIO EM EXCEL

            return largura * altura;
        }

        return -1;
    }

}
