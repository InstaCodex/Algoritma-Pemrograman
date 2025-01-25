package lab_fikar_01;
import java.util.Scanner;
public class Lab_Fikar_09 
{
    public static void main(String[] args) 
    {
        Scanner mobil = new Scanner (System.in);
        String nm = "", np = "";
        int hm = 0, jm=0,hb=0;
        System.out.println("         TOKO MOBIL         ");
        System.out.println("    -------------------    ");
        System.out.print(" NAMA PEMBELI     = ");np = mobil.next();
        System.out.print("1. NAMA MOBIL     = ");nm = mobil.next();
        System.out.print("2. HARGA MOBIL     = ");hm = mobil.nextInt();
        System.out.print("3. JUMLAH MOBIL     = ");jm = mobil.nextInt();
        hb = hm * jm;
        System.out.println(" -------------------------- ");
        System.out.println("  HARGA BELI "+hb);
        System.out.println(" -------------------------- ");
        System.out.println(np+ "Terimakasih Sudah Membeli");
        System.out.println("      Di Toko Mobil Kami");
    } 
}
