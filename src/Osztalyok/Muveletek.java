package Osztalyok;
public interface Muveletek {
    public void novelAbonament(int id,int nagysag);
    public void hozzadMemberEdzo(int memberid,int edzoid);
    public void addAbonament(int id,String tipus);
    public int checkAbonament(int id);
}
