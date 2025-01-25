package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_52 {

    public static String hasil, laporan, ket, grade;
    public static float sem_ipk = 0f, sem = 0f, tot_ipk = 0f, rata_nil = 0f, rata_ipk = 0f;
    public static int uji, x, ll = 0, tl = 0, tot_nil = 0;
    public static int no_data;
    private static int h;
    private static int jh;
    private static int x1;
    private static int x2;
    private static String tampil;
    private static int t;
    private static boolean keluar;
    private static int c;
    private static int t_data;
    private static int no;

    public static void main(String[] args) {
        no_data = 0;
        String nama[] = null;
        nama = new String[8];
        int nilai[];
        nilai = new int[8];
        float ipk[];
        ipk = new float[8];
        x = -1;
        boolean lanjut = true, lewat = true;
        String lapor = "", lagi = "y";
        keluar = true;
        do {
            if (x == 8) {
                JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
                keluar = false;
            } else {
                do {
                    x = x + 1;
                    no_data = no_data + 1;
                    String hasil = "";
                    String nm = JOptionPane.showInputDialog("NAMA MAHASISWA ");
                    nama[x] = nm;
                    do {
                        try {
                            do {
                                String nu = JOptionPane.showInputDialog("NILAI UJIAN (0-100) ");
                                uji = Integer.parseInt(nu);
                                lanjut = false;
                            } while (!(uji >= 0 & uji <= 100));
                        } catch (Exception e) {
                            lanjut = true;
                            JOptionPane.showMessageDialog(null, "ERROR , DATA SALAH INPUT");
                        }
                    } while (lanjut);
                    nilai[x] = uji;
                    if (uji <= 30) {
                        grade = "E";
                    } else if (uji <= 59) {
                        grade = "D";
                    } else if (uji <= 70) {
                        grade = "C";
                    } else if (uji <= 80) {
                        grade = "B";
                    } else {
                        grade = "A";
                    }
                    do {
                        try {
                            do {
                                String sem = JOptionPane.showInputDialog("IPK SEMESTER [0-4.00] ");
                                sem_ipk = Float.parseFloat(sem);
                                lewat = false;
                            } while (!(sem_ipk >= 0 & sem_ipk <= 4.00));
                        } catch (Exception e) {
                            lewat = true;
                            JOptionPane.showMessageDialog(null, "ERROR , DATA SALAH INPUT");
                        }
                    } while (lewat);
                    ipk[x] = sem_ipk;
                    if (sem_ipk >= 2.00) {
                        ket = "LULUS";
                    } else {
                        ket = "TIDAK LULUS";
                    }
                    hasil += "NO : " + no_data + "\n";
                    hasil += " HASIL DATA MAHASISWA \n";
                    hasil += " NAMA = " + nama[x] + "\n";
                    hasil += " NILAI = " + nilai[x] + "\n";
                    hasil += " GRADE = " + grade + "\n";
                    hasil += " IPK = " + ipk[x] + " KET " + ket + "\n";
                    JOptionPane.showMessageDialog(null, hasil, "DATA MAHASISWA", JOptionPane.INFORMATION_MESSAGE);
                    do {
                        lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T] ");
                        if (x == 7) {
                            JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
                            lagi = "T";
                        }
                    } while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));
                } while (("y".equals(lagi)) | ("Y".equals(lagi)));
            }
            keluar = false;
        } while (keluar);
        t_data = x + 1;
        h = t_data % 3;
        if (h == 0) {
            jh = t_data / 3;
        } else {
            jh = (t_data / 3) + 1;
        }
        if (jh == 1) {
            x1 = 0;
            x2 = x;
        } else {
            x1 = 0;
            x2 = 2;
        }
        no = 0;
        for (int y = 1; y <= jh; y = y + 1) {
            tampil = "";
            tampil += "Hal = " + y + "\n";
            tampil += " LAPORAN HASIL PENILAIAN MAHASISWA \n";
            tampil += " ==================================================\n";
            tampil += " NO NAMA NILAI GRADE IPK KETERANGAN \n";
            tampil += " ==================================================\n";
            tot_nil = 0;
            tot_ipk = 0;
            c = 0;
            if (y == jh) {
                x2 = x;
            }
            for (int z = x1; z <= x2; z = z + 1) {
                if (nilai[z] <= 30) {
                    grade = "E";
                } else if (nilai[z] <= 59) {
                    grade = "D";
                } else if (nilai[z] <= 70) {
                    grade = "C";
                } else if (nilai[z] <= 80) {
                    grade = "B";
                } else {
                    grade = "A";
                }
                if (ipk[z] >= 2.00) {
                    ket = "LULUS";
                    ll = ll + 1;
                } else {
                    ket = "TIDAK LULUS";
                    tl = tl + 1;
                }
                tot_nil = tot_nil + nilai[z];
                tot_ipk = tot_ipk + ipk[z];
                no = no + 1;
                tampil += " " + no + " " + nama[z] + " " + nilai[z] + " " + grade + " " + ipk[z] + " " + ket + "\n";
                c = c + 1;
            }
            rata_nil = tot_nil / c;
            rata_ipk = tot_ipk / c;
            tampil += " ==================================================\n";
            tampil += " RATA RATA NILAI = " + rata_nil + " \n";
            tampil += " RATA RATA IPK = " + rata_ipk + " \n";
            tampil += " LULUS = " + ll + "\n";
            tampil += " TIDAK LULUS = " + tl + "\n";
            tampil += " ==================================================\n";
            JOptionPane.showMessageDialog(null, tampil, "LAPORAN HASIL DATA MAHASISWA", JOptionPane.INFORMATION_MESSAGE);
            x1 = x1 + 3;
            x2 = x2 + 3;
        }
        System.exit(0);
    }
}
