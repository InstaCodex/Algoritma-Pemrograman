package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_31 
{
   public static void main(String[] args) 
   {
       String tampil = "";
       float rata = 0f;
       double def = 0.25, koreksi;
       String ujian1 = JOptionPane.showInputDialog("NILAI UJIAN 1");
       int nil1 = Integer.parseInt(ujian1);
       String ujian2 = JOptionPane.showInputDialog("NILAI UJIAN 2");
       int nil2  = Integer.parseInt(ujian2);
       rata = (nil1 + nil2)/2;
       koreksi = rata * def;
       tampil += "    HASIL NILAI     \n";
       tampil += "----------------------";
       tampil += "1.    NILAI UJIAN 1   ="+nil1+"\n";
       tampil += "2.    NILAI UJIAN 2   ="+nil1+"\n";
       tampil += " Rata-Rata Nilai      ="+rata+"\n";
       tampil += " Hasil Defiasi        ="+koreksi+"\n";
       JOptionPane.showMessageDialog(null, tampil, "HASIL UJIAN", JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
   } 
}
