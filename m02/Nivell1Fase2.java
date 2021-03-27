package m02;

import java.util.ArrayList;
import java.util.List;

public class Nivell1Fase2 
{

  public static void main(String[] args)
  {
    /*
      Canvia la taula per una llista (List<Character>) 
      Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
      Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’. 
     */
     List<Character> lNom = new ArrayList<>();
     for(char c : "Jose Luis".toCharArray()) //De String("") a char[](.toCharArray()) i bucle sobre l'array   
     { lNom.add(c); // Autoboxing char -> Character 
     }
     
     for(Character c: lNom)
     { char clc = Character.toLowerCase(c); // a minuscula
       if((clc=='a')||(clc=='e')||(clc=='i')||(clc=='o')||(clc=='u'))
       { System.out.print(c+" VOCAL");
       }
       else
       { if(clc!=' ') System.out.print(c+" CONSONANT");    	   
       }
       System.out.println("");	
     }                
	 	  
  } 
  
}
