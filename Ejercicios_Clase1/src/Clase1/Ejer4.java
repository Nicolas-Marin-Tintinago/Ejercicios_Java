package Clase1;

import java.util.Scanner;

public class Ejer4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrar(""+SueldoTotal(CalcularPorcentaje(SumaTresEnteros())));
		
	}

	public static void mostrar (String mensaje){
        System.out.println(mensaje);
    }

	public static int leerInt (){
        int numero;
        Scanner sc = new Scanner(System.in);
        mostrar("ingrese el valor de la venta realizada");
        numero = sc.nextInt();
        return numero;
    }
	
	public static int SumaTresEnteros() {
		int num1,num2,num3;
		num1=leerInt();
		num2=leerInt();
		num3=leerInt();
		return num1+num2+num3;
	}
	
	public static double CalcularPorcentaje(int valor) {
		return valor*0.12 ;
	}
	
	public static double SueldoTotal(double porc) {
		
		return porc+450000;
		
	}
}
