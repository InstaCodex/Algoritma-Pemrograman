package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_56 {
    public static String nama, makanan;
    public static void main(String[] args) {
        Tugas_Modul_Fikar_56 hewan = new Tugas_Modul_Fikar_56();
        System.out.println("===== KUCING =====");
        hewan.kucing();
        System.out.println("===== KAMBING =====");
        hewan.kambing();
    }
    void kucing() {
        nama = "PUS MEONG";
        makanan = "DAGING PAKAI SAOS";
        System.out.println("NAMA KUCING SAYA ADALAH " + nama);
        System.out.println("KUCING SAYA SUKA MAKAN " + makanan);
    }
    void kambing() {
        nama = "EMBEK EMBEK";
        makanan = "RUMPUT GAJAH";
        System.out.println("NAMA KAMBING SAYA ADALAH " + nama);
        System.out.println("KAMBING SAYA SUKA MAKAN " + makanan);
    }
}


