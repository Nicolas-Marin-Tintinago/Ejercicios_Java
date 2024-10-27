package Clase1;

import java.util.Scanner;

public class Ejer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota60 = scanner.nextDouble();
        double notaMinima = calcularNotaMinima(nota60);
        mostrarResultado(notaMinima);
    }

    public static double calcularNotaMinima(double nota60) {
        return (6 - (nota60 * 0.6)) / 0.4;
    }

    public static void mostrarResultado(double resultado) {
        System.out.println(resultado);
    }
}