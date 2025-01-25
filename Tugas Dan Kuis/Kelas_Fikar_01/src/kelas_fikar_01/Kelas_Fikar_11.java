package kelas_fikar_01;
import java.util.Scanner;
public class Kelas_Fikar_11 
{
    public static void main(String[] args) 
    {
	Scanner toko = new Scanner(System.in);
	String lagi = "Y"; int x = 0;
	String nk = "", pil = "", mk=""; int hk = 0;
	String ket1="",ket2="";
	while("y".equals(lagi) | "Y".equals(lagi))
            {
                x = x + 1;
                System.out.println("NO = "+x);
                System.out.println("       PENGIRIMAN BARANG         ");
		System.out.println("--------------------------");
		System.out.print(" 1. NAMA KOTA = ");nk=toko.next();
		System.out.print(" 2. WILAYAH [1.Sumatra 2. Jawa 3. Kalimantan] = ");pil=toko.next();
		System.out.print(" 3. HARGA KIRIM = ");hk=toko.nextInt();
		System.out.print(" 4. MODEL KIRIM [A. Biasa B. Cepat]");mk=toko.next();
		if("1".equals(pil))
		{
                    ket1 = "SUMATRA";
		}
		else if("2".equals(pil))
		{
                    ket1 = "JAWA";
		}
		else if("3".equals(pil))
		{
                    ket1 = "KALIMANTAN";
		}	
		if("A".equals(mk))
		{
                    ket2 = "BIASA";
		}
		else if("B".equals(mk))
		{
                    ket1 = "CEPAT";
		}
		System.out.println("    NAMA KOTA = "+nk);
		System.out.println("    WILAYAH = "+ket1);
		System.out.println("    HARGA KIRIM = "+hk);
		System.out.println("    MODEL KIRIM = "+ket2);
		System.out.print("    INGIN KIRIM BARANG [Y/T] = ");lagi=toko.next();
            }
        }
}
