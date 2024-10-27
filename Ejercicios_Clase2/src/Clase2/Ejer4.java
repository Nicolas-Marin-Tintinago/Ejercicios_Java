package Clase2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeterminarDia();

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
    
    public static void DeterminarDia() {
    	
    	switch(leerInt("Ingrese el dia \n"
    			+ "(1) Lunes \n"
    			+ "(2) Martes \n"
    			+ "(3) Miercoles \n"
    			+ "(4) Jueves \\n"
    			+ "(5) Viernes \\n")) {
    	
    	case 1:
    		if(VerificarLunes()==true) {
    			
    			System.out.println("si puedes salir");
    		}else{
    			System.out.println("no puedes salir");
    		}
    			
    		
    		break;
    	case 2:
    		if(VerificarMartes()==true) {
    			
    			System.out.println("si puedes salir");
    		}else{
    			System.out.println("no puedes salir");
    		}
    			
    		break;
    	case 3:
    		if(VerificarMiercoles()==true) {
    			
    			System.out.println("si puedes salir");
    		}else{
    			System.out.println("no puedes salir");
    		}
    			
    		break;
    	case 4:
    		if(VerificarJueves()==true) {
    			
    			System.out.println("si puedes salir");
    		}else{
    			System.out.println("no puedes salir");
    		}
    			
    		break;
    	case 5:
    		if(VerificarViernes()==true) {
    			
    			System.out.println("si puedes salir");
    		}else{
    			System.out.println("no puedes salir");
    		}
    			
    		break;
    		
    		default:
    			
    	
    	}
    
    }
    
    public static int SacarUltimoNumero(){
    	return leerInt("Ingrese su placa")%10;
    	
    }
    
    public static boolean VerificarLunes() {
    	switch(SacarUltimoNumero()) {
    	
    	case 0:
    		return false;
    	case 1:
    		return false;
    	case 2:
    		return false;
    	case 3:
    		return false;
    		default:
    			return true ;
    	
    	}
    	
    }
    
   public static boolean VerificarMartes() {
	   switch(SacarUltimoNumero()) {
   	
   	case 4:
   		return false;
   	case 5:
   		return false;
   	case 6:
   		return false;
   	case 7:
   		return false;
   		default:
   			return true;
   	
   	}
    	
    }
   
   public static boolean VerificarMiercoles() {
	   switch(SacarUltimoNumero()) {
   	
   	case 8:
   		return false;
   	case 9:
   		return false;
   	case 0:
   		return false;
   	case 1:
   		return false;
   		default:
   			return true ;
   	
   	}
   	
   }
   
   public static boolean VerificarJueves() {
	   switch(SacarUltimoNumero()) {
   	
   	case 2:
   		return false;
   	case 3:
   		return false;
   	case 4:
   		return false;
   	case 5:
   		return false;
   		default:
   			return true;
   	
   	}
   	
   }
   
   public static boolean VerificarViernes() {
	   switch(SacarUltimoNumero()) {
   	
   	case 6:
   		return false;
   	case 7:
   		return false;
   	case 8:
   		return false;
   	case 9:
   		return false;
   		default:
   			return true ;
   	
   	}
   	
   }
   
 }

