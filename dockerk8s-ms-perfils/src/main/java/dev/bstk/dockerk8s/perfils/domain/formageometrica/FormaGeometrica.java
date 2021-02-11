package dev.bstk.dockerk8s.perfils.domain.formageometrica;

import java.util.Map;

public enum FormaGeometrica {

    CIRCULO(new Circulo()),
    QUADRADO(new Quadrado()),
    TRIANGULO(new Triangulo()),
    RETANGULO(new Retangulo());

    private final CacularForma forma;

    FormaGeometrica(final CacularForma forma) {
        this.forma = forma;
    }

    public double calcular(final Map<String, String> dados) {
        return this.forma.calcular(dados);
    }

}
