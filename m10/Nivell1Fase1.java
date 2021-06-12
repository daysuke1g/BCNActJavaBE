package m10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nivell1Fase1 
{
  private String[] mArrNoms1 = { "ana","Pep","pep","Josep","Ana","Jordi","Manel","Cristina","Monica","Pau","Joan","Eva",
                                 "Pere", "Carlos","Carles", "LLuis","Arnau","Igor","David","Pedro","Hector"} ;
  private String[] mArrNums1 = { "3","44","23432","23","457654","8368901","111","11","22","222" } ;
  
  private String[] mArrMesos = { "Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre" } ;
  
  
  public static void main(String[] args)
  { Nivell1Fase1 oNivell1 = new Nivell1Fase1();
    oNivell1.fase1();
  }
  
  
  public void fase1()
  { 
    
    System.out.println("Nivell1 Fase1 Exercici 1: ----------------------------------------------------");
    //Tenint una llista de cadenes de noms propis, escriu un mètode que retorne 
    //una llista de totes les cadenes que comencen amb la lletra 'a' (mayuscula)     
    //i tenen exactament 3 lletres. Imprimeix el resultat.    
    List<String> llistaNoms = fase1Exercici1(Arrays.asList(mArrNoms1));
    llistaNoms.stream()  // Convertir la llista a stream
              .forEach( a -> System.out.println(a) );   //Imprimir resultat

    
    System.out.println("Nivell1 Fase1 Exercici 2: ----------------------------------------------------");    
    //Escriu un mètode que retorne una cadena separada per comes basada en una 
    //llista d’Integers. Cada element hauria d'anar precedit per la lletra "e" 
    //si el nombre és parell, i precedit de la lletra "o" si el nombre és imparell. 
    //Ex:si la llista d'entrada és (3,44),la sortida hauria de ser "o3, e44". Imprimeix el resultat.        
    String strResultat = fase1Exercici2(Arrays.asList(mArrNums1));    
    System.out.println(strResultat); // Ajuntar elements en un string
    
    
    System.out.println("Nivell1 Fase1 Exercici 3: ----------------------------------------------------");
    //Tenint una llista de Strings, escriu un mètode que retorne una llista de 
    //totes les cadenes que continguen la lletra ‘o’ i imprimeix el resultat.
    List<String> llistaStr = fase1Exercici3(Arrays.asList(mArrNoms1));    
    llistaStr.stream()  // Convertir la llista a stream
             .forEach( System.out::println ); // Imprimir 

    
    System.out.println("Nivell1 Fase1 Exercici 4: ----------------------------------------------------");
    //Has de fer el mateix que en el punt anterior, però retornant una llista 
    //que incloga els elements amb més de 5 lletres. Imprimeix el resultat.  
    llistaStr = fase1Exercici4(Arrays.asList(mArrNoms1));    
    llistaStr.stream()  // Convertir la llista a stream
             .forEach( System.out::println ); // Imprimir    
    
    
    System.out.println("Nivell1 Fase1 Exercici 5: ----------------------------------------------------");
    //Crea una llista amb els nombs dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda. 
    Arrays.asList(mArrMesos).stream().forEach(a -> System.out.println(a));
    
    
    System.out.println("Nivell1 Fase1 Exercici 6: ----------------------------------------------------");
    //Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference. 
    Arrays.asList(mArrMesos).stream().forEach(System.out::println);
    
  }
  
  
  //Retorna una llista amb els strings de longitud 3 que comencen per A   
  public List<String> fase1Exercici1(List<String> llistaNoms)
  { return 
       llistaNoms.stream()  // Convertir la llista a stream
                 .filter( a ->  a.length()==3 && a.charAt(0)=='A' ) // Filtre cadenes long==3 y comencen per A
                 .collect(Collectors.toList());  //Convertir a llista
  }

  //Retorna un string amb el numeros de la llista separats per ',' on als nombres parells s'ha concatenat 
  //per davant 'e' i als senars 'a' 
  public String fase1Exercici2(List<String> llistaNums)
  { return llistaNums.stream() // Convertir a stream
                     .map( a -> ( Integer.parseInt(a) % 2 == 0 ) ? "e"+a : "o"+a ) // Aplicar conversio
                     .collect(Collectors.joining(",")); // ajuntar separant per ','
  }
  
  
  //Donada una llista de string retorna una llista de strings amb aquelles cadenes que contenen la 'o'
  //amb una longitut de mes de 5 lletres 
  public List<String> fase1Exercici3(List<String> llistaStrings)
  { return llistaStrings.stream()  // Convertir la llista a stream
                         .filter( a -> a.contains("o")  ) // Filtre 
                         .collect(Collectors.toList());  //Convertir a llista
  }

  //Donada una llista de string retorna una llista de strings amb aquelles cadenes que contenen la 'o'

  public List<String> fase1Exercici4(List<String> llistaStrings)
  { return llistaStrings.stream()  // Convertir la llista a stream
                         .filter( a -> a.contains("o") && a.length() > 5 ) // Filtre 
                         .collect(Collectors.toList());  //Convertir a llista
  }
  
  
}
