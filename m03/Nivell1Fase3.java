package m03;

public class Nivell1Fase3 
{
	
  public static void main(String[] args)
  { 
    /*	  
	-Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). 
	-Mostreu per consola l’array modificat i ordenat per ordre alfabetic. 
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
	
	String[] arrayCiutatsModificades = new String[arrayCiutats.length];	
	for(int dIdx=0;dIdx<arrayCiutats.length;dIdx++)
	{ arrayCiutatsModificades[dIdx] = arrayCiutats[dIdx].replace('a','4'); 
	}
	
	System.out.println("Ciutats Modificades per order alfabètic:"); 
	for(String ciutat : arrayCiutatsModificades)
    { System.out.println(ciutat);		
    }			

  }

	
}
