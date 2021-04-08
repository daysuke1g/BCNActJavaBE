package m03;

import java.util.Scanner;

public class Nivell2Fase1 
{
	
  public static void main(String[] args)
  { 
    /*	  
	-En aquest exercici crearàs un array bidimensional on introduiràs 3 notes per a 5 alumnes. 
	           Es calcularà la nota mitjana de cada alumna i s'indicarà si han suspès o no. 
    -Crea un array bidimensional capaç de guardar 3 notes de 5 alumnes. 
    -Omple l’array amb un bucle demanant els valors per pantalla (nota entre 0 i 10), has d’identificar per pantalla quan 
           és una agrupació d’un alumne nou .
    -Recorre l'array, fes la Mitjana aritmètica de les 3 notes i indica si l'alumne ha aprovat o suspès 
    */	  
	int numAlumnes = 5;
	int numNotes = 3;
    Scanner inputScanner = new Scanner(System.in); 
    int[][] arrAlumnesNotes = new int[numAlumnes][numNotes];
    boolean bContinua=true;
    
	for(int idAlu=0;(idAlu<arrAlumnesNotes.length)&&(bContinua==true);idAlu++) //Bucle lectura alumnes [0...Alumne-1]
	{ for(int idNota=0;(idNota<arrAlumnesNotes[idAlu].length)&&(bContinua==true);idNota++) //Bucle lectura Notes x alumne [0...Nota-1]
	  { int dNota=-1;
	    //-- Això hauria d'anar a un métode !!!! .. Ho deixo aquí per visualització en linea del codi
	    //-- Bucle infinit que controla input de nota X d'alumne Y. 
	    //-- Condicions de sortida: 1-caracter 'q' -> sol·licitud sortida explicita
	    //--                        2-Inputació nota correcta: valor entre 0 i 10 
		while(true)
	    { System.out.println("Alumne "+(idAlu+1)+" Introdueix Nota "+(idNota+1)+" (q atura ):");
		  String strInput = inputScanner.nextLine();
		  if(strInput.equalsIgnoreCase("q")) // Sortir i aturar proces
		  { bContinua=false;
			break; // <----- Sol·licitud explicita de sortida
		  }
          try 
          { dNota = Integer.parseInt(strInput);
            if( (dNota>=0) && (dNota<=10) )
            { arrAlumnesNotes[idAlu][idNota] = dNota;
              break; // <---- Nota correcta: sortida  
            }
            System.out.println("Valor de nota incorrecta ");
          }
          catch(NumberFormatException ex) 
          { System.out.println("Valor de nota incorrecta. Introdueixi de nou. ");
          }
	    } //end while-- FIN Bucle que controla input de notaX d'alumneY
		
	  }
	}
	inputScanner.close(); 

	if(bContinua==false)
	{ System.out.print("Finalizant");
	  System.exit(1);		
	}
	
	//--Recorre l'array, fes la Mitjana aritmètica de les 3 notes i indica si l'alumne ha aprovat o suspès
	for(int idAlu=0;idAlu<arrAlumnesNotes.length;idAlu++)
	{ int sumaNotes=0;
      for(int idNota=0;(idNota<arrAlumnesNotes[idAlu].length)&&(bContinua==true);idNota++)		 
	  { sumaNotes += arrAlumnesNotes[idAlu][idNota];
	  }
      float fNotaMitjana = ((float)sumaNotes/arrAlumnesNotes[idAlu].length);
      System.out.println("Alumne "+idAlu+" amb nota mitjana "+fNotaMitjana+" "+((fNotaMitjana>=5)?"APROVAT":"SUSPES"));      
	}
	
	System.out.print("Sortint .... ");
		
  }

	
}
