package m03;

import java.util.Scanner;

public class Nivell3Fase1 
{
	
  public static void main(String[] args)
  { 
    /*	  
	Escriviu un programa que donat un numero N retorni la seqüència de Fibonacci fins al numero N.
	La seqüència de Fibonacci és la sèrie de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
	    El número següent es troba sumant els dos números anteriors. 
    */	  
    Scanner inputScanner = new Scanner(System.in); 
	while(true)  
	{ 
      System.out.println("Introduir el número dintre de la seqüència (començant per 1) (q-sortir): ");
      String strInput = inputScanner.nextLine();
      
      if(strInput.equalsIgnoreCase("q")) { break; }

      long ldInputValue = -1;
      try { ldInputValue = Long.parseLong(strInput); }
      catch(NumberFormatException ex) { } 
    
      if(ldInputValue<=0) 
      { System.out.println("El número ha de ser >= 1 ");
        continue;
      }    
       
      System.out.print("Iteratiu "); //-- Versio calcul iteratiu   
      long ldAntVal2 = 0;
      long ldAntVal1 = 0;
      for(long ldNSeq=0,ldCurrVal=0;ldNSeq<ldInputValue;ldNSeq++)
      { if(ldNSeq<=1)  { ldCurrVal = ldNSeq; }
           else        { ldCurrVal = ldAntVal1 + ldAntVal2;  }
        ldAntVal2 = ldAntVal1; 
        ldAntVal1 = ldCurrVal;
        System.out.print(" "+ldCurrVal);        
      } 
      System.out.println("");
  
      System.out.print("Recursiu "); //-- Versio calcul recursiu  
      for(long ldNSeq=0;ldNSeq<ldInputValue;ldNSeq++)
      { System.out.print(" "+fibonacciRec(ldNSeq));
      }
      
      System.out.println("");
	}
    inputScanner.close();
	System.out.println("Sortint");       
    
  }

  public static int fibonacciRec(long ldVal)
  { if(ldVal==0)      { return 0; /* Cas base 0 */ } 
	else if(ldVal==1) { return 1; /* Cas base 1 */ }
	else              { return ( fibonacciRec(ldVal-1) + fibonacciRec(ldVal-2) ); } 
  }
	
}


