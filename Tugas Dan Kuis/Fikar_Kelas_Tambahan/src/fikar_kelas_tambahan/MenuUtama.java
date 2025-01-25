package fikar_kelas_tambahan;
import javax.swing.*;
import java.text.NumberFormat; // format angka
public class MenuUtama {
    public static String nama_nrgara[]= new String[20],ng; 
    public static int jml_penduduk[] = new int[20],jml;
    public static double pendapatan[]= new double[20],pd;
    public static String email[] = new String[20],em;
    public static String moto[] = new String[20],mt;
    public static int x=-1; 
    public static String lagi="y",tampil="";
    private static int no;
    public static void main(String[] args) {
        MenuInput    in = new MenuInput();
        MenuLaporan lap = new MenuLaporan();
        MenuEdit    dit = new MenuEdit();
        MenuHapus   pus = new MenuHapus();
        boolean putar= true;
        NumberFormat angka = NumberFormat.getIntegerInstance();
        angka.setMinimumFractionDigits(2);
        do {
            String pil = JOptionPane.showInputDialog("       MENU NEGARA     \n"
                    + "1.   INPUT NEGARA \n"
                    + "2.   LAPORAN NEGARA \n"
                    + "3.   EDIT \n"
                    + "4.   HAPUS \n"
                    + "5.   EXIT"); 
            switch (pil) {
                case "1" : {  
                    in.input_data(nama_nrgara, jml_penduduk,pendapatan,email,moto);
                    break;
                }
                case "2" : {               
                    lap.laporan_data(nama_nrgara, jml_penduduk,pendapatan,email,moto);
                    break;
                }
                case "3" : {
                    dit.edit_data(nama_nrgara, jml_penduduk,pendapatan,email,moto);
                    break;
                }
                case "4" : {
                    pus.hapus_data(nama_nrgara, jml_penduduk,pendapatan,email,moto);
                    break;
                }
                case "5" : {
                    JOptionPane.showMessageDialog(null,"SISTEM KELUAR");
                    putar= false;
                    break;
                }
            }
       } while(putar);
    }
}
