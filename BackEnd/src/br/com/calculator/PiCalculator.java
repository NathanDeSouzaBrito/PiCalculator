package br.com.calculator;

public class PiCalculator {

    public static double calcularPorRaio(double raio) {
        return 2 * Math.PI * raio;
    }

    public static double calcularPorDiametro(double diametro) {
        return Math.PI * diametro;
    }
}
