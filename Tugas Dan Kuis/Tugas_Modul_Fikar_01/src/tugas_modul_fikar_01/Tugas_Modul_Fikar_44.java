package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_44 {
    public static String jk = "", lagi = "y", namaKaryawan = "", alamat = "", posisi = "", departemen = "", u1 = "", u2 = "", info = "",po="",je="";
    public static int n_jk = 0, gt = 0, totp = 0, totl = 0, tl = 0, tp = 0, no = 0, x = 0, z = -1, y = 0, l = 0, p = 0, n_dp = 0;
    public static float nilaiKinerja = 0f, nilaiKehadiran = 0f, totalKinerja = 0f, totalKehadiran = 0f;
    public static double def = 0.25, koreksi;
    public static boolean putar = true;
    //DEKLARASI EDIT
    public static String ed = "",pe="",ph="";
    public static boolean putar1 = false;
    public static int n_je = 0, d = 0;
    
     public static void main(String[] args) {
        String ket[] = new String[5];
        String nk[] = new String[5];
        String almt[] = new String[5];
        String pss[] = new String[5];
        String dpt[] = new String[5];
        Float nkinerj[] = new Float[5];
        Float khd[] = new Float[5];     

        do {
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
            if (z == 5) {
                JOptionPane.showInputDialog(null, "DATA SUDAH PENUH KELUAR");
                lagi = "t";
            }
        } while ("y".equals(lagi) || "Y".equals(lagi));
        info = "";
        info += "                                                  Laporan Hasil Kinerja Karyawan              \n";
        info += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
        info += "NO   NAMA       JENIS KELAMIN        ALAMAT       POSISI        DEPARTEMEN     KINERJA       KEHADIRAN \n";
        info += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
        for (y = 0; y <= z; y=y+1) {
            no = no + 1;
            totalKinerja = totalKinerja + nkinerj[y];
            totalKehadiran = totalKehadiran + khd[y];
            gt = l + p;
            koreksi = totalKinerja * def;
            info += no + "       " + nk[y] + "         " + ket[y] + "              " + almt[y] + "     " + pss[y] + "        " + dpt[y] + "              " + nkinerj[y] + "                    " + khd[y] + "%" + "\n";
        }
        info += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
        info += "NILAI RATA RATA KINERJA     =   " + totalKinerja + "\n";
        info += "NILAI RATA RATA KEHADIRAN     =   " + totalKehadiran + "\n";
        info += "DEFIASI DARI TOTAL KINERJA     =   " + koreksi + "\n";
        info += "TOTAL KARYAWAN LAKI-LAKI     =   " + l + "\n";
        info += "TOTAL KARYAWAN PEREMPUAN     =   " + p + "\n";
        info += "TOTAL SEMUA KARYAWAN     =   " + gt + "\n";
        JOptionPane.showMessageDialog(null, info, "REKAP KINERJA KARYAWAN", JOptionPane.INFORMATION_MESSAGE);
        
        do {
            do {
                ed = JOptionPane.showInputDialog("EDIT DATA [Y/T]");
                if (!("t".equals(ed) | "T".equals(ed) | "Y".equals(ed) | "y".equals(ed))) {
                    JOptionPane.showMessageDialog(null, "TIDAK ADA PI;IHANNYA\n    HANYA Y/T\n");
                }
            } while (!("t".equals(ed) | "T".equals(ed) | "Y".equals(ed) | "y".equals(ed)));

            if ("t".equals(ed) | "T".equals(ed)) {
                JOptionPane.showMessageDialog(null, "ANDA AKAN KELUAR DARI EDIT");
                putar1 = false;
            } else {
                putar1 =true;
                do {
                    je = JOptionPane.showInputDialog("JUMLAH DATA EDIT [1 - " + (z + 1) + "]");
                    n_je = Integer.parseInt(je);
                } while (!(n_je >= 1 & n_je <= (z + 1)));

                d = n_je - 1;
                info="";
                info += "DATA KE = " + n_je + "\n";
                info += "NAMA KARYAWAN      =" + nk[d] + "\n";
                info += "JENIS KELAMIN      =" + ket[d] + "\n";
                info += "ALAMAT             =" + almt[d] + "\n";
                info += "POSISI PEKERJAAN   =" + pss[d] + "\n";
                info += "DEPARTEMEN         =" + dpt[d] + "\n";
                info += "NILAI KINERJA      =" + nkinerj[d] + "\n";
                info += "NILAI KEHADIRAN    =" + khd[d] + "%" + "\n";;
                    JOptionPane.showMessageDialog(null, info, "INFO DATA EDIT", JOptionPane.INFORMATION_MESSAGE);
                info = "";
                ph = JOptionPane.showInputDialog("DATA EDIT \n1. NAMA KARYAWAN\n2. JENIS KELAMIN\n3. ALAMAT\n4. POSISI PEKERJAAN \n5. DEPARTEMEN \n6. NILAI KINERJA \n7. NILAI KEHADIRAN \n  PILIH [1-7]\n");
                if ("1".equals(ph)) {
                    namaKaryawan = JOptionPane.showInputDialog("NAMA KARYAWAN");
                    nk[d] = namaKaryawan;
                }
                else if ("2".equals(ph)) {
                    do {
                        try {
                            jk = JOptionPane.showInputDialog("JENIS KELAMIN\n 1.LAKI-LAKI\n 2.PEREMPUAN\nPILIH [1-5]");
                            n_jk = Integer.parseInt(jk);
                            if ("1".equals(jk)) {
                                putar = false;
                                jk = "LAKI-LAKI";
                            } else if ("2".equals(jk)) {
                                putar = false;
                                jk = "PEREMPUAN";
                            }
                        } catch (Exception e) {
                            putar = true;
                            JOptionPane.showMessageDialog(null, "DATA YANG INPUT SALAH, MASUKAN DATA LAGI");
                        }
                    } while (putar);
                    ket[d] = jk;
                }
                else if ("3".equals(ph)) {
                    alamat = JOptionPane.showInputDialog("ALAMAT");
                    almt[d] = alamat;
                }
                else if ("4".equals(ph)) {
                    posisi = JOptionPane.showInputDialog("POSISI PEKERJAAN");
                    pss[d] = posisi;
                }
                else if ("5".equals(ph)) {
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
                    dpt[d] = departemen;
                }
                else if ("6".equals(ph)) {
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
                    nkinerj[d] = nilaiKinerja;
                }
                else if ("7".equals(ph)) {
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
                    khd[d] = nilaiKehadiran;
                } 
                info += "NAMA KARYAWAN      =" + nk[d] + "\n";
                info += "JENIS KELAMIN      =" + ket[d] + "\n";
                info += "ALAMAT             =" + almt[d] + "\n";
                info += "POSISI PEKERJAAN   =" + pss[d] + "\n";
                info += "DEPARTEMEN         =" + dpt[d] + "\n";
                info += "NILAI KINERJA      =" + nkinerj[d] + "\n";
                info += "NILAI KEHADIRAN    =" + khd[d] + "%" + "\n";;
                JOptionPane.showMessageDialog(null, info, "HASIL EDIT", JOptionPane.INFORMATION_MESSAGE);
                info = "";
                info += "                                                  Laporan Hasil Kinerja Karyawan              \n";
                info += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
                info += "NO   NAMA       JENIS KELAMIN        ALAMAT       POSISI        DEPARTEMEN     KINERJA       KEHADIRAN \n";
                info += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
                no = 0;
                gt = 0;
                l = 0;
                p = 0;
                totalKinerja = 0;
                totalKehadiran = 0;
                koreksi = 0;
                for (d = 0; d <= z; d=d+1) {
                    no = no + 1;
                    totalKinerja = totalKinerja + nkinerj[d];
                    totalKehadiran = totalKehadiran + khd[d];
                    gt = l + p;
                    koreksi = totalKinerja * def;
                    if ("LAKI-LAKI".equals(ket[d])) {
                        l = l + 1;
                    } else if("PEREMPUAN".equals(ket[d])) {
                        p = p + 1;
                    }
                    info += no + "       " + nk[d] + "         " + ket[d] + "              " + almt[d] + "     " + pss[d] + "        " + dpt[d] + "              " + nkinerj[d] + "                    " + khd[d] + "%" + "\n";
                }
                info += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
                info += "NILAI RATA RATA KINERJA     =   " + totalKinerja / no + "\n";
                info += "NILAI RATA RATA KEHADIRAN     =   " + totalKehadiran / no + "\n";
                info += "DEFIASI DARI TOTAL KINERJA     =   " + koreksi + "\n";
                info += "TOTAL KARYAWAN LAKI-LAKI     =   " + l + "\n";
                info += "TOTAL KARYAWAN PEREMPUAN     =   " + p + "\n";
                info += "TOTAL SEMUA KARYAWAN     =   " + gt + "\n";
                JOptionPane.showMessageDialog(null, info, "REKAP KINERJA KARYAWAN", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (putar1);
    }
}
