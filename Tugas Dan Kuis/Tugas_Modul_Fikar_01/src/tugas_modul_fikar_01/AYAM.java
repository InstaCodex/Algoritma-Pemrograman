package tugas_modul_fikar_01;
import javax.swing.*;
public class AYAM {
    String petok()
    {
        String suaraayam = "petok petok petok";
        return suaraayam;
    }
    String petok1()
    {
        String k1 = JOptionPane.showInputDialog(" MASUKKAN KEBALI SUARA AYAM KAMU");
        String suaraayam = k1;
        return suaraayam;
    }
    int petok2()
    {
        int k2 = Integer.parseInt(JOptionPane.showInputDialog(" MASUKKAN BERAPA KALI SUARA AYAM DI ULANG"));
        int jumlahsuaraayam=k2;
        return jumlahsuaraayam;
    }
}
