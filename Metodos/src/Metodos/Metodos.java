package Metodos;
import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	
//	  mostrar("Ingrese 1 para sumar \n" +
//              "ingrsese 2 para restar \n" +
//              "ingrese 3 para multiplicar \n" +
//              "ingrese 4 para dividir");
	
	public static void mostrar (String mensaje){
        System.out.println(mensaje);
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
    
    public static String leerString (){
        String texto;
        Scanner sc = new Scanner(System.in);
        mostrar("ingrese ");
        texto = sc.toString();
        return texto;
    }
    
	public static int SumaTresEnteros() {
		int num1,num2,num3;
		num1=leerInt();
		num2=leerInt();
		num3=leerInt();
		return num1+num2+num3;
	}
}
