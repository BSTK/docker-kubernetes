package dev.bstk.dockerk8s.perfils.domain.formageometrica;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        System.out.println("Triangulo Área = " + FormaGeometrica.TRIANGULO.calcular(
            Map.of(
                "forma", "triangulo",
                "base", "1.50",
                "altura", "1.20"
            )
        ));

        System.out.println("Quadrado Área = " + FormaGeometrica.QUADRADO.calcular(
            Map.of(
                "forma", "quadrado",
                "lado", "1.50"
            )
        ));
    }
}
