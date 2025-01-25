package kelas_fikar_01;
import javax.swing.*;
public class Kelas_Fikar_14 {
    public static String tk = "", tp = "", pil = "", ss = "", kt = "", info = "", lagi = "y", st = "";
    public static int n_tk = 0, x = -1, y = 0, n_st = 0, no = 0, lama = 0, g = 0, s = 0, b = 0;
    public static float n_ss = 0.0f;
    public static boolean putar = false;

    // TEMPAT EDIT
    public static String ed = "", je = "", p = "";
    public static boolean putar1 = false;
    public static int n_je = 0, d = 0;

    public static void main(String[] args) {
        int th_kejadian[];
        th_kejadian = new int[3];
        String tempat[] = null;
        tempat = new String[3];
        String ket[] = null;
        ket = new String[3];
        float sk[];
        sk = new float[3];

        do {
            try {
                st = JOptionPane.showInputDialog("TAHUN SEKARANG");
                n_st = Integer.parseInt(st);
                putar = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                putar = true;
            }
        } while (putar);

        do {
            x = x + 1;
            do {
                try {
                    tk = JOptionPane.showInputDialog("TAHUN KEJADIAN");
                    n_tk = Integer.parseInt(tk);
                    putar = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                    putar = true;
                }
            } while (putar);

            tp = JOptionPane.showInputDialog("TEMPAT");

            do {
                pil = JOptionPane.showInputDialog("KETERANGAN \n1. GEMPA \n2. SUNAMI \n3. BANJIR\nPILIH [1-3]\n");
            } while (!("1".equals(pil) | "2".equals(pil) | "3".equals(pil)));

            if ("1".equals(pil)) {
                do {
                    try {
                        ss = JOptionPane.showInputDialog("SEKALA REHTER");
                        n_ss = Float.parseFloat(ss);
                        putar = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                        putar = true;
                    }
                } while (putar);
                kt = "GEMPA";
            } else if ("2".equals(pil)) {
                do {
                    try {
                        ss = JOptionPane.showInputDialog("SEKALA REHTER");
                        n_ss = Float.parseFloat(ss);
                        putar = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                        putar = true;
                    }
                } while (putar);
                kt = "SUNAMI";
            } else {
                n_ss = 0.0f;
                kt = "BANJIR";
            }

            th_kejadian[x] = n_tk;
            tempat[x] = tp;
            ket[x] = kt;
            sk[x] = n_ss;

            info += " TAHUN KEJADIAN  = " + th_kejadian[x] + "\n";
            info += " TEMPAT          = " + tempat[x] + "\n";
            info += " KETERANGAN      = " + ket[x] + " SEKALAREHTER = " + sk[x] + "\n";
            JOptionPane.showMessageDialog(null, info, "INFO BENCANA", JOptionPane.INFORMATION_MESSAGE);
            info = "";

            lagi = JOptionPane.showInputDialog(" INPUT KEJADIAN [Y/T]");
            if (x == 2) {
                JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH, TOLONG KELUAR");
                lagi = "t";
            }
        } while ("y".equals(lagi) | "Y".equals(lagi));

        info = "";
        info += "          LAPORAN BENCANA DAERAH             \n";
        info += " ------------------------------------------- \n";
        info += " NO TAHUN SELAMA TEMPAT KEJADIAN SKREKTER RK \n";
        info += " ------------------------------------------- \n";

        no = 0;
        for (y = 0; y <= x; y = y + 1) {
            no = no + 1;
            lama = n_st - th_kejadian[y];
            info += no + "   " + th_kejadian[y] + "   " + lama + " Th.  " + tempat[y] + "   " + ket[y] + "   " + sk[y] + "\n";
            if ("GEMPA".equals(ket[y])) {
                g = g + 1;
            } else if ("SUNAMI".equals(ket[y])) {
                s = s + 1;
            } else {
                b = b + 1;
            }
        }

        info += " ------------------------------------------- \n";
        info += "      GEMPA        = " + g + "\n";
        info += "      SUNAMI       = " + s + "\n";
        info += "      BANJIR       = " + b + "\n";
        JOptionPane.showMessageDialog(null, info, "REKAP BENCANA", JOptionPane.INFORMATION_MESSAGE);

        info = "";
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
                JOptionPane.showMessageDialog(null, "MULAI EDIT DONG ........");
                do {
                    je = JOptionPane.showInputDialog("JUMLAH DATA EDIT [1 - " + (x + 1) + "]");
                    n_je = Integer.parseInt(je);
                } while (!(n_je >= 1 & n_je <= (x + 1)));

                d = n_je - 1;
                info += "Data ke = " + n_je + "\n";
                info += " TAHUN KEJADIAN  = " + th_kejadian[d] + "\n";
                info += " TEMPAT          = " + tempat[d] + "\n";
                info += " KETERANGAN      = " + ket[d] + " SEKALAREHTER = " + sk[d] + "\n";
                JOptionPane.showMessageDialog(null, info, "INFO BENCANA", JOptionPane.INFORMATION_MESSAGE);
                info = "";

                p = JOptionPane.showInputDialog("DATA EDIT \n1. TAHUN KEJADIAN\n2. TEMPAT\n3. KETERANGAN\n4. SEKALAHREAKTER \n    [1-4]\n");

                if ("1".equals(p)) {
                    do {
                        try {
                            tk = JOptionPane.showInputDialog("TAHUN KEJADIAN");
                            n_tk = Integer.parseInt(tk);
                            putar = false;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                            putar = true;
                        }
                    } while (putar);
                    th_kejadian[d] = n_tk;
                } else if ("2".equals(p)) {
                    tp = JOptionPane.showInputDialog("TEMPAT");
                    tempat[d] = tp;
                } else if ("3".equals(p)) {
                    do {
                        pil = JOptionPane.showInputDialog("KETERANGAN \n1. GEMPA \n2. SUNAMI \n3. BANJIR\nPILIH [1-3]\n");
                    } while (!("1".equals(pil) | "2".equals(pil) | "3".equals(pil)));

                    if ("1".equals(pil)) {
                        kt = "GEMPA";
                    } else if ("2".equals(pil)) {
                        kt = "SUNAMI";
                    } else {
                        kt = "BANJIR";
                    }
                    ket[x] = kt;
                    putar1 = true;
                } else {
                    do {
                        try {
                            ss = JOptionPane.showInputDialog("SEKALA REHTER");
                            n_ss = Float.parseFloat(ss);
                            putar = false;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                            putar = true;
                        }
                    } while (putar);
                    sk[d] = n_ss;
                }

                info += "Data ke = " + n_je + "\n";
                info += " TAHUN KEJADIAN  = " + th_kejadian[d] + "\n";
                info += " TEMPAT          = " + tempat[d] + "\n";
                info += " KETERANGAN      = " + ket[d] + " SEKALAREHTER = " + sk[d] + "\n";
                JOptionPane.showMessageDialog(null, info, "INFO BENCANA", JOptionPane.INFORMATION_MESSAGE);
                info = "";
                putar1 = true;
            }
        } while (putar1);
    }
}
