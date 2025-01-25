package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_49 {
    public static void main(String[] args) {
        int h , jh;
        String data = JOptionPane.showInputDialog("MASUKAN JUMLAH DATA");
        int x = Integer.parseInt(data);
        h = x % 3;
        if (h == 0) {
            jh = x / 3;
        }
        else {
            jh  = (x / 3) + 1;
        }
        JOptionPane.showMessageDialog(null, "JUMLAH DATA = "+data+"\nJUMLAH HALAMAN = "+jh+"\n");
    }
}
