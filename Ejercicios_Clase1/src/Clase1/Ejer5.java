package Clase1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		leerInt();


	}
	
	public static void mostrar (String mensaje){
        System.out.println(mensaje);
    }
	
	public static void leerInt (){
	        int Gigabytes;
	        Scanner sc = new Scanner(System.in);
	        mostrar("ingrese la capacidad del disco en Gigabytes");
	        Gigabytes = sc.nextInt();      
	       mostrar("" +Megabyte(Gigabytes)+"\n"+Kilobyte(Megabyte(Gigabytes))+"\n"+Byte(Kilobyte(Megabyte(Gigabytes))));
	    }
	
	public static int Kilobyte(int Megabyte) {
		return Megabyte*1024;
	}
	
	public static int Megabyte(int Gigabyte) {
		return Gigabyte*1024;
	}

	public static int Byte(int Kilobyte) {
		return Kilobyte*1024;
	
	}
	
	
}