package Clase2;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int Num1=leerInt("Ingrese el numero del primer participante");
    	int Num2=leerInt("Ingrese el numero del segundo participante");
    	int Num3=leerInt("Ingrese el numero del tercer participante");
		mostrar("Primer Ganador "+DeterminarMedioTresNumeros(DeterminarMayorTresNumeros( Num1, Num2, Num3),DeterminarMenorTresNumeros( Num1, Num2, Num3), Num1, Num2, Num3));
		mostrar("Segundo ganador "+CalcularSegundoGanador(DeterminarMayorTresNumeros( Num1, Num2, Num3),DeterminarMenorTresNumeros( Num1, Num2, Num3),DeterminarMedioTresNumeros(DeterminarMayorTresNumeros( Num1, Num2, Num3),DeterminarMenorTresNumeros( Num1, Num2, Num3), Num1, Num2, Num3)));
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
    
    public static int DeterminarMayorTresNumeros(int Num1, int Num2, int Num3){
    	if(Num1>Num2 && Num1>Num3) {
    		return Num1;
    		
    	}else if(Num2>Num1 && Num2>Num3){
    		return Num2;
    		
    	}else{
    		return Num3;
    		
    	} 	
    }
   
   public static int DeterminarMenorTresNumeros(int Num1, int Num2, int Num3){
   	if(Num1<Num2 && Num1<Num3) {
   		return Num1;
   		
   	}else if(Num2<Num1 && Num2<Num3){
   		return Num2;
   		
   	}else{
   		return Num3;
   		
   	} 	
   }

   public static int DeterminarMedioTresNumeros(int Mayor, int Menor, int Num1, int Num2, int Num3){
	   
	   
	   if(Num1>Menor && Num1<Mayor) {
	   		return Num1;
	   		
	   	}else if(Num2>Menor && Num2<Mayor){
	   		return Num2;
	   		
	   	}else{
	   		return Num3;
	   		
	   	} 	
	   }
   
   public static int CalcularSegundoGanador(int Mayor, int Menor, int PrimerGanador) {
	   int mayor=Mayor-PrimerGanador;
	  int menor=PrimerGanador-Menor;
	   
	   if(menor<mayor) {
		   return Menor;
	   }else {
		   return Mayor ;
	   }
	   
	   
	   
   }

}
