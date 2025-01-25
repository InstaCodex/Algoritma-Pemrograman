package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_64 {
    void makan(String makan) {
        System.out.println("HI");
        System.out.println("SAYA SEDANG MAKAN " + makan);
    }
    static void minuman(String minum) {
        System.out.println("SAYA SEDANG MINUM " + minum);
    }
    public static void main(String[] args) {
        minuman("KOPI");
        Tugas_Modul_Fikar_64 saya = new Tugas_Modul_Fikar_64();
        saya.makan("NASI GORENG");
    }
}
