package Osztalyok;
public class Terem {
    String elnevezes;
    int nagysag;
    public Terem(String elnevezes,int nagysag){
        this.elnevezes=elnevezes;
        this.nagysag=nagysag;
    }
    public String getElnevezes(){
        return elnevezes;
    }
    public int getNagysag(){
        return nagysag;
    }
    public void setElnevezes(String elnevezes){
        this.elnevezes=elnevezes;
    }
    public void setNagysag(int nagysag){
        this.nagysag=nagysag;
    }
}
