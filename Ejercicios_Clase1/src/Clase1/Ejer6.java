package Clase1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		EdadHijos();
		
		
	}
	
    public static int leerInt (String mensaje){
        int Numero;
        Scanner sc = new Scanner(System.in);
        mostrar(mensaje);
        Numero = sc.nextInt();

        return Numero;
    }
    
	public static void mostrar (String mensaje){
        System.out.println(mensaje);
    }
	
	public static float Herencia1(int EdadHijos, int Herencia, int Hijo1) {
		return Herencia*Hijo1/EdadHijos;
	}
	public static float Herencia2(int EdadHijos, int Herencia, int Hijo2) {
		return Herencia*Hijo2/EdadHijos;
	}
	public static float Herencia3(int EdadHijos, int Herencia, int Hijo3) {
		return Herencia*Hijo3/EdadHijos;
		
	}

	public static void EdadHijos() {
		int Herencia=leerInt("ingrese el valor de la herencia en dolares");
		int Hijo1=leerInt("Ingrese la edad del primer hijo");
		int Hijo2=leerInt("Ingrese la edad del segundo hijo");
		int Hijo3=leerInt("Ingrese la edad del tercer hijo");
		int EdadHijos= Hijo1+Hijo2+Hijo3;
		mostrar(""+Herencia1(EdadHijos,Herencia,Hijo1)+"\n"+Herencia2(EdadHijos,Herencia,Hijo2)+"\n"+Herencia3(EdadHijos,Herencia,Hijo3));
	}

}
