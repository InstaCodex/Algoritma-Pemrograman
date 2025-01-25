package kelas_fikar_01;
public class Kelas_Fikar_16 {
    public static void main (String[] args)
    {
        mengucap ("HALLO",27, (float) 18.2);
        mengucap ("FIKAR DWI RAMADHANI",17, (float) 200.5);
        mengucap ("KAMPUS PATRIOT",77, (float) 17.20);
    }
    static void mengucap (String ucapan,int data, float nilai)
    {
        double total=0;
        total=data+nilai;
        System.out.println(ucapan+" data = "+data+" "+nilai);
        System.out.println("HASIL DATA = "+total);
    }
}
