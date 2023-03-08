package Osztalyok;
public class Szemelyek {
    int id;
    String nev;
    public Szemelyek(int id,String nev){
        this.id=id;
        this.nev=nev;
    }
    public void setNev(String nev){
        this.nev=nev;
    }
    public void setId(int ID){
        this.id=ID;
    }
    public String getNev(){
        return nev;
    }
    public int getId(){
        return id;
    }
}
