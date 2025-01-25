package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_27 
{
    public static void main(String[] args) 
    {
        String info = "";
        int bayar = 0;
        String nm_brg = JOptionPane.showInputDialog("Nama Barang");
        String hg_brg = JOptionPane.showInputDialog("Harga Barang");
        int harga = Integer.parseInt(hg_brg);
        String pt_brg = JOptionPane.showInputDialog("Potonagn Barang");
        int potong = Integer.parseInt(pt_brg);
        
        bayar = harga - potong;
        info += "\n Nama "+nm_brg;
        info += "\n Harga "+harga;
        info += "\n Potongan "+potong;
        info += "\n Bayar "+bayar;
        JOptionPane.showMessageDialog(null, info, "INFOMASI HARGA", JOptionPane.INFORMATION_MESSAGE);
        info = "";
        System.exit(0);
    }
}
