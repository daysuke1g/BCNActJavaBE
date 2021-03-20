package m01;

public class Nivell3Fase1 
{
  /*
  Declara un array de numeros int e inicialitzala amb valors del 1 al 10
  Rota l’array sense utilitzar un array auxiliar ni llibreries. Pots utilizar una variable auxiliar.
  */  
  public static void main(String[] args)
  { 
    int[] array = { 1,2,3,4,5,6,7,8,9,10 };
    
    for(int idx=0;idx<array.length;idx++)
    { System.out.print(array[idx]+" ");
    }
    System.out.println("");
    
    for(int idx=0;idx<array.length/2;idx++)
    { int swapVar=array[idx];
      array[idx] = array[array.length-(idx+1)];
      array[array.length-(idx+1)] = swapVar;
    }
    
    for(int idx=0;idx<array.length;idx++)
    { System.out.print(array[idx]+" ");
    }    
  }
  
  
}
