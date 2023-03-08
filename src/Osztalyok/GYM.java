package Osztalyok;
import javax.swing.*;
import java.util.ArrayList;

public class GYM extends Thread implements Muveletek{
    private ArrayList<Terem> Epulet=new ArrayList<>();
    private ArrayList<takarito> Takaritok=new ArrayList<>();
    private ArrayList<recepcios> Recepciosok=new ArrayList();
    private ArrayList<member> Memberek=new ArrayList<>();
    private ArrayList<maganedzo> Maganedzok=new ArrayList<>();
    static protected int id=0;
    private int jovedelem;
    private int kiadas;
    public GYM() {

    }
    //Uj tagok letrehozasa metodusok
    public void newEpulet(String elnevezes,int nagysag){
        Terem epulet=new Terem(elnevezes, nagysag);
        Epulet.add(epulet);
    }
    public void newMaganedzo(int id,String nev,int edzo_memberek_szama,String edzes_program) {
    maganedzo edzo=new maganedzo(id,nev,edzo_memberek_szama,edzes_program);
    Maganedzok.add(edzo);
    }
    public void newTakarito(int id,String nev,int munka_ido,String program) {
    takarito takarit=new takarito(id,nev,munka_ido,program);
    Takaritok.add(takarit);
    }
    public void newRecepcios(int id,String nev,int munka_ido,String munka_tipusa) {
    recepcios recep=new recepcios(id,nev,munka_ido,munka_tipusa);
    Recepciosok.add(recep);
    }
    public void newMember(String nev,int magassag,int tomeg,int eletkor,String tagsag) {
    member tag=new member(id,nev,magassag,tomeg,eletkor,tagsag,id);
    id++;
    Memberek.add(tag);
    }
    public maganedzo getMaganedzo(int id){
        for(int i=0;i<Maganedzok.size();++i){
            if(Maganedzok.get(i).getId()==id){
                return Maganedzok.get(i);
            }
        }
        return null;
    }
    public takarito getTakartio(int id){
        for(int i=0;i<Takaritok.size();++i){
            if(Takaritok.get(i).getId()==id){
                return Takaritok.get(i);
            }
        }
        return null;
    }
    public recepcios getRecepcios(int id){
        for(int i=0;i<Recepciosok.size();++i) {
            if(Recepciosok.get(i).getId()==id){
                return Recepciosok.get(i);
            }
        }
        return null;
    }
    public member getMember(int id) {
        for(int i=0;i<Memberek.size();++i) {
            if(Memberek.get(i).getId()==id) {
                return Memberek.get(i);
            }
        }
    return null;
    }
    public int Jovedelem(){
        int osszeg=0;
        for(int i=0;i<Memberek.size();++i){
            member ideiglenes=getMember(i);
            if(ideiglenes.getTagsag().equals("Nincs")){
                osszeg=osszeg+0;
            }
            else if(ideiglenes.getTagsag().equals("Sima")){
                osszeg=osszeg+150;
            }
            else if(ideiglenes.getTagsag().equals("Edzos")){
                osszeg=osszeg+300;
            }
        }
        return osszeg;
    }
    public int Kiiadasok(){
        int osszeg=0;
        for(int i=0;i<Maganedzok.size();++i){
            maganedzo ideiglenes=getMaganedzo(i);
            if(ideiglenes.getEdzes_program()=="Nappali"){
                osszeg=osszeg+1000;
            }
            else if(ideiglenes.getEdzes_program()=="Esti"){
                osszeg=osszeg+1000;
            }
            else if(ideiglenes.getEdzes_program()=="Nappali-Esti"){
                osszeg=osszeg+2200;
            }
        }
        for(int i=0;i<Recepciosok.size();++i){
            recepcios ideiglenes=getRecepcios(i);
            if(ideiglenes.getMunka_tipusa()=="Nappali"){
                osszeg=osszeg+700;
            }
            else if(ideiglenes.getMunka_tipusa()=="Esti"){
                osszeg=osszeg+700;
            }
            else if(ideiglenes.getMunka_tipusa()=="Nappali-Esti"){
                osszeg=osszeg+1500;
            }
        }
        for(int i=0;i<Takaritok.size();++i){
            takarito ideiglenes=getTakartio(i);
            if(ideiglenes.getProgram()=="Nappali"){
                osszeg=osszeg+500;
            }
            else if(ideiglenes.getProgram()=="Esti"){
                osszeg=osszeg+500;
            }
            else if(ideiglenes.getProgram()=="Nappali-Esti"){
                osszeg=osszeg+1200;
            }
        }
        return osszeg;
    }
    public String ToString(int i){
        member asd=getMember(i);
        return asd.ToString();
    }
    public int getKiadas(){
        return kiadas;
    }
    public int getJovedelm(){
        return jovedelem;
    }
    public void run(){
        this.jovedelem=Jovedelem();
        this.kiadas=Kiiadasok();
    }
    public boolean megoldas(){
        GYM thread=new GYM();
        thread.start();
        thread.run();
        while(thread.isAlive()){
            System.out.println("A thread-be");
        }
        return true;
    }
    public int getMemberSize(){
        return Memberek.size();
    }
    public void torolMember(int id){
        Memberek.remove(id);
    }
//Interface metodusok
    public void novelAbonament(int id,int nagysag){
        try {
            member ideiglenes = getMember(id);
            if (ideiglenes.getTagsag() == "Nincs") {
                JOptionPane.showMessageDialog(null, "Nincs aktiv abonament nem lehet hosszabitani");
            } else if (ideiglenes.getTagsag() == "Sima" || ideiglenes.getTagsag() == "Edzos") {
                ideiglenes.setLejarati_datum(nagysag);
            }
        }catch (NullPointerException ideiglenes){
            JOptionPane.showMessageDialog(null, "Rossz ID-t adott meg!");
        }
    }
    public void hozzadMemberEdzo(int memberid,int edzoid){
        try{
            member ideiglenes=getMember(memberid);
            maganedzo edzo=getMaganedzo(edzoid);
        if(ideiglenes.getTagsag().equals("Nincs")||ideiglenes.getTagsag().equals("Sima")){
            JOptionPane.showMessageDialog(null, "Ebben az esetbe nem lehet edzot venni!");
        }
        else if(ideiglenes.getTagsag().equals("Edzos")) {
            String nev = edzo.getNev();
            ideiglenes.setEdzo(nev);
            edzo.novel_edzo_memberek_szama();
        }}catch(NullPointerException ideiglenes){
            JOptionPane.showMessageDialog(null, "Rossz ID-t adott meg!");
        }

    }
    public void addAbonament(int id,String tipus){
        try {
            member ideiglenes = getMember(id);
            ideiglenes.setLejarati_datum(30);
            ideiglenes.setTagsag(tipus);
        }catch (NullPointerException  ideiglenes){
            JOptionPane.showMessageDialog(null, "Rossz ID-t adott meg!");
        }
    }
    public int checkAbonament(int id){
        try {
            member ideiglenes = getMember(id);
            if (ideiglenes.getTagsag() == "Sima" && ideiglenes.getLejarati_datum() >= 1) {
                return 1;
            } else if (ideiglenes.getTagsag() == "Edzos" && ideiglenes.getLejarati_datum() >= 1) {
                return 1;
            } else if (ideiglenes.getTagsag() == "Nincs" && ideiglenes.getLejarati_datum() == 0) {
                return 2;
            }
        }catch(NullPointerException ideiglenes){
            JOptionPane.showMessageDialog(null, "Rossz ID-t adott meg!");
        }
        return 3;
    }
}

