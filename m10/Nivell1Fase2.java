package m10;

public class Nivell1Fase2 
{
  public static void main(String[] args)
  { Nivell1Fase2 oNivell1Fase2 = new Nivell1Fase2();
    oNivell1Fase2.fase2();
  }
  
  
  public void fase2()
  {
    System.out.println("Nivell1 Fase2 ----------------------------------------------------");    
    INivell1Fase2 iINivell1Fase2 = () -> 3.1415; // Assignar el valor a la implementacio del metode de la interface amb un lambda
    System.out.println(iINivell1Fase2.getPiValue());    
  }
  
}
