package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_18 
{
    public static void main(String[] args) 
    {
        int awal, dua, ulang = 0;
        int gt = 0;
        do 
        {
            awal = 210;
            int baris3 = 0;
            do 
            {
                dua = awal; 
                int baris2 = 0;
                int tot = 0; 
                do 
                {
                    System.out.print(dua + " ");
                    tot = tot + dua; 
                    dua = dua - 10; 
                    baris2 = baris2 + 1;
                } 
                while (baris2 <= 3);  
                System.out.println("= " + tot); 
                gt = gt + tot;
                awal = awal - 40; 
                baris3 = baris3 + 1;
            } 
            while (baris3 <= 2); 
            ulang = ulang + 1;
        } 
        while (ulang <= 1);  
        System.out.println("--------------------- +");
        System.out.println("Total Keseluruhan = "+gt);
        System.out.println("");
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
