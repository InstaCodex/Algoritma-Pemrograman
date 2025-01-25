package tugas_modul_fikar_01;
import javax.swing.*;
public class KUCING {
    String lolong()
    {
        String suarakucing = "meong meong meong";
        return suarakucing;
    }
    String lolong1()
    {
        String k1 = JOptionPane.showInputDialog(" MASUKKAN KEBALI SUARA KUCING KAMU");
        String suarakucing = k1;
        return suarakucing;
    }
    int lolong2()
    {
        int k2 = Integer.parseInt(JOptionPane.showInputDialog(" MASUKKAN BERAPA KALI SUARA KUCING DI ULANG"));
        int jumlahsuarakucing=k2;
        return jumlahsuarakucing;
    }
}
