package m01;

public class Nivell2Fase1App 
{
  /*
  Declara una variable double. Assigna-li un valor amb 4 decimals
  Declara variables de tipus: int, float i string
  Fes un "cast" de la variable double a cada una de les variables que has creat anteriorment per inicialitzar-les i pinta-les per pantalla.
  */  
	
  public static void main(String[] args)
  { 
    double doubleVal = 3.1416;
    int    intVal    = (int)doubleVal;
    float  floatVal  = (float)doubleVal;
    String stringVal = Double.toString(doubleVal);
    
    System.out.println(doubleVal+" double");
    System.out.println(intVal   +" int");
    System.out.println(floatVal +" float");
    System.out.println(stringVal+" string");
	  
  }
  
  
}
