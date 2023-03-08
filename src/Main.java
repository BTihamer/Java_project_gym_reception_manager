public class Main {
    public static void main(String[] args) {
        EdzoteremBejelentkezes frame=new EdzoteremBejelentkezes("GYM Recepcio");
        frame.setBounds(100,100,700,700);
        frame.setVisible(true);
        Osztalyok.maganedzo.MaganedzoFizetesKiiratas();
    }
}