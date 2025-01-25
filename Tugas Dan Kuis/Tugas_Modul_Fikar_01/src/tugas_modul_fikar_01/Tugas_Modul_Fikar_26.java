package tugas_modul_fikar_01;
import java.util.Scanner;
public class Tugas_Modul_Fikar_26 
{
    public static void main(String[] args) 
    {
        String info="";
        String ulang="Y";
        String nb = "";
        int hb=0,jb=0,jg=0,no=0;
        Scanner mobil = new Scanner (System.in);
        while(("y".equals(ulang) | ("Y".equals(ulang))))
        {
            no = no + 1;
            System.out.print("NO: "+no);
            System.out.print("\n");
            System.out.println("         TOKO MAKMUR SEJAHTERA         ");
            System.out.println("    --------------------------------    ");
            System.out.println("         PEMBELIAN KONSUMEN         ");
            info += "  TOKO MAKMUR SEJAHTERA \n";
            info += "  -------------- \n";
            System.out.print("1. NAMA BARANG    = ");nb = mobil.next();
            System.out.print("2. HARGA BARANG   = ");hb = mobil.nextInt();
            System.out.print("3. JUMLAH BARANG  = ");jb = mobil.nextInt();
            jg = hb * jb;
            System.out.print("   JUMLAH HARGA   = "+jg);
            System.out.print("\n");
            System.out.print("NAMA BARANG  : "+nb+"  TOTAL  : "+jb+"   HARGA BARANG  :  "+jg);
            System.out.print("\n");
            System.out.print("  INPUT DATA LAGI [Y/T]   =  ");ulang = mobil.next();
            System.out.println("    --------------------------------    ");
        }
        System.out.println("         REKAP BARANG         ");
        System.out.println("1. TOTAL JUMLAH BARANG      = "+jb);
        System.out.println("2. TOTAL BAYAR              = "+jg);
        System.out.println("         TERIMAKASIH         ");
        System.out.println("FIKAR DWI RAMADHANI 0022");
    } 
}
