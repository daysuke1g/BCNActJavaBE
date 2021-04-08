package m03;

import java.util.Scanner;

public class Nivell1Fase1 
{
	
  public static void main(String[] args)
  { 
    /*	  
	-Crea sis variables tipu string buides. 
	-Demana per consola que s’introdueixin els noms.  
	-Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. 
	-Mostra per consola el nom de les 6 ciutats.
    */
	String strVar1,strVar2,strVar3,strVar4,strVar5,strVar6; 
	
    Scanner inputScanner = new Scanner(System.in);
    
    System.out.println("Introduir nom ciutat: ");
    strVar1 = inputScanner.nextLine();
	  
    System.out.println("Introduir nom ciutat: ");
    strVar2 = inputScanner.nextLine();

    System.out.println("Introduir nom ciutat: ");
    strVar3 = inputScanner.nextLine();

    System.out.println("Introduir nom ciutat: ");
    strVar4 = inputScanner.nextLine();

    System.out.println("Introduir nom ciutat: ");
    strVar5 = inputScanner.nextLine();

    System.out.println("Introduir nom ciutat: ");
    strVar6 = inputScanner.nextLine();

    System.out.println(strVar1+" "+strVar2+" "+strVar3+" "+strVar4+" "+strVar5+" "+strVar6);    
    
    inputScanner.close();
	  
  }

	
}
