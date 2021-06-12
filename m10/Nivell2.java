package m10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Nivell2 
{
  private String[][] mArrNomsNums = 
      { { "ana","Pep","pep","elvira","Francesc Xavier","Josep","Ana","Jordi","Manel","Cristina","Monica","Pau","Joan","Eva",
          "Pere", "Walker", "walker","Carlos","Carles", "LLuis","eduard","Arnau","Igor","David","Pedro","Hector"} , 
        { "3","44","9876342628","23432","23","457654","8368901","111","11","22","222","333.989" } 
      };
  
  
  public static void main(String[] args)
  { Nivell2 oNivell2 = new Nivell2();
    oNivell2.test();
  }
  
  public void test()
  { 
    
    System.out.println("Nivell2 Exercici 1: ----------------------------------------------------");
    //Ordenar per longitud (de més curta a més llarga) 
    Stream.of(mArrNomsNums)     // Convertir a Stream<String[]>
          .flatMap(Stream::of)  // Aplanar les dues dimenension en una Stream<String>
          .sorted( (a, b) -> a.length() - b.length()) // Ordernar comparant per les longituds
          .forEach(System.out::println);   //Imprimir resultat    
    
    
    System.out.println("Nivell2 Exercici 2: ----------------------------------------------------");
    //Ordenar per longitud inversa (de  més llarga a més curta) 
    Stream.of(mArrNomsNums)     // Convertir a Stream<String[]>
          .flatMap(Stream::of)  // Aplanar les dues dimenension en una Stream<String>
          .sorted(Comparator.comparing(String::length).reversed()) // Ordernar comparant per les longituds i despres reversed
          .forEach(System.out::println);   //Imprimir resultat    
    
    
    System.out.println("Nivell2 Exercici 3: ----------------------------------------------------");
    //Ordenar alfabeticament pel primer caràcter (Nota: charAt (0) retorna el codi numèric del primer caràcter)
    Stream.of(mArrNomsNums)     // Convertir a Stream<String[]>
          .flatMap(Stream::of)  // Aplanar les dues dimenension en una Stream<String>
          .sorted(Comparator.comparing( s -> s.charAt(0) )) // Ordernar comparant pel primer caracter del String
          .forEach(System.out::println);   //Imprimir resultat     
    
    
    System.out.println("Nivell2 Exercici 4: ----------------------------------------------------");
    //Ordenar per les cadenes que contenen "e" primer, tota la resta en segon lloc. De moment, poseu el codi directament a la lambda.     
    Stream.of(mArrNomsNums)     // Convertir a Stream<String[]>
          .flatMap(Stream::of)  // Aplanar les dues dimenension en una Stream<String>
          .sorted(Comparator.comparing( s -> !s.contains("e") )) // Ordernar comparant si tenen e, 
          .forEach(System.out::println);   //Imprimir resultat 
    
    
    System.out.println("Nivell2 Exercici 5: ----------------------------------------------------");
    //Modifica tots els elements de la matriu per canviar els caracters “a” a “4”      
    Stream.of(mArrNomsNums)     // Convertir a Stream<String[]>
          .flatMap(Stream::of)  // Aplanar les dues dimenension en una Stream<String>
          .map( s -> s.replace('a','4') ) //Remplaçar a per 4 
          .forEach(System.out::println);   //Imprimir resultat 
    

    System.out.println("Nivell2 Exercici 6: ----------------------------------------------------");
    //Mostra només els elements que siguin 100% numerics. (tot i que estigui guardats com strings)      
    Stream.of(mArrNomsNums)     // Convertir a Stream<String[]>
          .flatMap(Stream::of)  // Aplanar les dues dimenension en una Stream<String>
          .filter( a -> { try { double d = Double.parseDouble(a); return true; } 
                          catch (NumberFormatException nfe) { return false; }
                        } )
          .forEach(System.out::println);   //Imprimir resultat 
    
    
    System.out.println("Nivell2 Exercici 7: ----------------------------------------------------");
    //Crea una Functional Interface que continga un mètode abstracte operacio (), que retorne un valor float;
    //injecta a la interfície creada mitjançant una lambda el cos del mètode, de manera que pugis transformar la 
    //operació a una suma, resta, multiplicació i divisio. 
    INivell2 iINivell2 = (a,b) -> a + b; 
    System.out.println("Suma (operacio(7,3):"+iINivell2.operacio(7,3));
    iINivell2 = (a,b) -> a - b; 
    System.out.println("Resta (operacio(7,3):"+iINivell2.operacio(7,3));    
    iINivell2 = (a,b) -> a * b; 
    System.out.println("Multiplicacio (operacio(7,3):"+iINivell2.operacio(7,3));
    iINivell2 = (a,b) -> a / b; 
    System.out.println("Divisio (operacio(7,3):"+iINivell2.operacio(7,3));

   
  }

}
