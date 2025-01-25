package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_35 {
    public static String jk, berat, lagi = "Y";
    public static float bd = 0f, total = 0f, rata = 0f;
    public static int tl = 0, tp = 0;

    public static void main(String[] args) 
    {
        int x = 0;
        boolean k = true;
        String ket, rekap = "";
        rekap += "           HASIL REKAP          \n";
        rekap += "--------------------------------\n";
        rekap += "NO  NAMA   JENIS KELAMIN   BERAT\n";
        rekap += "--------------------------------\n";
        do {
            x = x + 1;
            String info = "";
            String np = JOptionPane.showInputDialog("NAMA PASIEN");
            do 
            {
                jk = JOptionPane.showInputDialog("JENIS KELAMIN (L/P)");
            }
            while (!(("l".equals(jk)) | ("L".equals(jk)) | ("p".equals(jk)) | ("P".equals(jk))));
            if ("l".equals(jk) | ("L".equals(jk))) 
            {
                ket = "LAKI-LAKI";
                tl = tl + 1;
            } 
            else 
            {
                ket = "PEREMPUAN";
                tp = tp + 1;
            }
            do 
            {
                try 
                {
                    berat = JOptionPane.showInputDialog("BERAT BADAN");
                    bd = Float.parseFloat(berat);
                    k = false;
                } 
                catch (Exception e) 
                {
                    k = true;
                    JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH, INPUT ULANG");
                }
            } 
            while (k);
            total = total + bd;
            info += "TAMPILAN DATA PASIEN\n";
            info += "NAMA PASIEN: " + np + "\n";
            info += "JENIS KELAMIN: " + ket + "\n";
            info += "BERAT BADAN: " + bd + " KG\n";
            JOptionPane.showMessageDialog(null, info, "TAMPILAN DATA PASIEN", JOptionPane.INFORMATION_MESSAGE);
            rekap += "   " + x + "   " + np + "  " + ket + "   " + bd + "\n";
            do 
            {
                lagi = JOptionPane.showInputDialog("INGIN INPUT DATA LAGI? (Y/T)");
            } 
            while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));
        } 
        while ("y".equals(lagi));
        rata = total / x;
        rekap += "--------------------------------\n";
        rekap += "TOTAL LAKI-LAKI = " + tl + " ORANG\n";
        rekap += "TOTAL PEREMPUAN = " + tp + " ORANG\n";
        rekap += "RATA-RATA BERAT = " + rata + " KG\n";
        JOptionPane.showMessageDialog(null, rekap, "HASIL REKAP", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
