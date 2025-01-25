package kuis_fikar_01;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Kuis_Fikar_05 
{
    public static void main(String[] args) 
    {
        String info="";
        Scanner mobil = new Scanner (System.in);
        String al = "";
        System.out.print(" ALAMAT     = ");al = mobil.next();
        info += " ALAMAT ="+al+"\n";
        JOptionPane.showMessageDialog(null,info," ALAMAT", JOptionPane.INFORMATION_MESSAGE);
    } 
}
