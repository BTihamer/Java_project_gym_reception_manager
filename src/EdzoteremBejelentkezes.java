import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Osztalyok.*;
import Polimorfizmus.*;
public class EdzoteremBejelentkezes extends JFrame {
    private JPanel mainPanel;
    private JTextField username;
    public JPasswordField password;
    private JButton submit;
    private JPanel gombok;
    private JButton UjTag;
    private JButton Abonament_hosszabitas;
    private JButton Adatok_kiirasa;
    private JButton edzoFogadasButton;
    private JTextField magassag;
    private JTextField nev;
    private JTextField eletkor;
    private JTextField tagsag;
    private JTextField tomeg;
    private JPanel Uj_tag;
    private JButton vege;
    private JButton megsem;
    private JPanel Edzo_hozzad;
    private JComboBox Edzo_valasztas;
    private JTextField tag_id;
    private JLabel label1;
    private JButton vege_gomb;
    private JButton Megsem;
    private JLabel label2;
    private JComboBox tagsag_valasz;
    private JTextField idget;
    private JButton Elkuld_gomb;
    private JButton megsemButton;
    private JComboBox nagysagcomboBox1;
    private JTextField get_id_tag;
    private JPanel NovelAbonamet;
    private JTextArea textArea1;
    private JButton Tagok;
    private JPanel Kiiratas;
    private JButton Fizetesek_kiiratasa;
    private JButton Fizetes_jovedelem;
    private JButton visszaButton;
    private JButton addAbonament;
    private JButton Abonament_ellenorzes;
    private JTextField Check_tagsag;
    private JButton Kuldesgomb;
    private JButton megsemButton2;
    private JPanel CheckTagasagJPanel;
    private JPanel addAbonamentJPanel;
    private JTextField addAbonamentTextField;
    private JButton KuldesgombAdd;
    private JComboBox addAbonamentcomboBox1;
    private JButton MegsemgombAddAbonament;
    private JButton KijelentkezesGomb;
    private JButton Tagtorlesbuton;
    private JPanel TagTorles;
    private JTextField tagTorles_TextField;
    private JButton KuldesGomb_Torles;
    private JButton megsemButton1;
    private boolean siker;

    public EdzoteremBejelentkezes(String cim){
        super(cim);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.gombok.setVisible(false);
        this.Uj_tag.setVisible(false);
        NovelAbonamet.setVisible(false);
        Edzo_hozzad.setVisible(false);
        Kiiratas.setVisible(false);
        CheckTagasagJPanel.setVisible(false);
        addAbonamentJPanel.setVisible(false);
        GYM gym=new GYM();
        gym.newMember("Balla Tihamer",176,65,19,"Sima");
        gym.newMember("Siklodi Roland",183,80,20,"Sima");
        gym.newMember("Bodor Zeno",183,84,19,"Edzos");
        gym.newMember("Peter Kriszta",165,45,20,"Edzos");
        gym.newMember("Strasszer Ingrid",173,50,20,"Sima");
        gym.newMember("Bacs Hunor",177,75,20,"Sima");
        gym.newMember("Szabo Norbert",185,70,20,"Edzos");
        gym.newMaganedzo(0,"Nagy Janos",0,"Nappali");
        gym.newMaganedzo(1,"Kis Laszlo",0,"Nappali");
        gym.newMaganedzo(2,"Bodor Lorant",0,"Esti");
        gym.newMaganedzo(3,"Nagy Janos",0,"Est");
        gym.newMaganedzo(4,"Peter Abigel",0,"Nappali-Esti");
        gym.newRecepcios(0,"Kiss Abigel",8,"Nappali");
        gym.newRecepcios(1,"Lakatos Levente",8,"Esti");
        gym.newTakarito(0,"Marton Timea",8,"Nappali");
        gym.newTakarito(1,"Gaspar Melania",8,"Esti");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean user;
                boolean pass;
                String user1=username.getText();
                String pass1=password.getText();
                Admin admin=new Admin("Admin","Admin");
                if(user1.equals(admin.getFelhasznalonev())){
                    user=true;
                }
                else{
                    user=false;
                }
                if(pass1.equals(admin.getJelszo())){
                    pass=true;
                }
                else{
                    pass=false;
                }
                if(user==true&&pass==true){
                    System.out.println("Sikeres bejelentkezes!");
                    cserelkepkocka();

                }
                else{
                    JOptionPane.showMessageDialog(null,
                            "Helytelen jelszo vagy felhasznalonev, kerlek probald meg ujbol!",
                            "Helytelen jelszo vagy felhasznalonev",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        UjTag.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka2();
            }
        });
        vege.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tag_nev= nev.getText();
                String magassaga=magassag.getText();
                String tomege= tomeg.getText();
                String eletkora=eletkor.getText();
                String[] tagsaga={"Nincs","Sima","Edzos"};
                boolean enged=true;
                int valasztas = tagsag_valasz.getSelectedIndex();
                try {
                    int magassaga2 = Integer.parseInt(magassaga);
                }catch (NumberFormatException maggassaga2) {
                    JOptionPane.showMessageDialog(null,
                            "Kerem szamot adjon meg a magassaghoz!");
                    enged=false;
                }
                try{
                    int tomeg2 = Integer.parseInt(tomege);
                }catch (NumberFormatException tomeg2) {
                    JOptionPane.showMessageDialog(null,
                            "Kerem szamot adjon meg a tomeghez!!");
                    enged=false;
                }
                try{
                    int eletkor2 = Integer.parseInt(eletkora);
                }catch (NumberFormatException eletkor2){
                    JOptionPane.showMessageDialog(null,
                            "Kerem szamot adjon meg az eletkorhoz!");
                    enged=false;
                }
                if(enged==true){
                    int eletkor3 = Integer.parseInt(eletkora);
                    int tomeg3 = Integer.parseInt(tomege);
                    int magassaga2 = Integer.parseInt(magassaga);
                    gym.newMember(tag_nev, magassaga2, tomeg3, eletkor3, tagsaga[valasztas]);
                    cserelkepkocka();
                }
                else{
                    JOptionPane.showMessageDialog(null,
                            "Hibas adatok miatt nem sikerult uj tagot hozzadani,javitsa ki majd probalja ujra!");
                }
            }
        });
        megsem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka();
            }
        });
        edzoFogadasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cserelkepkocka3();
            }
        });
        Megsem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka();
            }
        });
        vege_gomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Edzo_valasztas.getSelectedIndex();
                    int id = Integer.parseInt(tag_id.getText());
                    gym.hozzadMemberEdzo(id, index);
                    cserelkepkocka();
                }catch (NumberFormatException id){
                    JOptionPane.showMessageDialog(null,"Kerem szamot es helyes adatot adjon meg az ID-nek");
                }
            }
        });
        megsemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka();
            }
        });
        Elkuld_gomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int id=Integer.parseInt(get_id_tag.getText());
                int index=nagysagcomboBox1.getSelectedIndex();
                int[] tomb={30,60,90};
                gym.novelAbonament(id,tomb[index]);
                cserelkepkocka();}
                catch (NumberFormatException id){
                    JOptionPane.showMessageDialog(null,"Kerem szamot es helyes adatot adjon mege az ID-nek");
                }
            }
        });
        Abonament_hosszabitas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka4();
            }
        });
        Adatok_kiirasa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setEditable(false);
                cserelkepkocka5();
            }
        });
        visszaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka();
            }
        });
        Tagok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int memberek_sz=gym.getMemberSize();
                String tagok="";
                for(int i=0;i<memberek_sz;++i) {
                    tagok=tagok+gym.ToString(i)+"\n";
                }
                textArea1.setText(tagok+"\n");
            }
        });
        Fizetes_jovedelem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        Abonament_ellenorzes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka6();
            }
        });
        megsemButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka();
            }
        });
        Kuldesgomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws ArithmeticException {
                try{
                    int id=Integer.parseInt(Check_tagsag.getText());
                try {
                    if (gym.checkAbonament(id) == 2) {
                        throw new ArithmeticException("Nincs abonament");
                    }
                }catch (ArithmeticException gym){
                    JOptionPane.showMessageDialog(null,
                            "A megadott tagnak nincs aktiv abonamentje,nem mehet be az edzoterembe!",
                            "Nincs aktiv abonament",
                            JOptionPane.ERROR_MESSAGE);

                }
                try {
                    if (gym.checkAbonament(id) == 1) {
                        throw new ArithmeticException("Van abonament");
                    }
                }catch (ArithmeticException gym){
                    JOptionPane.showMessageDialog(null,
                            "A megadott tagnak van abonamentje!",
                            "Aktiv abonament",
                            JOptionPane.PLAIN_MESSAGE);
                }
                } catch (NumberFormatException id){
                    JOptionPane.showMessageDialog(null,"Kerem szamot adjon meg az ID helyere!");
                }
                cserelkepkocka();
            }
        });
        addAbonament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka7();
            }
        });
        MegsemgombAddAbonament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka();
            }
        });
        KuldesgombAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int id = Integer.parseInt(addAbonamentTextField.getText());
                    String[] abonamentek={"Sima","Edzos"};
                    int index= addAbonamentcomboBox1.getSelectedIndex();
                    gym.addAbonament(id,abonamentek[index]);
                    cserelkepkocka();
                }catch (NumberFormatException id){
                    JOptionPane.showMessageDialog(null,"Kerem szamot adjon meg az ID helyere!");
                }
            }
        });
        Fizetesek_kiiratasa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fizetesek maganedzo=new MaganedzoFizetes();
                Fizetesek takaritok=new TakaritoFizetes();
                Fizetesek recepcios=new RecepciosFizetes();
                String szoveg;
                szoveg=maganedzo.toString()+"\n";
                szoveg=szoveg+takaritok.toString()+"\n";
                szoveg=szoveg+recepcios.toString()+"\n";
                textArea1.setText(szoveg);
            }
        });
        Fizetes_jovedelem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(gym.megoldas()!=true) {
                }
                    int jovedelem = gym.Jovedelem();
                    int kiadas = gym.Kiiadasok();
                    int jovedelemkiadas = jovedelem - kiadas;
                    String minden = "Jovedelem: " + jovedelem + "\nKiadasok:" + kiadas + "\nA jovedelem-kiadas : " + jovedelemkiadas;
                    textArea1.setText(minden);
            }
        });
        KijelentkezesGomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NovelAbonamet.setVisible(false);
                Edzo_hozzad.setVisible(false);
                CheckTagasagJPanel.setVisible(false);
                addAbonamentJPanel.setVisible(false);
                Kiiratas.setVisible(false);
                username.setText("");
                password.setText("");
                setContentPane(mainPanel);
                mainPanel.setVisible(true);
            }
        });
        megsemButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka();
            }
        });
        Tagtorlesbuton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cserelkepkocka8();
            }
        });
        KuldesGomb_Torles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try {
                        String id = tagTorles_TextField.getText();
                        int id2 = Integer.parseInt(id);
                        try {
                            gym.torolMember(id2);
                        }catch(IndexOutOfBoundsException gym){
                            JOptionPane.showMessageDialog(null, "Nincs ilyen id-u tag!");
                        }
                    } catch (NumberFormatException id2) {
                        JOptionPane.showMessageDialog(null, "Kerem jo adatot adjon meg az id helyere!");
                    }
                    cserelkepkocka();
                }
        });
    }
    public void cserelkepkocka(){
        mainPanel.setVisible(false);
        NovelAbonamet.setVisible(false);
        Edzo_hozzad.setVisible(false);
        CheckTagasagJPanel.setVisible(false);
        addAbonamentJPanel.setVisible(false);
        Kiiratas.setVisible(false);
        setContentPane(gombok);
        gombok.setVisible(true);
    }
    public void cserelkepkocka2(){
        NovelAbonamet.setVisible(false);
        Edzo_hozzad.setVisible(false);
        Kiiratas.setVisible(false);
        gombok.setVisible(false);
        CheckTagasagJPanel.setVisible(false);
        setContentPane(Uj_tag);
        nev.setText("");
        magassag.setText("");
        tomeg.setText("");
        eletkor.setText("");
        Uj_tag.setVisible(true);
    }
    public void cserelkepkocka3(){
        gombok.setVisible(false);
        tag_id.setText("");
        setContentPane(Edzo_hozzad);
        Edzo_hozzad.setVisible(true);
    }
    public void cserelkepkocka4(){
        gombok.setVisible(false);
        setContentPane(NovelAbonamet);
        get_id_tag.setText("");
        NovelAbonamet.setVisible(true);
    }
    public void cserelkepkocka5(){
        gombok.setVisible(false);
        setContentPane(Kiiratas);
        Kiiratas.setVisible(true);
    }
    public void cserelkepkocka6(){
        gombok.setVisible(false);
        Check_tagsag.setText("");
        setContentPane(CheckTagasagJPanel);
        CheckTagasagJPanel.setVisible(true);
    }
    public void cserelkepkocka7() {
        gombok.setVisible(false);
        CheckTagasagJPanel.setVisible(false);
        TagTorles.setVisible(false);
        Check_tagsag.setText("");
        setContentPane(addAbonamentJPanel);
        addAbonamentJPanel.setVisible(true);
    }
    public void cserelkepkocka8(){
        gombok.setVisible(false);
        CheckTagasagJPanel.setVisible(false);
        addAbonamentJPanel.setVisible(false);
        tagTorles_TextField.setText("");
        setContentPane(TagTorles);
        TagTorles.setVisible(true);
    }
}
