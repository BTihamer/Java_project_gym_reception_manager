package Osztalyok;
public class member extends Szemelyek {
    private int magassag;
    private int tomeg;
    private int eletkor;
    private String tagsag;
    private String edzo;
    private int szekreny_szama;
    private int lejarati_datum;

    public member(int id,String nev,int magassag,int tomeg,int eletkor,String tagsag,int szekreny_szama){
        super(id,nev);
        if(magassag<150){
            this.magassag=0;
        }
        else {
            this.magassag=magassag;
        }
        this.tomeg=tomeg;
        if(eletkor<14){
            System.out.println("Nem erte el a minimum eletkor nem lehet regisztralni!");
            this.eletkor=0;
        }
        else{
            this.eletkor=eletkor;
        }
        this.edzo="Nincs";
        if(tagsag.equals("Sima")||tagsag.equals("Edzos")) {
            this.tagsag = tagsag;
            lejarati_datum=30;
        }
        else{
            this.tagsag=tagsag;
            lejarati_datum=0;
        }
        this.szekreny_szama=szekreny_szama;
    }
    public member(int id,String nev,int magassag,int eletkor,String tagsag,int szekreny_szama){
        super(id,nev);
        if(magassag<150){
            this.magassag=0;
        }
        else {
            this.magassag=magassag;
        }
        this.tomeg=0;
        if(eletkor<14){
            System.out.println("Nem erte el a minimum eletkor nem lehet regisztralni!");
            this.eletkor=0;
        }
        else{
            this.eletkor=eletkor;
        }
        this.edzo="Nincs";
        this.tagsag=tagsag;
        this.szekreny_szama=szekreny_szama;
    }
    public int getLejarati_datum(){
        return lejarati_datum;
    }
    public int getId(){
        return id;
    }
    public void setEdzo(String Edzoneve){
        this.edzo=edzo;
    }
    public String getEdzo(){
        return edzo;
    }
    public void setTagsag(String tipus){
        this.tagsag=tipus;
    }
    public void setLejarati_datum(int ertek){
        this.lejarati_datum=ertek;
    }
    public String getTagsag(){
        return tagsag;
    }
    public String ToString(){
        return "ID: "+id+" Nev: "+nev+" Tomeg: "+tomeg+" Eletkor: "+eletkor+" Tagsag: "+tagsag+" Lejaratig: "+lejarati_datum+" Edzo: "+edzo+" Szekreny: "+szekreny_szama;
    }
}
