package m01;

public class Nivell1Fase3App 
{
  /*
  Fase 3
  Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins arriba al vostre any de naixement.
  ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la
  Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa si no ho és.
  En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de ser falsa mostrareu la frase pertinent. 
  Creeu dues variables string per guardar les frases.
  */  
  private int   any_traspas;	
  private int   frequencia;	
  private int   anyNaix;	
  
  public static void main(String[] args)
  { Nivell1Fase3App oApp = new Nivell1Fase3App();	  
    oApp.calcula();
  }
  
  public Nivell1Fase3App()
  { any_traspas = 1948;
	frequencia = 4;
	anyNaix = 1973;	   
  }
  
  public void calcula()
  {	boolean es_any_traspas=false; 
    for(;any_traspas<=anyNaix;any_traspas+=frequencia)
    { if(any_traspas==anyNaix) { es_any_traspas=true; }
      // System.out.println("Any traspàs : "+Integer.toString(any_traspas));    	    	
    }
    
    String frase;
    if(es_any_traspas) { frase = "L'any "+Integer.toString(anyNaix)+" si es de traspàs.";     }
            else       { frase = "L'any "+Integer.toString(anyNaix)+" no es de traspàs.";  }
	System.out.println(frase);  
	
  }
  
}
