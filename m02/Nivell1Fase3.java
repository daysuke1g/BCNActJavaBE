package m02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Nivell1Fase3 
{
  public static void main(String[] args)
  { 
	/*
	 *   Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.  	
	 */
	String nom = "Jose Luis sooo";  
	Map<Character,Integer> mapLLetresCnt = new HashMap<>(); //HashMap Vs Hastable:Not synchronized Vs synchronized & Null key/value Vs Not null    
	for(Character c : nom.toCharArray())    
    {  Integer intVal = mapLLetresCnt.get(c);
       if(intVal==null) // encara no existeix entrada, definir-la per primer cop
       { mapLLetresCnt.put(c,1); 
       }
       else
       { mapLLetresCnt.put(c,Integer.valueOf(intVal+1)); 
       }
    }    

	// Imprimir segons imatge a l'exercici
	Set<Entry<Character,Integer>> entrySet = mapLLetresCnt.entrySet(); // Conjunt d'entrades <K,V>
	Iterator<Entry<Character,Integer>> entryMap = entrySet.iterator(); // Iterador sobre conjunt d'entrades 
	System.out.println(nom); 
	while(entryMap.hasNext())
	{ Entry<Character,Integer> entry = entryMap.next(); 
      System.out.println("Clau='"+entry.getKey()+"', valor="+entry.getValue());
	}
	
	
  }
  
}
