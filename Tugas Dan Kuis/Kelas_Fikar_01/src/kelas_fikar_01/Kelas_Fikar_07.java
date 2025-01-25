package kelas_fikar_01;
public class Kelas_Fikar_07 
{
    public static void main(String[] args) 
    {
        int ut = 1; int sp = 13; int ck = 90; int gt = 0;
        do
        {
            int op = ut; int tot = 0;
            while(op>=1)
            {
                System.out.print(ck+" ");
                tot = tot + ck;
                ck = ck - 1;
                op = op - 1;
            }
            int tr = sp;
            while(tr>=1)
            {
                System.out.print(" ");
                tr = tr - 1;
            }
            System.out.println(" = "+tot);
            gt = gt + tot;
            sp = sp - 3;
            ut = ut + 1;
        }
        while(ut<6);
        System.out.println("-------------------- +");
        System.out.println("Total Keseluruhan = "+gt);
        System.out.println("");
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
