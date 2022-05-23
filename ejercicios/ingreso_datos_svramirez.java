import java.util.Scanner;
/**
 * Class Untitled
 */
public class IngresoDatos {
	public static void main(String[] args) {
    	
    	Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Ingresa clave master:");
	    String passwordMaster = scannerObj.nextLine();  //LEER PSEINT
	    
	    
	    System.out.println("Ingresa clave second:");
	    String passwordSecond = scannerObj.nextLine();  //LEER PSEINT
	    
	    // Read user input
	    //System.out.println("Username is: " + userName);  // Output user input
	    
	    // Mientras
	    /*
	    Mientras expresion_logica Hacer
			secuencia_de_acciones
		Fin Mientras
		
		!
		
	    */
	    
	    System.out.println("Sin negar: "+ passwordMaster.equals(passwordSecond));
	    System.out.println("Negando: "+ !passwordMaster.equals(passwordSecond));
	    
	    while (!passwordMaster.equals(passwordSecond)){
	    	System.out.println("Ingresa clave second:");
	    	passwordSecond = scannerObj.nextLine();  //
	    	
	    }
	    
	    
	}
	
		
}