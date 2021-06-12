package m10;

public class Alumne 
{
  protected String nom;
  protected int    edat;
  protected String curs;
  protected int    nota;
  

  public Alumne(String nom, int edat, String curs, int nota) {
    super();
    this.nom = nom;
    this.edat = edat;
    this.curs = curs;
    this.nota = nota;
  } 
  
 

  public String getNom() {
    return nom;
  }


  public void setNom(String nom) {
    this.nom = nom;
  }


  public int getEdat() {
    return edat;
  }


  public void setEdat(int edat) {
    this.edat = edat;
  }


  public String getCurs() {
    return curs;
  }


  public void setCurs(String curs) {
    this.curs = curs;
  }


  public int getNota() {
    return nota;
  }


  public void setNota(int nota) {
    this.nota = nota;
  }


  @Override
  public String toString() {
    return "Alumne [nom=" + nom + ", edat=" + edat + ", curs=" + curs + ", nota=" + nota + "]";
  }

 
 
 
}
