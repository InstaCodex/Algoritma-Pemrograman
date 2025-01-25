package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_59 {
    static String nama;
    static int tahun_s = 2017, tahun_1 = 1998, umur;
    static double IPK;
    public static void main(String[] args) {
        nama = "Fikar";
        System.out.println("NAMA SAYA: " + nama);
        System.out.println("UMUR SAYA: " + umur_saya() + "TAHUN");
        NilaiIPK();
    }
    static int umur_saya() {
        umur = tahun_s - tahun_1;
        return umur;
    }
    static void NilaiIPK() {
        IPK = 4.0;
        System.out.println("NILAI IPK SAYA: " + IPK);
    }
}
