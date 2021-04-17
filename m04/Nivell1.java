package m04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Nivell1 
{ 
  int mBitllets5   = 0; 
  int mBitllets10  = 0;
  int mBitllets20  = 0;
  int mBitllets50  = 0;
  int mBitllets100 = 0;
  int mBitllets200 = 0;
  int mBitllets500 = 0;
  
  int mPreuTotal   = 0;

  String mPlats[];
  int    mPreus[];  
  
  List<Integer> mlPlatsDemanats = null;
  

  // LLista de plats amb preus
  static final HashMap<String,Integer> mPreuPlat;
  static 
  { mPreuPlat = new HashMap<String,Integer>();
    mPreuPlat.put("Bufalina",12);
    mPreuPlat.put("4 Formaggi",12);
    mPreuPlat.put("Pino Daniele",18);
    mPreuPlat.put("Margherita",9);
    mPreuPlat.put("Prosciutto",10);
    mPreuPlat.put("Parmiggiana",11);
    mPreuPlat.put("Al Tonno",13);
    mPreuPlat.put("Carbonara",11);
    mPreuPlat.put("Massimo Troise",17);
    mPreuPlat.put("Ortolana",12);
  }
  
  
  public static void main(String[] args)
  {
   /*
    * L�exercici consisteix a mostrar per consola una carta d�un restaurant on afegirem diferents plats i 
    * despr�s escollirem que volem per menjar. Un cop fet aix� s�haur� de calcular el preu del menjar el 
    * programa ens dir� amb quins bitllets hem de pagar.
    */	 
	Nivell1 objNivell1 = new Nivell1();
	
    // Nivell1Fase1: Les variables estan creades a nivell d'instancias i els arrays inicialitzats al metode. 
	objNivell1.nivell1Fase1();

	//Nivell1Fase2
	objNivell1.nivell1Fase2();
	
	//objNivell1.mostrarPlatsDemanats();
	
	//Nivell1Fase3
    objNivell1.nivell1Fase3();
			  
    // Nivell1Fase1: Mostrar una posible opci� de pagament  
   	objNivell1.nivell1Fase1ComPagar();
    
  }
  
  
  /**
   * Nivell1Fase1: Implementacio requeriments 
   */
  public void nivell1Fase1()
  { //Creeu una variable int per cada un dels bitllets que existeixen des de 5� a 500�, haureu de crear un 
    //altre variable per guardar el preu total del menjar. 
    mBitllets5   = 0; 
    mBitllets10  = 0;
	mBitllets20  = 0;
	mBitllets50  = 0;
	mBitllets100 = 0;
	mBitllets200 = 0;
	mBitllets500 = 0;
	mPreuTotal   = 0;	  
    // Creeu dos arrays, un on guardarem el men� i un altre on guardarem el preu de cada plat.
    mPlats = new String[10];
    mPreus = new int[10];
  }
  
  
  /**
   * Nivell1Fase2:Implementacio requeriments
   */
  public void nivell1Fase2()
  {
	/* -Amb un bucle for haurem d�omplir els dos arrays anteriorment creats. Afegirem el nom del plat i despr�s el preu. 
	 *  Pots fer us de diccionaris de dades(Java HasMap).*/
	int contador=0;
	for(Map.Entry<String,Integer> entry:mPreuPlat.entrySet())
	{ mPlats[contador]   = entry.getKey();
	  mPreus[contador] = entry.getValue();
	  contador++;
    }

    /*	
	 -Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, guardarem la informaci� en 
	  una List fent servir un bucle while.
     -Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), per tant haureu 
	  de crear un altre variable int per guardar la informaci�. 
    */

	Scanner inputScanner = new Scanner(System.in);
	
	mlPlatsDemanats = new ArrayList<Integer>(); // LLista de plats demanats. Variable d'instancia
	
	int dSeguirMenjant = 1;
	while(dSeguirMenjant==1) // seguir demanant
	{ 
	  while(true) // Mostrar plats + Input plat (correctament) + Finalitza 
	  { mostrarPlatsMenu(); // Mostrar els arrays plats + preus
	  
	    System.out.println("Esculli plat. (0-Finalitza)");
	    String strInput = inputScanner.nextLine();
        int dValInput = -1;
        try { dValInput = Integer.parseInt(strInput);  }
        catch(NumberFormatException nfe) { dValInput = -1; }
      
        if(dValInput<=-1) { continue; } // si input de dades incorrecte repetir input 
      
        if(dValInput==0) { break; } // amb 0 Finalitzar input de dades 
           else mlPlatsDemanats.add(dValInput-1); // Sino guardar el numero de pla,,,podria no estar a la llista        
	  }
	  
	  dSeguirMenjant = seguirMenjat(inputScanner);	// Ret:[0|1] - Pregunta/Respota "Seguir Menjant 0-No/1-Si"  
	}	
	inputScanner.close();      
  }
  
  /**
   * Nivell1Fase3:Implementacio requeriments   
   */
  private void nivell1Fase3()
  {
    //- Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l�array que hem fet al principi. 
	//  En el cas que la informaci� que hem introdu�t a la List coincideixi amb la del array, haurem de sumar el 
	//  preu del producte demanat; en el cas contrari haurem de mostrar un missatge que digui que el producte que 
	//  hem demanat no existeix. 
    //Recomanacions: has de validar que les dades introdu�des per consola compleixen els requeriments de format i
	//               extensi� per mitj� del control d'excepcions de Java.
    mPreuTotal = 0;	  
    for(Integer idxNumPlat:mlPlatsDemanats)
    { if( (idxNumPlat<0) || (idxNumPlat>=mPlats.length) ) 
      { System.out.println("El plat n�mero " + (idxNumPlat+1) + " no existeix al menu.");
      }
      else
      { System.out.println("El plat " + (idxNumPlat+1) + "-"+mPlats[idxNumPlat]+" costa "+mPreus[idxNumPlat]);
        mPreuTotal += mPreus[idxNumPlat];
      }
    }
    System.out.println("El cost total es de " + mPreuTotal);
    
  }
    
  /**
   * Mostra la llista de plats del menu amb el preu corresponent 
   */
  public void mostrarPlatsMenu()
  { System.out.println("Plats del menu:");
    for(int dIdx=0;dIdx<mPlats.length;dIdx ++)
    { System.out.println((dIdx+1) + "-" + mPlats[dIdx] + " - " + mPreus[dIdx]+" Eur.");    	
    }
  }
  
  /**
   * Pregunta si vols seguir demanant plats
   * @param inputScanner
   * @return 0 / 1
   */
  private int seguirMenjat(Scanner inputScanner)
  { int seguirMenjant = -1;
    while(true) // 
    { System.out.println("Seguir Menjant? ((1:Si / 0:No)");
      String strInput = inputScanner.nextLine();
      try { seguirMenjant = Integer.parseInt(strInput);  }
      catch(NumberFormatException nfe)  { continue; }
      if( (seguirMenjant==0) || (seguirMenjant==1) ) 
      { break;    	  
      }
    } 
	return seguirMenjant;
  } // end private int seguirMenjat(...


  /**
   * Mostra una posible forma de pagar. L'estrategia es propossar el minim nombre de bitllets.
   * Tambe motra el canvi a rebre
   */
  public void nivell1Fase1ComPagar()
  { if (mPreuTotal<=0) { return ; } 
	int importPendent = mPreuTotal;
    while(importPendent>0)
    { if(importPendent>=500)      { mBitllets500++; importPendent-=500; }
      else if(importPendent>=200) { mBitllets200++; importPendent-=200; }
      else if(importPendent>=100) { mBitllets100++; importPendent-=100; }
      else if(importPendent>=50)  { mBitllets50++;  importPendent-=50; }
      else if(importPendent>=20)  { mBitllets20++;  importPendent-=20; }
      else if(importPendent>=10)  { mBitllets10++;  importPendent-=10; }
      else                        { mBitllets5++;   importPendent-=5; }
    }
    int canvi = 0 - (importPendent);
    
    System.out.println("Pots pagar amb :");
    if(mBitllets500>0) { System.out.println(mBitllets500 + " bitllet/s de 500"); }
    if(mBitllets200>0) { System.out.println(mBitllets200 + " bitllet/s de 200"); }
    if(mBitllets100>0) { System.out.println(mBitllets100 + " bitllet/s de 100"); }
    if(mBitllets50>0)  { System.out.println(mBitllets50  + " bitllet/s de 50"); }
    if(mBitllets20>0)  { System.out.println(mBitllets20  + " bitllet/s de 20"); }
    if(mBitllets10>0)  { System.out.println(mBitllets10  + " bitllet/s de 10"); }
    if(mBitllets5>0)   { System.out.println(mBitllets5   + " bitllet/s de 5"); }
    if(canvi>0)        { System.out.println("Retornem : "+ canvi +" Euros"); }  
	
  }
  

  
}


