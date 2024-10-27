package Clase1;

import java.util.Scanner;

public class Ejer15 {

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
    
    public static int centena(int valor) {
    	return valor/100;
    }
    
    public static int decena(int valor) {
    	return valor/10%10;
    }
    
    public static int unidad(int valor) {
    	return valor%100%10;
    }
    public static int suma(int valor) {
    	
    	int suma= unidad(valor)+decena(valor)+centena(valor);
    	return suma;
    }
    public static void Intercambio() {
    int valor=leerInt("Ingrese el numero");
    mostrar(""+centena(valor)+" "+decena(valor)+" "+unidad(valor));
     mostrar(" "+suma(valor));
    
    }

}
