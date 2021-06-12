package m10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nivell3 
{ private static List<Alumne> lAlumnes ;


  //Crea una clase Alumne que tingui com a propietats: Nom, edat, curs i nota. 
  //Omple la llista amb 10 alumnes. 
  static 
  { lAlumnes = new ArrayList<Alumne>();
    lAlumnes.add(new Alumne("Jordi",16,"JAVA",4));  
    lAlumnes.add(new Alumne("Miquel",41,"JAVA",8));
    lAlumnes.add(new Alumne("ana",17,"JAVA",9));  
    lAlumnes.add(new Alumne("Sonia",43,"JAVA",3));
    lAlumnes.add(new Alumne("albert",17,"PHP",4));  
    lAlumnes.add(new Alumne("Eduard",44,"PHP",5));
    lAlumnes.add(new Alumne("Monica",45,"PHP",10));  
    lAlumnes.add(new Alumne("Carles",46,"PHP",2));    
    lAlumnes.add(new Alumne("Ferran",47,"JAVA",7));  
    lAlumnes.add(new Alumne("Francesc",48,"PYTHON",9));    
  }
  
  
  public static void main(String[] args)
  { Nivell3 oNivell3 = new Nivell3();
    oNivell3.test();
  }
  
  public void test()
  {

    System.out.println("Nivell3 Exercici 1: ----------------------------------------------------");
    //Mostra per pantalla el nom i l’edat de cada alumne. 
    lAlumnes.stream()  // Convertir la llista a stream
              .forEach( a -> System.out.println("Nom : " + a.getNom() + " Edat:" + a.getEdat()) ); //Imprimir
    
    
    System.out.println("Nivell3 Exercici 2: ----------------------------------------------------");
    //Filtra la llista per tots els alumnes que el nom comensi per “a”, asigna-ho
    //a un altre llista y mostra per pantalla la nova llista (tot amb lambdas)
    lAlumnes.stream()  // Convertir la llista a stream
            .filter( a -> a.getNom().charAt(0) == 'a' ) // filtrar el que el nom comenci per 'a'
            .collect(Collectors.toList()) // stream<String> to List<String>
            .forEach( a -> System.out.println(a) ); //Imprimir    
    
    
    System.out.println("Nivell3 Exercici 3: ----------------------------------------------------");
    //Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota. 
    lAlumnes.stream()  // Convertir la llista a stream
            .filter( a -> a.getNota() >= 5 ) // filtrar els que tinguin una nota >= 5 
            .forEach( a -> System.out.println(a) ); //Imprimir    
    
    
    System.out.println("Nivell3 Exercici 4: ----------------------------------------------------");
    //Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota y que no siguin de PHP.  
    lAlumnes.stream()  // Convertir la llista a stream
            .filter( a -> a.getNota() >= 5 && !a.getCurs().equalsIgnoreCase("PHP")) // filtrar nota >= 5 i curs != PHP  
            .forEach( a -> System.out.println(a) ); //Imprimir    
    
    
    System.out.println("Nivell3 Exercici 5: ----------------------------------------------------");
    //Mostra tots els alumnes que facin JAVA i siguin majors d’edat. 
    lAlumnes.stream()  // Convertir la llista a stream
            .filter( a -> a.getCurs().equalsIgnoreCase("JAVA") && a.getEdat()>=18 ) // filtrar curs==JAVA i edad >= 18  
            .forEach( a -> System.out.println(a) ); //Imprimir    
    
    
  }
  
  
  
}
