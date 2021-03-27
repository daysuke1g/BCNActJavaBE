package m02;

public class Nivell1Fase4 
{
  public static void main(String[] args)
  {
    /*
	  Crea una altra llista amb el teu cognom on cada posici� correspongui a una lletra. 
	  Fusiona les dues llistes en una sola. 
	  A m�s, afegeix una posici� amb un espai buit entre la primera i la segona. 
	    �s a dir, partim de la llista name i surname i al acabar l�execuci� nom�s tindrem una que es dir� fullName. 
     */	        	  

	 char[] name    = { 'J','o','s','�', 'L','u','i','s' } ; // o .. "".toCharArray(); 
     char[] surname	= { 'C','a','�','i','v','a','n','o' } ;    
     
	  
     char[] fullName = new char[name.length+1+surname.length]; //init dest buffer 
     
     int dPosNomComplet=0;
     for(int dIdx=0;dIdx<name.length;dIdx++) { 
    	 fullName[dPosNomComplet++] = name[dIdx]; 
     }
     fullName[dPosNomComplet++] = ' ';
     for(int dIdx=0;dIdx<surname.length;dIdx++) { 
    	 fullName[dPosNomComplet++] = surname[dIdx]; 
     }
     	 
     System.out.println("Full Name: "+new String(fullName));

     // Altra manera amb  System.arraycopy(...)
     char[] fullName1 = new char[fullName.length];
	 System.arraycopy(name, 0,fullName1,0,name.length);     
	 fullName1[name.length] = ' ';
	 System.arraycopy(surname, 0,fullName1,name.length+1,surname.length);
	 System.out.println("Full Name: "+new String(fullName1));
	 	      
  }
}
