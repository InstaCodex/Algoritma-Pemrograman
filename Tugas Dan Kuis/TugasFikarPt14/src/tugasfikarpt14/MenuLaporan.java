package tugasfikarpt14;
import javax.swing.JOptionPane;
import static tugasfikarpt14.MenuUtama.z;
public class MenuLaporan {
    // DEKLARASI LAPORAN PER HALAMAN 
    public static String info = "";
    public static int h = 0, sisa = 0, x1 = 0, x2 = 0, y1 = -1;
    public static int p=0,gt=0,l=0,no=0;
    void laporan_data(String[] ket, String[] nk, String[] almt, String[] pss, String[] dpt, Float[] nkinerj, Float[] khd) {
        int z = MenuInput.z;
        if (z == -1) {
            JOptionPane.showMessageDialog(null, "MAAF DATA TERNYATA KOSONG\n");
        } else {
            y1 = -1;
            sisa = (z + 1) % 4;
            if (sisa == 0) {
                h = (z + 1) / 4;
            } else {
                h = ((z + 1) / 4) + 1;
            }
            x1 = 1;
            x2 = 4;
            info = "";
            no = 0;
            l = 0;
            p = 0;
            for (int ut = 1; ut <= h; ut = ut + 1) {
                info += "                                Laporan Hasil Kinerja Karyawan                                         \n";
                info += "-------------------------------------------------------------------------------------------------------\n";
                info += "NO   NAMA       JENIS KELAMIN        ALAMAT       POSISI        DEPARTEMEN     KINERJA       KEHADIRAN \n";
                info += "-------------------------------------------------------------------------------------------------------\n";
                if (ut == h) {
                    x2 = x1 + sisa - 1;
                    if (sisa == 0) {
                        x2 = x1 + 3;
                    }
                }
                for (int pz = x1; pz <= x2; pz = pz + 1) {
                    y1 = y1 + 1;
                    if (y1 <= z) {
                        info += ++no + " " + nk[y1] + "  " + ket[y1] + " " + almt[y1] + "  " + pss[y1] + " " + dpt[y1] + " " + nkinerj[y1] + " " + khd[y1] + "%" + "\n";
                    }
                    if ("LAKI-LAKI".equals(ket[y1])) {
                        l = l + 1;
                    } else if ("PEREMPUAN".equals(ket[y1])) {
                        p = p + 1;
                    }
                }
                gt = l + p;
                info += "-------------------------------------------------------------------------------------------------------\n";
                info += "TOTAL KARYAWAN LAKI-LAKI     =   " + l + "\n";
                info += "TOTAL KARYAWAN PEREMPUAN     =   " + p + "\n";
                info += "TOTAL SEMUA KARYAWAN     =   " + gt + "\n";
                JOptionPane.showMessageDialog(null, info, "REKAP HAPUS KINERJA KARYAWAN", JOptionPane.INFORMATION_MESSAGE);
                info = "";
                x1 = x1 + 4;
                x2 = x2 + 4;
            }
        }
    }
}
