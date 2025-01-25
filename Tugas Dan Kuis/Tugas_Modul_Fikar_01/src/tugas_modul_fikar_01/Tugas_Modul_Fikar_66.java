package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_66 {
    void kegiatan(String kegiatan) {
        System.out.println("HI SAYA SEDANG " + kegiatan);
    }
    static void hobi(String hobi) {
        System.out.println("SAYA SEDANG MENIKMATI " + hobi);
    }
    void citaCita(String citaCita) {
        System.out.println("CITA-CITA SAYA ADALAH " + citaCita);
    }
    static void makananFavorit(String makanan) {
        System.out.println("MAKANAN FAVORIT SAYA ADALAH " + makanan);
    }
    public static void main(String[] args) {
        hobi("MEMBACA BUKU");
        Tugas_Modul_Fikar_66 saya = new Tugas_Modul_Fikar_66();
        saya.kegiatan("BEROLAHRAGA");
        saya.citaCita("MENJADI PROGRAMMER PROFESIONAL");
        makananFavorit("MIE GEPREK");
    }
}
