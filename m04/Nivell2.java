package m04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Nivell2 
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
    * L’exercici consisteix a mostrar per consola una carta d’un restaurant on afegirem diferents plats i 
    * després escollirem que volem per menjar. Un cop fet això s’haurà de calcular el preu del menjar el 
    * programa ens dirà amb quins bitllets hem de pagar.
    */	 
	Nivell2 objNivell2 = new Nivell2();
	
    // Nivell2Fase1: Les variables estan creades a nivell d'instancias i els arrays inicialitzats al metode. 
	objNivell2.Nivell2Fase1();

	//Nivell2Fase2
	objNivell2.Nivell2Fase2();
	
	//Nivell2Fase3
    objNivell2.Nivell2Fase3();
			  
    //Nivell2Fase1: Mostrar una posible opció de pagament  
   	objNivell2.nivell2Fase1ComPagar();
   	
  }
  
  
  /**
   * Nivell2Fase1: Implementacio requeriments
   */
  public void Nivell2Fase1()
  { //Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a 500€, haureu de crear un 
    //altre variable per guardar el preu total del menjar. 
    mBitllets5   = 0; 
    mBitllets10  = 0;
	mBitllets20  = 0;
	mBitllets50  = 0;
	mBitllets100 = 0;
	mBitllets200 = 0;
	mBitllets500 = 0;
	mPreuTotal   = 0;	  
    // Creeu dos arrays, un on guardarem el menú i un altre on guardarem el preu de cada plat.
    mPlats = new String[10];
    mPreus = new int[10];
  }
  
  
  /**
   * Nivell2Fase2:  Implementacio requeriments
   */
  public void Nivell2Fase2()
  {
	/* -Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. Afegirem el nom del plat i després el preu. 
	 *  Pots fer us de diccionaris de dades(Java HasMap).*/
	int contador=0;
	for(Map.Entry<String,Integer> entry:mPreuPlat.entrySet())
	{ mPlats[contador]   = entry.getKey();
	  mPreus[contador] = entry.getValue();
	  contador++;
    }

	Scanner inputScanner = new Scanner(System.in);
	
	mlPlatsDemanats = new ArrayList<Integer>(); // LLista de plats demanats. Variable d'instancia
	
	int dSeguirMenjant = 1;
	while(dSeguirMenjant==1) // seguir demanant
	{ 
	  while(true) // Mostrar plats + Input plat (correctament) + Finalitza 
	  { mostrarPlatsMenu(); // Mostrar els arrays plats + preus
	  
	    System.out.println("Esculli plat. (0-Finalitza)");
	    
	    /*
	     * __NIVELL2__	
	     * Exercici: Revisaràs l'exercici anterior modificant-lo per afegir noves excepcions més adients.  
	     * -Modifica la revisió de la comanda, si un usuari introdueix un plat que no existeix, inmediatament 
	     *  executa una excepció per avisar que el producte no existeix y no l’afageixis a la llista.  
	     */	    	    
	    int dValInput = -1;
	    String strInput="";
	    try
	    { strInput = inputScanner.nextLine();
          dValInput = Integer.parseInt(strInput);
          if( (dValInput<=-1) || (dValInput>mPlats.length) ) 
          { throw new Exception("El plat "+dValInput+" no es plat valid de la llista ni cap opció de selecció.");
   		  }
	    }
	    catch(NumberFormatException nfe) 
	    { System.out.println("EXCEPCIO: El plat " + strInput + " no es un plat valid de la llista.");
          continue;
	    }	    
	    catch(Exception ex)
	    { System.out.println("EXCEPCIO: "+ex.getMessage());
          continue;
	    }
        if(dValInput==0) { break; } // amb 0 Finalitzar input de dades 
          else mlPlatsDemanats.add(dValInput-1); // Sino guardar el numero de pla,,,podria no estar a la llista
        
	  }
	  
	  dSeguirMenjant = seguirMenjat(inputScanner);	// Ret:[0|1] - Pregunta/Respota "Seguir Menjant 0-No/1-Si"  
	}	
	inputScanner.close();      
  }
  
  /**
   * Nivell2Fase3 :Implementacio requeriments   
   */
  private void Nivell2Fase3()
  {
    //- Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb l’array que hem fet al principi. 
	//  En el cas que la informació que hem introduït a la List coincideixi amb la del array, haurem de sumar el 
	//  preu del producte demanat; en el cas contrari haurem de mostrar un missatge que digui que el producte que 
	//  hem demanat no existeix. 
    //Recomanacions: has de validar que les dades introduïdes per consola compleixen els requeriments de format i
	//               extensió per mitjà del control d'excepcions de Java.
    mPreuTotal = 0;	  
    for(Integer idxNumPlat:mlPlatsDemanats)
    { if( (idxNumPlat<0) || (idxNumPlat>=mPlats.length) ) 
      { System.out.println("El plat número " + (idxNumPlat+1) + " no existeix al menu.");
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
      String strInput = "";
      /*
       * __NIVELL2__
       * Crea una Excepció per la pregunta Si/No al seguir demanant e implementala. 
       */	      
      try
      { strInput = inputScanner.nextLine();
        seguirMenjant = Integer.parseInt(strInput);
        if( (seguirMenjant==0) || (seguirMenjant==1) ) 
        { break;    	  
        }  
        else
        { throw new Exception("La opció "+strInput+" no es una entrada valida.");
        }
      }
      catch(NumberFormatException nfe)  
      { System.out.println("EXCEPCIO: La opció "+strInput+" no es una entrada valida.");
    	continue; 
      }
      catch(Exception ex)
      { System.out.println("EXCEPCIO: "+ex.getMessage());
        continue;
      }
    } 
	return seguirMenjant;
  } // end private int seguirMenjat(...


  /**
   * Mostra una posible forma de pagar. L'estrategia es propossar el minim nombre de bitllets.
   * Tambe motra el canvi a rebre
   */
  public void nivell2Fase1ComPagar()
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


