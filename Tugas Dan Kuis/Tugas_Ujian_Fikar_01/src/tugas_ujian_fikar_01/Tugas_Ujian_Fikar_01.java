package tugas_ujian_fikar_01;

public class Tugas_Ujian_Fikar_01 
{
    public static void main(String[] args) {
        int ci = 1, ck = 1; 
        int gt = 0; 
        while (ci <= 3) {
            int ut = 5;
            int i = 1; 
            int z = 2;
            int total = 0; 
            do {
                int j = ut - i;
                while (j > 0) {
                    System.out.print(" "); 
                    j = j -1;
                }
                int k = 1; 
                while (k <= i) {
                    System.out.print(ck + " ");
                    total = total + ck; 
                    k = k +1;
                }
                System.out.println(""); 
                i = i + z;
                z = 1;
            } while (i <= 5);       
            System.out.println("---------- +");
            System.out.println("Total: " + total);
            gt = gt + total;
            System.out.println(""); 
            ci = ci + 1;
            ck = ck +1;
        }
        System.out.println("Total Keseluruhan: " + gt);
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
