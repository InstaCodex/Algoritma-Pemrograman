package kuis_fikar_01;
import javax.swing.JOptionPane;
public class Kuis_Fikar_07 
{
    public static String lagi="y",ng="",sp="",ket="",pn="",tampil ="",k ="",y="",r="",tampung="";
    public static int n_pn = 0,rp=0,no = 0,x = 0,l=0,t=0,p=0,tk=0;
    public static boolean putar=true;
    public static void main(String[]args)
    {
        tampung += "                                LAPORAN KEKAYAAN NEGARA               \n";
        tampung += "                   ------------------------------------------------------------------                \n";
        tampung += "----------------------------------------------------------------------------------------------------------\n";
        tampung += " NO   NEGARA   SUMBER    PENDAPATAN    PENDAPATAN   KESIMPULAN \n";
        tampung += "----------------------------------------------------------------------------------------------------------\n";
         
        do
        {
            no = no + 1;
            ng = JOptionPane.showInputDialog("NEGARA KAYA/MSIKIN");
            do
            {
                sp = JOptionPane.showInputDialog("SUMBER PENDAPATAN \n1. LAUT \n2. TAMBANG \n3. PERTANIAN \n4. TENAGA KERJA \n PILIH [1-4]");
                if("1".equals(sp) | "2".equals(sp) | "3".equals(sp) | "4".equals(sp))
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
            if ("1".equals(sp))
            {
                ket ="LAUT";
                k ="KAYA";
                l = l + 1;
            }
            else if ("2".equals(sp))
            {
                ket ="TAMBANG";
                k ="KAYA";
                t = t + 1;
            }
            else if ("3".equals(sp))
            {
                ket ="PERTANIAN";
                k ="KAYA";
                p = p + 1;
            }
            else 
            {
                ket ="TENAGA KERJA";
                k ="MISKIN";
                tk = tk + 1;
            }
            do
            {
                try
                {
                pn = JOptionPane.showInputDialog("PENDAPATAN $");
                n_pn = Integer.parseInt(pn);
                rp = n_pn * 15000;
                
                if (n_pn < 20)
                {
                    r ="MISKIN";
                }
                else if (n_pn < 50)
                {
                    r ="SEDENG";
                }
                else if (n_pn < 100)
                {
                    r ="CUKUP";
                }
                else
                {
                    r ="SANGAT KAYA";
                }
                putar = false;
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null,"DATA ERROR");
                    putar = true;
                }
            }
            while(putar);
            tampil += " NEGARA "+ng+" ADALAH "+k+"\n";
            tampil += " SUMBER "+ket+" ADALAH "+r+"\n";
            tampil += " PENDAPATAN "+n_pn+" RP "+rp+"\n";
            tampil += " --------------------------------- \n";
            tampil += " KESIMPULAN = "+k+" TAPI "+r+"\n";
            JOptionPane.showMessageDialog(null,tampil,"KESIMPULAN",JOptionPane.INFORMATION_MESSAGE);
            tampil="";
            lagi = JOptionPane.showInputDialog("INPUT NEGARA [Y/T]");
            tampung +=" "+no+"     "+ng+"      "+ket+"            "+n_pn+"                "+k+"           TAPI "+r+"\n";
        }
        while("y".equals(lagi) | "Y".equals(lagi));
        tampung += "----------------------------------------------------------------------------------------------------------\n";
        tampung += "SUMBER PENDAPATAN \n";
        tampung += "1.LAUT            = "+l+"\n";
        tampung += "2.TAMBANG         = "+t+"\n";
        tampung += "3.PERTANIAN       = "+p+"\n";
        tampung += "4.TENAGA KERJA    = "+tk+"\n";
        JOptionPane.showMessageDialog(null,tampung,"REKAP DATA KEKAYAAN NEGARA",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("");
    }
}
