package kelas_fikar_01;
public class Kelas_Fikar_06 
{
    public static void main(String[] args) 
    {
        int a = 5; int jk = 5;
        while(a<=8)
        {
            int bt = 1; int tot = 0;
            while(bt<=3)
            {
                System.out.println(" "+jk);
                tot = tot + jk;
                jk = jk + 1;
                bt = bt + 1;
            }
            System.out.println("--- +");
            System.out.println("Total = "+tot);
            a = a + 3;
        }
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}


