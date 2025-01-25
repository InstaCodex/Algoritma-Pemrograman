package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_10 
{
    public static void main(String[] args) 
    {
        int utama = 3;
        while(utama<=5)
        {
            int tt = 0, jm = 0, sarang = 12;
            do
            {
                jm = sarang + utama;
                System.out.println(" "+sarang+" + "+utama+" = "+jm);
                tt = tt + jm;
                sarang = sarang + 1;
            }
            while(sarang<=14);
            System.out.println("------------------------- +");
            System.out.println(" Total "+tt);
            utama = utama + 1;
            System.out.println("");
        }
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
