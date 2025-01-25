package lab_fikar_01;
import javax.swing.JOptionPane;
public class Lab_Fikar_11 
{
    public static void main(String[] args)
    {
        int tk =0,tp=0,td=0;
        float rrd = 0.0f;
        String gempa = "y"; int x = 0;
        String rekap = "";
        String tampung = "";
        tampung += "                     LAPORAN DAERAH GEMPA                           \n";
        tampung += "                     --------------------                           \n";
        tampung += "--------------------------------------------------------------------\n";
        tampung += "NO          DAERAH          JUMLAH KEMATIAN         JUMLAH PENGUNGSI            DANA\n";
        do
        {
            x = x + 1;
            String dg = JOptionPane.showInputDialog("DAERAH GEMPA KE"+x);
            String jk = JOptionPane.showInputDialog("JUMLAH KEMATIAN"+x);
            int n_jk = Integer.parseInt(jk); 
            String jp = JOptionPane.showInputDialog("JUMLAH PENGUNGSI"+x);
            int n_jp = Integer.parseInt(jp); 
            String db = JOptionPane.showInputDialog("DANA BANTUAN"+x);
            int n_db = Integer.parseInt(db); 
            rekap += "DAERAH GEMPA = "+dg+"\n";
            rekap += "JUMLAH KEMATIAN = "+jk+"\n";
            rekap += "JUMLAH PENGUNGSI = "+n_jp+"\n";
            rekap += "DANA BANTUAN = "+db+"\n";
            tampung += " "+x+"                 "+dg+"                         "+jk+"                                              "+jp+"                               "+db+"\n";
            tk = tk + n_jk;
            tp = tp + n_jp;
            td = td + n_db;
            JOptionPane.showMessageDialog(null, rekap,"REKAP GEMPA",JOptionPane.INFORMATION_MESSAGE);
            gempa = JOptionPane.showInputDialog("INPUT DAERAH GEMPA [Y/T]");
            rekap = "";
        }
        while("y".equals(gempa) | "Y".equals(gempa));
        rrd = td/x;
        tampung += "--------------------------------------------------------------------\n";
        tampung += "        TOTAL KEMATIAN  =   "+tk+"\n";
        tampung += "        TOTAL PENGUNGSI  =   "+tp+"\n";
        tampung += "        TOTAL DANA  =   "+td+"\n";
        tampung += "        RATA RATA DANA  =   "+rrd+"\n";
        JOptionPane.showMessageDialog(null, tampung,"LAPORAN REKAP GEMPA",JOptionPane.INFORMATION_MESSAGE);
    }
}
