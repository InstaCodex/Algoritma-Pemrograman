package kelas_fikar_01;
import javax.swing.JOptionPane;
public class Kelas_Fikar_12 
{
  public static String lagi="y",lw="",ng="",ket ="",td="",rekap="",st="",info="";
    public static boolean putar=true;
    public static int x = 0,n_td=0,tk=0,no=0,tot=0;
    public static float rrd=0.0f;
    public static void main(String[]args)
    {
        rekap += "                         LAPORAN WISATA                             \n";
        rekap += "                  ------------------------------------                      \n";
        rekap += " ------------------------------------------------------------------------\n";
        rekap += "NO   WISATA   NEGARA    DOLLAR     TUKAR      STATUS           \n";
        rekap += " ------------------------------------------------------------------------\n";
        do
        {
            no = no + 1;
            lw = JOptionPane.showInputDialog("LOKASI WISATA");
            x = 0;
            do
            {
            ng = JOptionPane.showInputDialog("NEGARA \n1. INDONESIA \n2. ASING");
            if("1".equals(ng) | "2".equals(ng))
            {
                putar = false;
            }
            else
            {
                x = x + 1;
                JOptionPane.showMessageDialog(null," SUDAH SALAH KE = "+x);
                putar = true;
            }
            }
            while(putar);
            tk = 0;
            if("1".equals(ng))
            {
                ket ="INDONESIA";
                st ="BOKEK";
               
            }
            else
            {
                do
                {
                try
                {
                td = JOptionPane.showInputDialog("TUKAR DOLLAR");
                n_td  = Integer.parseInt(td);
                tk = n_td * 15000;
                ket ="ASING";
                putar = false;
                if (n_td <= 0)
                {
                    st ="BOKEK";
                }
                else if (n_td < 5)
                {
                    st ="LUMAYAN";
                }
                else if (n_td < 20)
                {
                    st ="SUGIH";
                }
                else
                {
                    st ="KAYA";
                }
                
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null,"DATA ERROR");
                    putar = true;
                }
                }
                while(putar);
            }
                info += " WISATA "+lw+"\n";
                info += " DIKUNJUNGI OLEH ORANG "+ket+"\n";
                info += " NILAI TUKAR RP "+tk+"\n";
                JOptionPane.showMessageDialog(null,info,"NO = "+no,JOptionPane.INFORMATION_MESSAGE);
                info="";
                lagi = JOptionPane.showInputDialog("INPUT WISATA [Y/T]");
                tot = tot + n_td;
                rrd = tot/no;
                rekap +=" "+no+"      "+lw+"     "+ket+"        "+n_td+"               "+tk+"             "+st+"\n";
        }
        while ("y".equals(lagi) | "Y".equals(lagi));
        rekap += " ------------------------------------------------------------------------\n";
        rekap += " TOTAL DOLLAR = "+tot+"\n";
        rekap += " RATA-RATA TUKAR/WISATA = "+rrd+"\n";
        JOptionPane.showMessageDialog(null,rekap,"REKAP WISATA",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("");
    }
}
