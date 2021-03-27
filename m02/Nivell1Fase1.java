package m02;

public class Nivell1Fase1 
{
  public static void main(String[] args)	
  {	/*
	 Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra. 
     Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
    */ 
    char[] nom = { 'J','o','s','é',' ','L','u','i','s' }; 	
    for(char c: nom)
    { System.out.print(c);
    }
    System.out.println("");	      
  }
  
}
