package m01;

public class Nivell1Fase2App 
{
  /*
   Nivell 1 - Fase 2
   Sabent que l’any 1948 es un any de traspàs:
   Creeu una constant amb el valor de l’any (1948).
   Creeu una variable que guardi cada quan hi ha un any de traspàs
   Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
   Mostreu per pantalla el resultat del càlcul.
  */
  
  private final int ANY_TRAPAS_INICIAL = 1948;	
  private int   frequencia;	
  private int   anyNaix;	
  
  public static void main(String[] args)
  { Nivell1Fase2App oApp = new Nivell1Fase2App();	  
    oApp.calcula();
  }
  
  public Nivell1Fase2App()
  { frequencia = 4;
	anyNaix = 1973;	   
  }
  
  public void calcula()
  {	int numAnysTraspas = 0;
    for(int anyAct=ANY_TRAPAS_INICIAL;anyAct<=anyNaix;anyAct+=frequencia)
    { numAnysTraspas++;
    }
	System.out.println("Entre "+Integer.toString(ANY_TRAPAS_INICIAL)+" i "+Integer.toString(anyNaix)+" hi han "+Integer.toString(numAnysTraspas)+" anys de traspàs");  
  }
  
}
