package Clase2;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrar(""+CalcularCostoLlamada(leerInt("Digite (1) en caso de que la llamada haya sido local "
    			+ "\n Digite (2) si la llamada fue nacional "
    			+ "\n Digite (3) si fue internacional"),
				leerInt("cuantos minutos tardo su llamada?")));
		
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
    
    public static int DeterminarTipoLlamada() {
    	return leerInt("Digite (1) en caso de que la llamada haya sido local "
    			+ "\n Digite (2) si la llamada fue nacional "
    			+ "\n Digite (3) si fue internacional");
    	}
    
    
    	
    	public static double CalcularCostoLlamada(int Tipo, int Minutos) {
    		
    		switch(Tipo) {
    		
    		case 1:
    			return 100* Minutos;
			case 2:
				if(Minutos>20) {
					double Descuento=Minutos*250*0.20;
					return Minutos*250-Descuento;
				}else {
					return Minutos*250;
				}
    			
    		case 3:
    			if(Minutos>30) {
					double Descuento=Minutos*400*0.35;
					return Minutos*400-Descuento;
				}else {
					return Minutos*400;
				}
    			
    			
    			
    			default: 
    		
    				return 0;
    		}
    		
    	} 
    	
    }

