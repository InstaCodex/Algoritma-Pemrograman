package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_19 {
    public static void main(String[] args) {
        int a = 2; 
        int b = 0;
        int c = 6;
        int gt = 0;
        do {
            int d = c; 
            do {
                System.out.print(" ");
                d = d - 1;
            } while (d > 0);
            int ab = a + b; 
            int tot = 0;
            int f = 0;
            do {
                System.out.print(ab + " ");
                tot = tot + ab; 
                f = f + 1;
            } while (f <= b);
            int g = 6; 
            g = g - b; 
            int cc = 0; 
            do {
                System.out.print(" ");
                cc = cc + 1;
            } while (cc < g);
            System.out.println("= " + tot); 
            c = c - 1; 
            b = b + 1;
            gt = tot + gt;
        } while (b < 6); 
        System.out.println("--------------- +");
        System.out.println("Total Keseluruhan = "+gt);
        System.out.println("");
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
