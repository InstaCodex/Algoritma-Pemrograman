package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_57 {
    String hewan = "DOMBA";
    int kandang1 = 20, kandang2 = 100, hasil;
    String jenis() {
        return hewan;
    }
    int jumlah() {
        hasil = kandang1 + kandang2;
        return hasil; 
    }
    public static void main(String[] args) {
        Tugas_Modul_Fikar_57 data = new Tugas_Modul_Fikar_57();
        System.out.println("JENIS HEWAN: " + data.jenis());
        System.out.println("JUMLAHNYA: " + data.jumlah() + " EKOR");
    }
}


