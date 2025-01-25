package kuis_fikar_01;
import javax.swing.*;
public class Kuis_Fikar_08 {
    public static String pil = "",kt = "", info = "", lagi = "",st="";
    public static int n_tk = 0, x = -1,y=0,n_st=0,no=0,g=0,s=0,b=0,n_pil=0,lam=0;
    public static float n_ss = 0.0f;
    public static boolean balek=true;
    public static void main (String [] args)
    {
        int th_umur [];
        th_umur = new int [3];
        String ket [] = null;
        ket = new String [3];
        do
        {
            try
            {
                balek = false;
                st = JOptionPane.showInputDialog("TAHUN SEKARANG");
                n_st = Integer.parseInt(st);
            }
            catch (Exception e)
            {
                balek = true;
                JOptionPane.showMessageDialog(null,"DATA SALAH,INPUT ULANG");
            }
        }
        while(balek);
        do
        {
            do
            {
                try
                {
                    x = x + 1;
                    pil = JOptionPane.showInputDialog("UMUR ANDA\n");
                    n_pil = Integer.parseInt(pil);
                    if(n_pil<=30)
                    {
                        balek = false;
                        kt = "REMAJA";
                    }
                    else if(n_pil<=310)
                    {
                        balek = false;
                        kt = "DEWASA";
                    }
                    else
                    {
                        balek = false;
                        kt = "MANULA";
                    }
                }
                catch (Exception e)
                {
                    balek = true;
                    JOptionPane.showMessageDialog(null,"DATA SALAH,INPUT ULANG");
                }
            }
            while(balek);
                th_umur[x] = n_pil;
                ket[x] = kt;
                info += "    UMUR ANDA  = "+th_umur[x]+"\n";
                info += "    KETERANGAN  = "+ket[x]+"\n";
                JOptionPane.showMessageDialog(null,info,"INFO UMUR",JOptionPane.INFORMATION_MESSAGE);
                info = "";
                do 
                {
                    try
                    {
                        balek = false;
                        lagi = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
                        if(x==2)
                        {
                            JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH, KELUAR");
                            lagi = "t";
                        }
                    }
                    catch (Exception e)
                    {
                        balek = true;
                        JOptionPane.showMessageDialog(null,"DATA SALAH,INPUT ULANG");
                    }
                }
                while(balek);
        }
        while("y".equals(lagi) | "Y".equals(lagi));
        info += "";
        info += "                   REKAP UMUR                  \n";
        info += "--------------------------------------------------------\n";
        info += "NO   UMUR  KETERANGAN  LAHIR TAHUN\n";
        info += "--------------------------------------------------------\n";
        no = 0;
        for (y=0; y <=x; y = y + 1)
        {
            no = no + 1;
            lam = n_st - n_pil;
            info += no+"        "+th_umur[y]+"          "+ket[y]+"               "+lam+"         "+"\n";
            if("REMAJA".equals(ket[y]))
            {
                g = g + 1;
            }
            else if("DEWASA".equals(ket[y]))
            {
                s = s + 1;
            }
            else if("MANULA".equals(ket[y]))
            {
               b = b + 1;
            }
        }
        info += "--------------------------------------------------------\n";
        info += "UMUR 1 - 30    = "+g+"  ORANG"+"\n";
        info += "UMUR 31 - 45    = "+s+" ORANG"+"\n";
        info += "UMUR 46 - 100   = "+b+" ORANG"+"\n";
        JOptionPane.showMessageDialog(null,info,"REKAP UMUR",JOptionPane.INFORMATION_MESSAGE);
    }
}
