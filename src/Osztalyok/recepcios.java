package Osztalyok;
public class recepcios extends Szemelyek{
    int munka_ido;
    String munka_tipusa;
    public recepcios(int id,String nev,int munka_ido,String munka_tipusa){
        super(id,nev);
        if(munka_tipusa=="Nappali"){
            this.munka_tipusa=munka_tipusa;
        }
        else if(munka_tipusa=="Esti"){
            this.munka_tipusa=munka_tipusa;
        }
        else if(munka_tipusa=="Nappali-Esti"){
            this.munka_tipusa=munka_tipusa;
        }
        else{
            System.out.println("Nem jo adat!");
        }
        this.munka_ido=munka_ido;
    }
    public void setMunka_ido(int munka_ido){
        this.munka_ido=munka_ido;
    }
    public int getMunka_ido(){
        return munka_ido;
    }
    public void setMunka_tipusa(String munka_tipusa){
        if(munka_tipusa=="Nappali"){
            this.munka_tipusa=munka_tipusa;
        }
        else if(munka_tipusa=="Esti"){
            this.munka_tipusa=munka_tipusa;
        }
        else if(munka_tipusa=="Nappali-Esti"){
            this.munka_tipusa=munka_tipusa;
        }
        else{
            System.out.println("Nem jo adat!");
        }
    }
    public String getMunka_tipusa(){
        return munka_tipusa;
    }
    public String ToString(){
        return id+" "+nev+" "+munka_ido+" "+munka_tipusa;
    }
}
