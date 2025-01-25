package lab_fikar_01;
import javax.swing.JOptionPane;
public class Lab_Fikar_07 
{
    public static void main(String[] args) 
    {
        String info=""; int t = 0;
        for(int a = 20; a<=60; a=a+20)
        {
          info += " "+a+"\n"; 
          t = t + a;
        }
        info += "  -------------- +\n";
        info += " Total ="+t+"\n";
        JOptionPane.showMessageDialog(null,info,"FIKAR DWI RAMADHANI", JOptionPane.INFORMATION_MESSAGE);
    }
}
