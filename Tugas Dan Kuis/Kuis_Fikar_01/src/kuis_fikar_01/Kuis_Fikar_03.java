package kuis_fikar_01;
public class Kuis_Fikar_03 
{
    public static void main(String[] args) {
        int ut = 3; int a = 11; int tot = 0; int b = 2; int y = 0;
        while(ut > 0)
        {
            int c = 0; int x = 3; int z = x - y;
            while(z > 0)
            {
                c = a + b;
                System.out.println(a+" + "+b+" = "+c);
                tot = tot + c;
                b = b + 1;
                a = a + 1;
                z = z - 1;
            }
            System.out.println("----------------- +");
            System.out.println("Total = "+tot);
            y = y + 1;
            ut = ut - 1;
            a = 11;
            tot = 0;
        }
        System.out.println(" ");
        System.out.println("FIKAR DWI RAMADHANI");
    }
}