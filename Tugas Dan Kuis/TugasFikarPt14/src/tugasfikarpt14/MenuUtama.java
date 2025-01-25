package tugasfikarpt14;
import javax.swing.*;
public class MenuUtama {
    public static int z = -1;
    public static String ket[] = new String[20], jk;
    public static String nk[] = new String[20], namaKaryawan;
    public static String almt[] = new String[20], alamat;
    public static String pss[] = new String[20], posisi;
    public static String dpt[] = new String[20], departemen;
    public static Float nkinerj[] = new Float[20], nilaiKinerja;
    public static Float khd[] = new Float[20], nilaiKehadiran;
    //DEKLARASI EDIT
    public static String ed = "", pe = "", ph = "";
    public static boolean putar1 = false;
    public static int n_je = 0, d = 0;
    // DEKLARASI MENU
    public static String pl = "";
    public static boolean putarmenu = true;
    public static void main(String[] args) {
        MenuInput input = new MenuInput();
        MenuLaporan laporan = new MenuLaporan();
        MenuHapus hapus = new MenuHapus();
        do {
            pl = JOptionPane.showInputDialog("MENU SISTEM DATA KARYAWAN\n"
                    + "\n1. INPUT DATA KARYAWAN"
                    + "\n2. HAPUS DATA KARYAWAN"
                    + "\n3. LAPORAN DATA KARYAWAN"
                    + "\n4. KELUAR DARI PROGRAM"
                    + "\n PILIH [1-5]\n");
            switch (pl) {
                case "1": {
                    input.input_data(ket, nk, almt, pss, dpt, nkinerj, khd);
                    break;
                }
                case "2": {
                    hapus.hapus_data(ket, nk, almt, pss, dpt, nkinerj, khd);
                    break;
                }
                case "3": {
                    laporan.laporan_data(ket, nk, almt, pss, dpt, nkinerj, khd);
                    break;
                }
                case "4": {
                    putarmenu = false;
                    break;
                }
            }
        }while(putarmenu);
    }
}
