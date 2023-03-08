package Osztalyok;
public class Alkalmazott extends Szemelyek{
    int fizetes;
    int ledolgozott_orak;
    public Alkalmazott(int id,String nev,int fizetes,int ledolgozott_orak){
        super(id,nev);
        this.fizetes=fizetes;
        this.ledolgozott_orak=ledolgozott_orak;
    }
    public void setFizetes(int fizetes){
        this.fizetes=fizetes;
    }
    public void setLedolgozott_orak(int ledolgozott_orak){
        this.ledolgozott_orak=ledolgozott_orak;
    }
    public int getFizetes(){
        return fizetes;
    }
    public int getLedolgozott_orak(){
        return ledolgozott_orak;
    }
}
