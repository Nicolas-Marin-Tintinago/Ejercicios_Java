package Clase1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guardar();
	}
	
	
	public static void Guardar () {
		int ValorPesos;
		int ValorDolar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de pesos que tiene");
		ValorPesos = sc.nextInt();
		System.out.println("Ingrese el valor del dolar actual");
		ValorDolar = sc.nextInt();
		
		System.out.println("Tu dinero en dolares es de: "+Calcular(ValorPesos,ValorDolar));
	}
	
	public static double Calcular (int ValP, int ValD) {
		double Conversion;
		
		Conversion= ValP/ValD;
		

		return Conversion;
	}
	

}
