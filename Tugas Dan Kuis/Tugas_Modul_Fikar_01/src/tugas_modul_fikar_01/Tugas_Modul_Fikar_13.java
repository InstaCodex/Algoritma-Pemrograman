package tugas_modul_fikar_01;

public class Tugas_Modul_Fikar_13 {
    public static void main(String[] args) 
    {
        int ac = 2, a = 7, ad = 4, c = 2, hasil = 0;
        while(ac <= 4)
        {
            int ab = ac, b = 5, total = 0;
            while(b >= ad)
            {
                hasil = a + b - c;
                System.out.println(a+" + "+b+" - "+c+" = "+hasil);
                total = total + hasil;
                c = c + 1;
                b = b - 1;
                a = a + 1;
                ab = ab - 1;
            }
            System.out.println("--------------- +");
            System.out.println("Total = "+total);
            ad = ad - 1;
            ac = ac + 1;
        }
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
