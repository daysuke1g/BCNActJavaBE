package m02;

public class Nivell3Fase1 
{
   public static void main(String[] args)
   {  
	  /*
	   * En aquest exercici es proposa un exercici complex de comprovacions i bucles per crear un 
	   * rellotge digital que mostra l'hora sense parar. A més té un segon d'espera per més realisme. 
	   * Només necessites 3 variables int (hour, minutes, seconds) El rellotge ha de tenir 6 dígits 
	   * en tot moment: 00:00:00 L’aplicació no ha de finalitzar mai. 
	   *  Per que el rellotge trigui un segon has d’implementar:  Thread.sleep(1000);  	
	   */
      java.text.DecimalFormat df = new java.text.DecimalFormat("00");
      
      int hour,minutes,seconds; 		
	   
      hour=minutes=seconds=0;
      while(true)
      { String display = df.format(hour) + ":" + df.format(minutes) + ":" + df.format(seconds); 
	    System.out.println(display);
    	
	    try	{ Thread.sleep(1000); }
    	catch(InterruptedException ex) { ; }

  	    seconds = seconds + 1;
  	    if(seconds==60) 
  	    { seconds = 0; 
          minutes = minutes + 1;
          if(minutes==60)
          { minutes = 0;
            hour = hour + 1; 
          }
  	    }
      }
	   
    }
	
	
	
	
}
