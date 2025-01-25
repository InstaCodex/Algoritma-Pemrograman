package lab_fikar_01;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Lab_Fikar_10 
{
    public static void main(String[] args) 
    {
        String info="";
        Scanner mobil = new Scanner (System.in);
        String nm = "", np = "";
        int hm=0,jm=0,hb=0,pt=0,by=0;
        System.out.println("         TOKO MOBIL         ");
        System.out.println("    -------------------    ");
        info += "  TOKO MOBIL \n";
        info += "  -------------- \n";
        System.out.print(" NAMA PEMBELI     = ");np = mobil.next();
        System.out.print("1. NAMA MOBIL     = ");nm = mobil.next();
        System.out.print("2. HARGA MOBIL     = ");hm = mobil.nextInt();
        System.out.print("3. JUMLAH MOBIL     = ");jm = mobil.nextInt();
        System.out.print("4. POTONGAN     = ");pt = mobil.nextInt();
        info += " NAMA PEMBELI  ="+np+"\n";
        info += "1. NAMA MOBIL ="+nm+"\n";
        info += "2. HARGA MOBIL ="+hm+"\n";
        info += "3. JUMLAH MOBIL ="+jm+"\n";
        info += "4. POTONGAN ="+pt+"\n";
        hb = hm * jm;
        by = hb - pt;
        System.out.println(" -------------------------- ");
        System.out.println("  HARGA BELI "+hb);
        System.out.println(" -------------------------- ");
        System.out.println(np+ "Terimakasih Sudah Membeli");
        System.out.println("      Di Toko Mobil Kami");
        System.out.println(" -------------------------- ");
        System.out.println(" BAYAR     = "+by);
        System.out.println(" -------------------------- ");
        info += "  -------------- \n";
        info += "HARGA BELI ="+hb+"\n";
        info += "  -------------- \n";
        info += np+"Terimakasih Sudah Membeli\n";
        info += "      Di Toko Mobil Kami\n";
        info += "  -------------- \n";
        info += "BAYAR     ="+by+"\n";
        info += "  -------------- \n";
        JOptionPane.showMessageDialog(null,info,np+" JoptionPane Beli", JOptionPane.INFORMATION_MESSAGE);
    } 
}
