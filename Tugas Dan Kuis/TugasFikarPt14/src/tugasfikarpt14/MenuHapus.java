package tugasfikarpt14;
import static tugasfikarpt14.MenuUtama.z;
import javax.swing.*;
public class MenuHapus {
    // DEKLARASI HAPUS
    public static String ht = "", hk = "", info = "";
    public static boolean putar4 = true;
    public static int n_id = 0, id = 0;

    void hapus_data(String[] ket, String[] nk, String[] almt, String[] pss, String[] dpt, Float[] nkinerj, Float[] khd) {
        int z = MenuInput.z;
        if (z == -1) {
            JOptionPane.showMessageDialog(null, "MAAF DATA KOSONG, INPUT DATA DULU\n");
        } else {
            ht = JOptionPane.showInputDialog("HAPUS DATA [Y/T]");
            if ("t".equals(ht) | "T".equals(ht)) {
                putar4 = false;
            } else {
                do {
                    id = Integer.parseInt(JOptionPane.showInputDialog("JUMLAH DATA [1 - " + (z + 1) + "]"));
                } while (!(id >= 1 && id <= (z + 1)));
                n_id = (id - 1);
                info = "";
                info += "DATA KE = " + id + "\n";
                info += "NAMA KARYAWAN      =" + nk[n_id] + "\n";
                info += "JENIS KELAMIN      =" + ket[n_id] + "\n";
                info += "ALAMAT             =" + almt[n_id] + "\n";
                info += "POSISI PEKERJAAN   =" + pss[n_id] + "\n";
                info += "DEPARTEMEN         =" + dpt[n_id] + "\n";
                info += "NILAI KINERJA      =" + nkinerj[n_id] + "\n";
                info += "NILAI KEHADIRAN    =" + khd[n_id] + "%" + "\n";;
                JOptionPane.showMessageDialog(null, info, "INFO DATA HAPUS", JOptionPane.INFORMATION_MESSAGE);
                info = "";
                if (n_id == z) {
                    MenuInput.z = z - 1;
                    JOptionPane.showMessageDialog(null, "SUKSES MENGHAPUS DATA\n");
                } else {
                    for (int hs = n_id; hs < z; hs = hs + 1) {
                        nk[hs] = nk[hs + 1];
                        ket[hs] = ket[hs + 1];
                        almt[hs] = almt[hs + 1];
                        pss[hs] = pss[hs + 1];
                        dpt[hs] = dpt[hs + 1];
                        nkinerj[hs] = nkinerj[hs + 1];
                        khd[hs] = khd[hs + 1];
                    }
                    MenuInput.z = z - 1;
                    JOptionPane.showMessageDialog(null, "SUKSES MENGHAPUS DATA\n");
                }
            }
        }
    }
}
