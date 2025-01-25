package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_45 {
    private static int harga, porsi;
    private static String pil, pr;

    public static void main(String[] args) {
        boolean putar = true;
        do {
            pr = "";
            do {
                pil = JOptionPane.showInputDialog(
                    null,
                    "MENU MASAKAN\n" +
                    "1. AYAM BAKAR CABAI PEDAS\n" +
                    "2. ES CAMPUR RASA MACAM MACAM\n" +
                    "3. IKAN TONGKOL MAIN BOLA\n" +
                    "4. SELESAI\n" +
                    "PILIH [1 - 4]\n"
                );
            } while (!(("1".equals(pil)) || ("2".equals(pil)) || ("3".equals(pil)) || ("4".equals(pil))));

            switch (pil) {
                case "1": {
                    pr = JOptionPane.showInputDialog(
                        null,
                        "DAFTAR HARGA PER PORSI 50.000\n" +
                        "- AYAM BAKAR\n" +
                        "- NASI PUTIH\n" +
                        "- AIR MINUM (TEH MANIS ATAU TEH TAWAR)\n" +
                        "PILIH BERAPA PORSI"
                    );
                    porsi = Integer.parseInt(pr);
                    harga = porsi * 50000;
                    JOptionPane.showMessageDialog(null, "TOTAL HARGA = Rp. " + harga);
                    break;
                }
                case "2": {
                    pr = JOptionPane.showInputDialog(
                        null,
                        "DAFTAR HARGA PER PORSI 75.000\n" +
                        "- ES CAMPUR RASA BUAH\n" +
                        "  RASA SAYUR ATAU TIDAK ADA RASA\n" +
                        "PILIH BERAPA PORSI"
                    );
                    porsi = Integer.parseInt(pr);
                    harga = porsi * 75000;
                    JOptionPane.showMessageDialog(null, "TOTAL HARGA = Rp. " + harga);
                    break;
                }
                case "3": {
                    pr = JOptionPane.showInputDialog(
                        null,
                        "DAFTAR HARGA PER PORSI 125.000\n" +
                        "- IKAN KECAP ATAU IKAN PEDAS\n" +
                        "- BOLA KASTI ATAU BOLA BASKET\n" +
                        "PILIH BERAPA PORSI"
                    );
                    porsi = Integer.parseInt(pr);
                    harga = porsi * 125000;
                    JOptionPane.showMessageDialog(null, "TOTAL HARGA = Rp. " + harga);
                    break;
                }
                case "4":
                    putar = false;
                    break;
            }
        } while (putar);
    }
}
