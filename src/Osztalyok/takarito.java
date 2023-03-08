package Osztalyok;
public class takarito extends Szemelyek{
    int munka_ido;
    String program;
    public takarito(int id,String nev,int munka_ido,String program){
        super(id,nev);
        if(program=="Nappali"){
            this.program=program;
        }
        else if(program=="Esti"){
            this.program=program;
        }
        else if(program=="Nappali-Esti"){
            this.program=program;
        }
        else{
            System.out.println("Nem jo adat!");
        }
        this.munka_ido=munka_ido;
    }
    public void setMunka_ido(int munka_ido){
        this.munka_ido=munka_ido;
    }
    public void setProgram(String program){
        if(program=="Nappali"){
            this.program=program;
        }
        else if(program=="Esti"){
            this.program=program;
        }
        else if(program=="Nappali-Esti"){
            this.program=program;
        }
        else{
            System.out.println("Nem jo adat!");
        }
    }
    public int getMunka_ido(){
        return munka_ido;
    }
    public String getProgram(){
        return program;
    }
    public String ToString(){
        return id+" "+nev+" "+munka_ido+" "+program;
    }
}
