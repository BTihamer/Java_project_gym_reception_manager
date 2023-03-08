package Osztalyok;
public class maganedzo extends Szemelyek{
    int edzo_memberek_szama;
    String edzes_program;
    public maganedzo(int id,String nev,int edzo_memberek_szama,String edzes_program){
        super(id,nev);
        this.edzo_memberek_szama=edzo_memberek_szama;
        if(edzes_program.equals("Nappali")){
            this.edzes_program="Nappali";
        }
        else if(edzes_program.equals("Est")){
            this.edzes_program="Esti";
        }
        else if(edzes_program.equals("Nappali-Esti")){
            this.edzes_program="Nappali-Esti";
        }
        else{
            System.out.println("Nem jo adat!");
        }
    }
    public maganedzo(int id,String nev,String edzes_program){
        super(id,nev);
        if(edzes_program.equals("Nappali")){
            this.edzes_program="Nappali";
        }
        else if(edzes_program.equals("Est")){
            this.edzes_program="Esti";
        }
        else if(edzes_program.equals("Nappali-Esti")){
            this.edzes_program="Nappali-Esti";
        }
        else{
            System.out.println("Nem jo adat!");
        }
    }
    public static void MaganedzoFizetesKiiratas(){
        System.out.println("A fizetes magán edző eseten ha nappal dolgozik:1000,ha este: 1000,ha mindketto:2200");
    }
    public void novel_edzo_memberek_szama(){
        this.edzo_memberek_szama++;
    }
    public void setEdzo_memberek_szama(){
        this.edzo_memberek_szama=edzo_memberek_szama+1;
    }
    public int getEdzo_memberek_szama(){
        return edzo_memberek_szama;
    }
    public String getEdzes_program(){
        return edzes_program;
    }
    public void setEdzes_program(String edzes_program){
        this.edzes_program=edzes_program;
    }
}
