package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_67 {
    public static void main(String[] args) {
        String suarakucing = "";
        String suaraayam = "";
        String suaratikus = "";

        KUCING meong = new KUCING();
        suarakucing = meong.lolong();
        JOptionPane.showMessageDialog(null, " Suara Kucing ...." + "  " + suarakucing + "\nBENARKA SUARA KUCING");
        suarakucing = meong.lolong1();
        JOptionPane.showMessageDialog(null, " SUARA KUCING INPUTAN" + "  " + suarakucing);

        AYAM kokok = new AYAM();
        suaraayam = kokok.petok();
        JOptionPane.showMessageDialog(null, " Suara Ayam ...." + "  " + suaraayam + "\nBENARKA SUARA AYAM");
        suaraayam = kokok.petok1();
        JOptionPane.showMessageDialog(null, " SUARA AYAM INPUTAN" + "  " + suaraayam);

        TIKUS citcit = new TIKUS();
        suaratikus = citcit.yityit();
        JOptionPane.showMessageDialog(null, " Suara Tikus ...." + "  " + suaratikus + "\nBENARKA SUARA TIKUS");
        suaratikus = citcit.yityit1();
        JOptionPane.showMessageDialog(null, " SUARA TIKUS INPUTAN" + "  " + suaratikus);
    }
}

