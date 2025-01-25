package tugas_modul_fikar_01;

public class Tugas_Modul_Fikar_15 
{
    public static void main(String[] args) 
	{
            int utama = 1, ck = 21, sarang, srg, tot, gt = 0;
            while(utama<=5)
            {
                sarang = 1;
                srg = sarang;
                tot = 0;
                do 
                {
                    System.out.print(ck+" "); 
                    tot = tot + ck;
                    ck = ck + 1;
                    srg = srg + 1;
                }
                while(srg<=5);
                System.out.println(" = "+tot); 
                gt = gt + tot;
                utama = utama + 1;
            }     
            System.out.println("----------------- +");
            System.out.println("Total Keseluruhan = "+gt);
            System.out.println("");
            System.out.println("FIKAR DWI RAMADHANI 0022");
            
        }
}
