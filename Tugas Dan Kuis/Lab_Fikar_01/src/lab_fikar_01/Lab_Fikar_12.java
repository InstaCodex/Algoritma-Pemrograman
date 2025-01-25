package lab_fikar_01;
import javax.swing.*;
public class Lab_Fikar_12 {
    public static String tk = "", tp = "", pil = "", kt = "", ss = "", info = "", lagi = "y", st = "";
    public static int n_tk = 0, x = -1, y = 0, n_st = 0, no = 0, lama = 0, g = 0, s = 0, b = 0,n_pil=0;
    public static float n_ss = 0.0f;
    public static boolean putar = true;
    public static void main(String[] args) {
        int th_kejadian[];
        th_kejadian = new int[3];
        String tempat[] = null;
        tempat = new String[3];
        String ket[] = null;
        ket = new String[3];
        float sk[];
        sk = new float[3];
        do
        {
            try
            {
                putar=false;
                st = JOptionPane.showInputDialog("TAHUN SEKARANG");
                n_st = Integer.parseInt(st);
            }
            catch (Exception e)
            {
                putar=true;
                JOptionPane.showMessageDialog(null, "ERROR, DATA SALAH INPUT");
            }
        }
        while(putar);
        do {
            x = x + 1;
            do {
                try {
                    tk = JOptionPane.showInputDialog("TAHUN KEJADIAN");
                    n_tk = Integer.parseInt(tk);
                    tp = JOptionPane.showInputDialog("TEMPAT");
                    do
                    {
                        try
                        {
                            pil = JOptionPane.showInputDialog("KETERANGAN \n1. GEMPA\n2. TSUNAMI\n3. BANJIR\nPILIH [1-3]\n");
                            if ("1".equals(pil)) 
                            {
                                n_pil = Integer.parseInt(pil);
                                putar = false;
                                ss = JOptionPane.showInputDialog("SEKALA REHTER");
                                n_ss = Float.parseFloat(ss);
                                kt = "GEMPA";
                            } 
                            else if ("2".equals(pil)) 
                            {
                                n_pil = Integer.parseInt(pil);
                                putar = false;
                                ss = JOptionPane.showInputDialog("SEKALA REHTER");
                                n_ss = Float.parseFloat(ss);
                                kt = "TSUNAMI";
                            } 
                            else 
                            {
                                n_pil = Integer.parseInt(pil);
                                putar = false;
                                n_ss = 0.0f;
                                kt = "BANJIR";
                            }
                        }
                        catch(Exception e)
                        {
                            putar=true;
                            JOptionPane.showMessageDialog(null, "ERROR, DATA SALAH INPUT");
                        }
                    }
                    while(putar);
                } 
                catch (Exception e) 
                {
                    putar = true;
                    JOptionPane.showMessageDialog(null, "ERROR, DATA SALAH INPUT");
                }
            } 
            while (putar);
            th_kejadian[x] = n_tk;
            tempat[x] = tp;
            ket[x] = kt;
            sk[x] = n_ss;
            info += " TAHUN KEJADIAN =" + th_kejadian[x] + "\n";
            info += " TEMPAT =" + tempat[x] + "\n";
            info += " KETERANGAN  =" + ket[x] + "SEKALA REHTER = " + sk[x] + "\n";
            JOptionPane.showMessageDialog(null, info, "INFO BENCANA", JOptionPane.INFORMATION_MESSAGE);
            info = "";
            lagi = JOptionPane.showInputDialog("INPUT KEJADIAN [Y/T]");
            if (x == 2) 
            {
                JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH, KELUAR");
                lagi = "t";
            }
        } 
        while ("y".equals(lagi) | "Y".equals(lagi));
        info = "";
        info += "                      LAPORAN BENCANA DAERAH                       \n";
        info += " ----------------------------------------------------------------------------------------------- \n";
        info += " NO     TAHUN   SELAMA      TEMPAT      KEJADIAN        SEKALA  RK \n";
        info += " ----------------------------------------------------------------------------------------------- \n";
        no = 0;
        for (y = 0; y <= x; y = y + 1) 
        {
            no = no + 1;
            lama = n_st - th_kejadian[y];
            info += no + "          " + th_kejadian[y] + "           " + lama + "            th." + tempat[y] + "         " + ket[y] + "            " + sk[y] + "\n";

            if ("GEMPA".equals(ket[y])) {
                g = g + 1;
            } else if ("TSUNAMI".equals(ket[y])) {
                s = s + 1;
            } else {
                b = b + 1;
            }
        }
        info += " ----------------------------------------------------------------------------------------------- \n";
        info += "          GEMPA     =" + g + "\n";
        info += "          TSUNAMI   =" + s + "\n";
        info += "          BANJIR    =" + b + "\n";
        JOptionPane.showMessageDialog(null, info, "REKAP BENCANA", JOptionPane.INFORMATION_MESSAGE);
    }
}
