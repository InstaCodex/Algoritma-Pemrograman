package kelas_fikar_01;
import javax.swing.JOptionPane;
public class Kelas_Fikar_13 {
    public static String tk = "", tp = "", pil = "", ss = "", kt = "", info = "", lagi = "";
    public static int n_tk = 0, x = -1;
    public static float n_ss = 0.0f;
    public static void main (String [] args)
    {
        int th_kejadian [];
        th_kejadian = new int [3];
        String tempat [] = null;
        tempat = new String [3];
        String ket [] = null;
        ket = new String [3];
        float sk [];
        sk = new float [3];
        do
        {
        x = x + 1;
        tk = JOptionPane.showInputDialog("TAHUN KEJADIAN");
        n_tk = Integer.parseInt(tk);
        tp = JOptionPane.showInputDialog("TEMPAT");
        pil = JOptionPane.showInputDialog("KETERANGAN \n 1. GEMPA \n 2. SUNAMI \n 3. BANJIR \n PILIH [1-3] \n");
        if("1".equals(pil))
        {
            ss = JOptionPane.showInputDialog("SEKALAR REHTER");
            n_ss = Float.parseFloat(ss);
            kt = "GEMPA";
        }
        else if ("2".equals(pil))
        {
            ss = JOptionPane.showInputDialog("SEKALAR REHTER");
            n_ss = Float.parseFloat(ss);
            kt = "SUNAMI";
        }
        else
        {
            n_ss = 0.0f;
            kt = "BANJIR";
        }
        th_kejadian[x] = n_tk;
        tempat[x] = tp;
        ket[x] = kt;
        sk[x] = n_ss;
        info += "    TAHUN KEJADIAN  = "+th_kejadian[x]+"\n";
        info += "    TEMPAT          = "+tempat[x]+"\n";
        info += "    KETERANGAN      = "+ket[x]+"    SEKALAR REHTER = "+sk[x]+"\n";
        JOptionPane.showMessageDialog(null,info,"INFO BENCANA",JOptionPane.INFORMATION_MESSAGE);
        info = "";
        lagi = JOptionPane.showInputDialog("INPUT KEJADIAN [Y/T]");
        }
        while("y".equals(lagi) | "Y".equals(lagi));
    }
}
