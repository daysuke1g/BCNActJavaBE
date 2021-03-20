package m01;

public class Nivell1Fase1App 
{
  /*
   Nivell 1 - Fase 1
   Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
   Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
   Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
   Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
  */
  private String nom     = null;	
  private String cognom1 = null;	
  private String cognom2 = null;	
	
  private int    dia     = 0;	
  private int    mes     = 0;	
  private int    any     = 0;
  
  public static void main(String[] args)
  { Nivell1Fase1App oApp = new Nivell1Fase1App();	  
    oApp.mostra();
  }
	
  public Nivell1Fase1App()
  { nom     = "José Luis";	
    cognom1 = "Cognom1";	
	cognom2 = "Cognom2";	
	dia = mes = 2;
    any    = 1973;	
  }
  
  public void mostra()
  {	System.out.println(cognom1+" "+cognom2+" "+nom+" "+Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(any));  
  }
    
	
}
