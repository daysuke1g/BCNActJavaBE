package m10;

public class Nivell1Fase3 
{
  public static void main(String[] args)
  { Nivell1Fase3 oNivell1Fase3 = new Nivell1Fase3();
    oNivell1Fase3.fase3();
  }
  
  public void fase3()
  { System.out.println("Nivell1 Fase3 ----------------------------------------------------");  
    // Amb un lamda assignar la implementacio 
    INivell1Fase3 iINivell1Fase3 = (s) -> new StringBuilder(s).reverse().toString();
    System.out.println(iINivell1Fase3.reverse("abcdefghijklmnopqrstuvwxyz"));    
  }
  
}
