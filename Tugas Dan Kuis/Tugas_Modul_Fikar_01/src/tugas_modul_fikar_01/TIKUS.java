package tugas_modul_fikar_01;
import javax.swing.*;
public class TIKUS {
    String yityit()
    {
        String suaratikus = "cit cit cit";
        return suaratikus;
    }
    String yityit1()
    {
        String k1 = JOptionPane.showInputDialog(" MASUKKAN KEBALI SUARA TIKUS \n YANG KAU TEMUKAN");
        String suaratikus = k1;
        return suaratikus;
    }
    int yityit2()
    {
        int k2 = Integer.parseInt(JOptionPane.showInputDialog(" MASUKKAN BERAPA KALI SUARA TIKUS DI ULANG"));
        int jumlahsuaratikus=k2;
        return jumlahsuaratikus;
    }
}
