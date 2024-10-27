package Clase3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcular();
	}
	
	public static int leerInt (){
        int numero;
        Scanner sc = new Scanner(System.in);
        mostrar("ingrese numero");
        numero = sc.nextInt();
        return numero;
    }

    public static double leerDouble (){
        double numero;
        Scanner sc = new Scanner(System.in);
        mostrar("ingrese numero");
        numero = sc.nextDouble();
        return numero;
    }

    public static void mostrar (String mensaje){
        System.out.println(mensaje);
    }
    
    public static void Calcular() {
    	
    	Calculadora clc = new Calculadora();
    	Calculadora clc2 = new Calculadora();
	
    	 mostrar("Ingrese 1 para sumar \n" +
                 "ingrsese 2 para restar \n" +
                 "ingrese 3 para multiplicar \n" +
                 "ingrese 4 para dividir");


         switch (leerInt()) {
             case 1:
               mostrar("La suma es :"+clc.sumar(leerDouble (),leerDouble ()));
               mostrar("La suma es :"+clc2.sumar(leerDouble (),leerDouble ()));
                 break;
             case 2:
            	 mostrar("La suma es :"+clc.restar(leerDouble (),leerDouble ()));
            	 mostrar("La suma es :"+clc2.restar(leerDouble (),leerDouble ()));
                 break;
             case 3:
            	 mostrar("La suma es :"+clc.multiplicar(leerDouble (),leerDouble ()));
            	 mostrar("La suma es :"+clc2.multiplicar(leerDouble (),leerDouble ()));
                 break;
             case 4:
            	 mostrar("La suma es :"+clc.dividir(leerDouble (),leerDouble ()));
            	 mostrar("La suma es :"+clc2.dividir(leerDouble (),leerDouble ()));
                 break;
             default:
                 mostrar("no se ingreso un dato valido");
         }
	
    }

}
