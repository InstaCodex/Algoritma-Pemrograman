package tugas_modul_fikar_01;
import javax.swing.JOptionPane;
public class Tugas_Modul_Fikar_21 
{
    public static void main(String[] args) 
    {
        String tampung = " ";
        for (int nilai = 1; nilai <=5; nilai = nilai + 1)
        {
            tampung += nilai+" ";
        }
        tampung += "\n FIKAR DWI RAMADHANI 0022";
        JOptionPane.showMessageDialog(null,tampung,"DERET",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}