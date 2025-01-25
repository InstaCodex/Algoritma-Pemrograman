package tugas_modul_fikar_01;
import javax.swing.JOptionPane;
public class Tugas_Modul_Fikar_25 
{
    public static void main(String[] args) 
    {
        String judul = "DAFTAR INDEX DAGANG\n"
                + "----------------------------------"
                + "\n";
        String index = "NO      NILAI       HARGA\n"
                + "----------------------------------"
                + "\n";  
        int nilai = 25; 
        int harga = 100;
        int hb = 50;
        int totalNilai = 0;
        int totalHarga = 0;
        for (int nomor = 1; nomor <= 6; nomor = nomor + 1) 
        {
            index += nomor + "             " + nilai + "         " + harga + "\n";  
            totalNilai = totalNilai + nilai;
            totalHarga = totalHarga + harga;
            nilai = nilai + 5; 
            harga = harga + hb;
            hb = hb + 10;
        }
        String total = "------------------------------- +\n"
                + "Total    = " + totalNilai + "     " + totalHarga + "\n";
        String nama = "FIKAR DWI RAMADHANI 0022";
        JOptionPane.showMessageDialog(null, judul + index + total + nama, "DAFTAR INDEX BANK MULIA", JOptionPane.INFORMATION_MESSAGE);
    }
}
