package Clase1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrar(""+leerInt());
	

	
	}
    public static float leerInt (){
        int litroMin;
        Scanner sc = new Scanner(System.in);
        mostrar("ingrese la cantidad de litros por minuto que da su manguera");
        litroMin = sc.nextInt();
        
       return CalcularHoras(litroMin);
    }
    
    public static void mostrar (String mensaje){
        System.out.println(mensaje);
    }
    
	public static float CalcularHoras(int litroMin){
		int litroHor;
		litroHor = litroMin*60;
		return 50000/litroHor;
		
		
	}

	
	

}
