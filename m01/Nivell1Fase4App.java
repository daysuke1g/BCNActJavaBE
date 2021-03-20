package m01;

public class Nivell1Fase4App 
{
  /*
  Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data de naixement separada per “/” (tot en una variable).
  Mostreu per consola les variables del nom complet, la data de naixement i si l’any de naixement es de traspàs o no.
  Ex:
  El meu nom és Nom Cognom1 Cognom2 
  Vaig néixer el dd/mm/yyyy
  El meu any de naixement [no] és de traspàs.
  */  
  private String nom;	
  private String cognom1;	
  private String cognom2;	
	
  private int   dia;	
  private int   mes;	
  private int   any;	
  
  public static void main(String[] args)
  { Nivell1Fase4App oApp = new Nivell1Fase4App("José Luis","Cognom1","Cognom2",2,2,1973);	  
    oApp.procesa();
  }
  
  public Nivell1Fase4App(String nom,String cognom1,String cognom2,int dia,int mes,int any)
  { this.nom     = nom;	
    this.cognom1 = cognom1;	
    this.cognom2 = cognom2;
	this.dia     = dia;
	this.mes    = mes;
	this.any    = any;	   
  }
  
  public void procesa()
  {
	java.text.DecimalFormat df = new java.text.DecimalFormat("00");
	    
	String nomComplert = nom + " " + cognom1 + " " + cognom2; 
    String dataNaix    = df.format(dia) + "/" + df.format(mes) + "/" + any;

    System.out.println("El meu nom és "+nomComplert);  
    System.out.println("Vaig neixer el "+dataNaix);	
    System.out.println("El meu any de naixement "+((any%4==0)?"si":"no")+" és de traspas.");
  }
  
}
