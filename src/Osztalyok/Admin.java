package Osztalyok;
public class Admin {
    String Felhasznalonev;
    String Jelszo;
    boolean siker;
    public Admin(String Felhasznalonev,String Jelszo){
        this.Felhasznalonev=Felhasznalonev;
        this.Jelszo=Jelszo;
    }
    public String getFelhasznalonev(){
        return Felhasznalonev;
    }
    public String getJelszo(){
        return Jelszo;
    }
}
