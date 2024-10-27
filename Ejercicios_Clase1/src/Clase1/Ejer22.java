package Clase1;

import java.util.Scanner;

public class Ejer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double velocidadPatrulla = scanner.nextDouble();
        double velocidadLucas = scanner.nextDouble();
        double distancia = scanner.nextDouble();
        
        double tiempo = calcularTiempo(velocidadPatrulla, velocidadLucas, distancia);
        mostrarResultado(tiempo);
    }

    public static double calcularTiempo(double velocidadPatrulla, double velocidadLucas, double distancia) {
        return (distancia / (velocidadPatrulla - velocidadLucas)) * 60;
    }

    public static void mostrarResultado(double resultado) {
        System.out.println(resultado);
    }
}