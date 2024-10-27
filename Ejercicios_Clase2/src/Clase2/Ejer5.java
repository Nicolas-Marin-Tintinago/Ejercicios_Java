package Clase2;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrar(""+CalcularHorasExtras(leerInt ( "Ingrese las horas trabajadas")));
		
	}
	
	public static void mostrar (String mensaje){
        System.out.println(mensaje);
    }

    
    public static int leerInt (String mensaje){
        int numero;
        Scanner sc = new Scanner(System.in);
        mostrar(mensaje);
        numero = sc.nextInt();
        return numero;
        
    }
    
    public static double CalcularHorasExtras(int Horas) {
    	if(Horas>40) {
    		int Extra=Horas-40;
    		return CalcularHorasExtrasExtras(Extra, DeterminarValorHora());
    		
    	}else {
    	return	DeterminarValorHora()*Horas;
    		
    	}
    	
    }
    public static double CalcularHorasExtrasExtras(int Extra, double valor) {
    	if(Extra>8) {
    		int ExtraExtra= Extra-8;
    		return (40*valor)+(valor*2*8)+(valor*3*ExtraExtra);
    	}else {
    		
    		return (40*valor)+(valor*2*Extra);
    	}
    	
    }
    public static double DeterminarValorHora() {
    		return leerInt("Cuanto paga la hora");
    		
    	}
}