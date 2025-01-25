package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_24 
{
    public static void main(String[] args) 
    {
        int nilai = 25; 
        int harga = 100;
        int hb = 50;
        int totalNilai = 0;
        int totalHarga = 0;
        System.out.println("DAFTAR INDEX DAGANG"); 
        System.out.println("--------------------");
        System.out.println("NO    NILAI    HARGA"); 
        System.out.println("--------------------");
        for (int nomor = 1; nomor <= 6; nomor = nomor + 1) 
        {
            System.out.println(nomor + "       " + nilai + "       " + harga);  
            totalNilai = totalNilai + nilai;
            totalHarga = totalHarga + harga;
            nilai = nilai + 5; 
            harga = harga + hb;
            hb = hb + 10;
        }
        System.out.println("-------------------- + ");
        System.out.println("TOTAL = " + totalNilai + "     " + totalHarga);
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
