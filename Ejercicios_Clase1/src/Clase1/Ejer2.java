package Clase1;

import java.util.Scanner;

public class Ejer2 {
	static int SalarioN = 795000;  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guardar();
	}
	
	
	public static void Guardar () {
		Scanner sc = new Scanner(System.in);
		int Salario;
		
		System.out.println("Ingrese el salario");
		Salario = sc.nextInt();	
		System.out.println("el porcentaje a subir es; "+ Calcular(Salario));
	}
	
	public static float Calcular (int Salario) {
		float Porcentaje;
		
		int Resta= (SalarioN-Salario);
		Porcentaje = 100*Resta/SalarioN; 
		
		
		return Porcentaje;
	}
	

}
