package m02;

public class Nivell2Fase1 
{

  public static void main(String[] args)
  {
	/*Crea una aplicaci� que dibuixi una escala de nombres, 
	  sent cada l�nia nombres comen�ant en un i acabant en 
	  el nombre de la l�nia. Aquest �s un exemple, si introdu�m un 5 com a al�ada: 
	 */ 
    int dNombre = 5;
    for(int dIdy=1;dIdy<=dNombre;dIdy++)
    { for(int dIdx=1;dIdx<=dIdy;dIdx++)
      { System.out.print(dIdx);
      }
      System.out.println("");
    }

    /*
     Crea una aplicaci� que dibuixi una pir�mide invertida de asteriscs. Nosaltres li
      vam passar l'altura de la pir�mide per teclat. Aquest �s un exemple:  
     */
    int dAltura = 9;
    for(int dIdy=dAltura;dIdy>=1;dIdy--)
    { for(int dIdy2=dAltura-dIdy;dIdy2>0;dIdy2--) {  System.out.print(" "); }
      for(int dIdx=1;dIdx<=((dIdy*2)-1);dIdx++)
      { System.out.print("*");
      }
      System.out.println("");
    }    
	  
	  
  } 
	
}
