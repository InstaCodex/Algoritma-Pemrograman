package tugasfikarpt14;
import javax.swing.*;
public class MenuInput {
    public static String jk = "", lagi = "y", namaKaryawan = "", alamat = "", posisi = "", departemen = ""
                        , u1 = "", u2 = "", info = "", po = "", je = "", pil = "";
    public static int n_jk = 0, gt = 0, totp = 0, totl = 0, tl = 0, tp = 0, no = 0, x = 0, z = -1, y = 0, l = 0, p = 0, n_dp = 0;
    public static float nilaiKinerja = 0f, nilaiKehadiran = 0f;
    public static boolean putar = true;
    void input_data(String[] ket, String[] nk, String[] almt, String[] pss, String[] dpt, Float[] nkinerj, Float[] khd) {
        do {
            if (z == 10) {
                JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH, TIDAK BISA INPUT");
            } else {
                z = z + 1;
                namaKaryawan = JOptionPane.showInputDialog("NAMA KARYAWAN");
                do {
                    try {
                        jk = JOptionPane.showInputDialog("JENIS KELAMIN\n 1.LAKI-LAKI\n 2.PEREMPUAN\nPILIH [1-5]");
                        n_jk = Integer.parseInt(jk);
                        if ("1".equals(jk)) {
                            putar = false;
                            jk = "LAKI-LAKI";
                            l = l + 1;
                        } else if ("2".equals(jk)) {
                            putar = false;
                            jk = "PEREMPUAN";
                            p = p + 1;
                        }
                    } catch (Exception e) {
                        putar = true;
                        JOptionPane.showMessageDialog(null, "DATA YANG INPUT SALAH, MASUKAN DATA LAGI");
                    }
                } while (putar);
                alamat = JOptionPane.showInputDialog("ALAMAT");
                posisi = JOptionPane.showInputDialog("POSISI PEKERJAAN");
                do {
                    try {
                        departemen = JOptionPane.showInputDialog("DEPARTEMEN \n1. IT\n2. HR\n3. Marketing\n4. Keuangan\n5. Produksi\nPILIH [1-5]\n");
                        if ("1".equals(departemen)) {
                            n_dp = Integer.parseInt(departemen);
                            putar = false;
                            departemen = "IT";
                        } else if ("2".equals(departemen)) {
                            n_dp = Integer.parseInt(departemen);
                            putar = false;
                            departemen = "HR";
                        } else if ("3".equals(departemen)) {
                            n_dp = Integer.parseInt(departemen);
                            putar = false;
                            departemen = "Marketing";
                        } else if ("4".equals(departemen)) {
                            n_dp = Integer.parseInt(departemen);
                            putar = false;
                            departemen = "Keuangan";
                        } else {
                            n_dp = Integer.parseInt(departemen);
                            putar = false;
                            departemen = "Produksi";
                        }
                    } catch (Exception e) {
                        putar = true;
                        JOptionPane.showMessageDialog(null, "DATA YANG INPUT SALAH, MASUKAN DATA LAGI");
                    }
                } while (putar);
                do {
                    try {
                        u1 = JOptionPane.showInputDialog("NILAI KINERJA [0.0 - 5.0]");
                        nilaiKinerja = Float.parseFloat(u1);
                        putar = false;
                    } catch (Exception e) {
                        putar = true;
                        JOptionPane.showMessageDialog(null, "DATA YANG INPUT SALAH, MASUKAN DATA LAGI");
                    }
                } while (putar);
                do {
                    try {
                        u2 = JOptionPane.showInputDialog("NILAI KEHADIRAN");
                        nilaiKehadiran = Float.parseFloat(u2);
                        putar = false;
                    } catch (Exception e) {
                        putar = true;
                        JOptionPane.showMessageDialog(null, "DATA YANG INPUT SALAH, MASUKAN DATA LAGI");
                    }
                } while (putar);
                nk[z] = namaKaryawan;
                almt[z] = alamat;
                pss[z] = posisi;
                dpt[z] = departemen;
                nkinerj[z] = nilaiKinerja;
                khd[z] = nilaiKehadiran;
                ket[z] = jk;
                info = "";
                info += "NAMA KARYAWAN      =" + nk[z] + "\n";
                info += "JENIS KELAMIN      =" + ket[z] + "\n";
                info += "ALAMAT             =" + almt[z] + "\n";
                info += "POSISI PEKERJAAN   =" + pss[z] + "\n";
                info += "DEPARTEMEN         =" + dpt[z] + "\n";
                info += "NILAI KINERJA      =" + nkinerj[z] + "\n";
                info += "NILAI KEHADIRAN    =" + khd[z] + "%" + "\n";
                JOptionPane.showMessageDialog(null, info, "INFO DATA KARYAWAN", JOptionPane.INFORMATION_MESSAGE);
                info = "";
                lagi = JOptionPane.showInputDialog("INPUT KARYAWAN [Y/T]");
                if (z == 10) {
                    JOptionPane.showInputDialog(null, "DATA SUDAH PENUH KELUAR");
                    lagi = "t";
                }
            }
        } while ("y".equals(lagi) || "Y".equals(lagi));
    }
}
