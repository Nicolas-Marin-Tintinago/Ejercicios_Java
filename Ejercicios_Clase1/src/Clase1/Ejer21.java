package Clase1;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intercambio();

	}

	public static void mostrar (String mensaje){
        System.out.println(mensaje);
    }
	
    public static int leerInt (String mensaje){
        int Numero;
        Scanner sc = new Scanner(System.in);
        mostrar(mensaje);
        Numero = sc.nextInt();

        return Numero;
    }
    
    public static void Intercambio(){
    int	a=leerInt("Ingrese el valor de a");
    int	b=leerInt("Ingrese el valor de b");
    a=a+b;
    b=a-b;
    a=a-b;
    	mostrar("a= "+a+" b= "+b);
    	
    }
    
}