package m03;

public class Nivell1Fase4 
{
	
  public static void main(String[] args)
  { 
    /*	  
	-Creeu un nou array per cada una de les ciutats que tenim.La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).  
    -Ompliu els nous arrays lletra per lletra. 
    -Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). 
    */
    String strVar1 = "Berlin";  
    String strVar2 = "Madrid";
    String strVar3 = "Lisboa";
    String strVar4 = "Barcelona";
    String strVar5 = "Roma";
    String strVar6 = "Napoles";  
	    
	char[] arrCity1 = new char[strVar1.length()];  
	char[] arrCity2 = new char[strVar2.length()];
	char[] arrCity3 = new char[strVar3.length()];
	char[] arrCity4 = new char[strVar4.length()];
	char[] arrCity5 = new char[strVar5.length()];
	char[] arrCity6 = new char[strVar6.length()];

	for(int dIdx=0;dIdx<strVar1.length();dIdx++) { arrCity1[dIdx] = strVar1.charAt(dIdx); } 	  
	for(int dIdx=0;dIdx<strVar2.length();dIdx++) { arrCity2[dIdx] = strVar2.charAt(dIdx); }   
	for(int dIdx=0;dIdx<strVar3.length();dIdx++) { arrCity3[dIdx] = strVar3.charAt(dIdx); }   
	for(int dIdx=0;dIdx<strVar4.length();dIdx++) { arrCity4[dIdx] = strVar4.charAt(dIdx); }   
	for(int dIdx=0;dIdx<strVar5.length();dIdx++) { arrCity5[dIdx] = strVar5.charAt(dIdx); }   
	for(int dIdx=0;dIdx<strVar6.length();dIdx++) { arrCity6[dIdx] = strVar6.charAt(dIdx); }   
   
	for(int dIdx=arrCity1.length-1;dIdx>=0;dIdx--) { System.out.print(arrCity1[dIdx]); }
	System.out.println("");
	for(int dIdx=arrCity2.length-1;dIdx>=0;dIdx--) { System.out.print(arrCity2[dIdx]); }
	System.out.println("");
	for(int dIdx=arrCity3.length-1;dIdx>=0;dIdx--) { System.out.print(arrCity3[dIdx]); }
	System.out.println("");
	for(int dIdx=arrCity4.length-1;dIdx>=0;dIdx--) { System.out.print(arrCity4[dIdx]); }
	System.out.println("");
	for(int dIdx=arrCity5.length-1;dIdx>=0;dIdx--) { System.out.print(arrCity5[dIdx]); }
	System.out.println("");
	for(int dIdx=arrCity6.length-1;dIdx>=0;dIdx--) { System.out.print(arrCity6[dIdx]); }
	System.out.println("");
	

  }

	
}
