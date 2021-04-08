package m03;

public class Nivell1Fase2 
{
	
  public static void main(String[] args)
  { 
    /*	  
    -Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). 
    -Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. 	
    */
	  
    String strVar1,strVar2,strVar3,strVar4,strVar5,strVar6; 
	strVar1 = "Berlin";  
    strVar2 = "Madrid";
    strVar3 = "Lisboa";
    strVar4 = "Barcelona";
    strVar5 = "Roma";
    strVar6 = "Napoles";  
	  
	String[] arrayCiutats = new String[6]; 
	arrayCiutats[0] = strVar1;
	arrayCiutats[1] = strVar2;
	arrayCiutats[2] = strVar3;
	arrayCiutats[3] = strVar4;
	arrayCiutats[4] = strVar5;
	arrayCiutats[5] = strVar6;
	
	java.util.Arrays.sort(arrayCiutats);
	System.out.println("Ciutats per order alfabètic:"); 
	for(String ciutat : arrayCiutats)
    { System.out.println(ciutat);		
    }			

  }

	
}
