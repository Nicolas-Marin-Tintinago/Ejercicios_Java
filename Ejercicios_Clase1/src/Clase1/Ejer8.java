package Clase1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		CalcularInversionTotal();
		
		
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
	
	public static float CalcularPorcentaje1(int InversionTotal, int Amigo1) {
		return Amigo1=100*Amigo1/InversionTotal;
	}
	public static float CalcularPorcentaje2(int InversionTotal, int Amigo2) {
		return Amigo2=100*Amigo2/InversionTotal;
	}
	public static float CalcularPorcentaje3(int InversionTotal, int Amigo3) {
		return Amigo3=100*Amigo3/InversionTotal;
		
	}

	public static void CalcularInversionTotal() {
		
		int Amigo1=leerInt("Ingrese la cantidad de dinero que aporto el primer amigo");
		int Amigo2=leerInt("Ingrese la cantidad de dinero que aporto el segundo amigo");
		int Amigo3=leerInt("Ingrese la cantidad de dinero que aporto el tercer amigo");
		int InversionTotal= Amigo1+Amigo2+Amigo3;
		mostrar(""+CalcularPorcentaje1(InversionTotal,Amigo1)+"% \n"+CalcularPorcentaje1(InversionTotal,Amigo2)+"% \n"+CalcularPorcentaje1(InversionTotal,Amigo3)+"%");
	}

}