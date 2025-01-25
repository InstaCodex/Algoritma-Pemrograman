package fikar_kelas_tambahan;
import java.text.NumberFormat; // format angka
import javax.swing.*;
public class MenuEdit {
    private static int no;
    public static String tampil = "";
    public static void edit_data(String[] nama_nrgara, int[] jml_penduduk, double[] pendapatan, String[] email, String[] moto) {
        int x = MenuInput.x;
        String ng = "";
        int jml = 0;
        double pd = 0.0;
        String em = "";
        String mt = "";
        NumberFormat angka = NumberFormat.getIntegerInstance();
        angka.setMinimumFractionDigits(2);
        int ed = Integer.parseInt(JOptionPane.showInputDialog(" DATA [ 1 - " + (x + 1) + " ]"));
        int a_ed = (ed - 1);
        tampil = "";
        tampil += "No = " + (ed) + "\n";
        tampil += "NAMA NEGRA         =  " + nama_nrgara[a_ed] + "\n";
        tampil += "JUMLAH PENDUDUK    =  " + angka.format(jml_penduduk[a_ed]) + "\n";
        tampil += "PENDAPATAN         =  " + angka.format(pendapatan[a_ed]) + "\n";
        tampil += "EMAIL NEGARA       =  " + email[a_ed] + "\n";
        tampil += "MOTO               =  " + moto[a_ed] + "\n";
        JOptionPane.showMessageDialog(null, tampil, "data negara", JOptionPane.INFORMATION_MESSAGE);
        tampil = "";
        String pil = JOptionPane.showInputDialog("  PILIH DATA YANG DI EDIT \n"
                + "1. NAMA NEGARA      \n"
                + "2. JUMLAH PENDUDUK \n"
                + "3. PENDAPATAN \n"
                + "4. EMAIL \n"
                + "5. MOTO \n"
                + "PILIH 1 -5 ");
        switch (pil) {
            case "1": {
                ng = JOptionPane.showInputDialog(" NAMA NEGARA \n");
                nama_nrgara[a_ed] = ng;
                break;
            }
            case "2": {
                jml = Integer.parseInt(JOptionPane.showInputDialog(" JUMLAH PENDUDUK \n"));
                jml_penduduk[a_ed] = jml;
                break;
            }
            case "3": {
                pd = Double.parseDouble(JOptionPane.showInputDialog(" PENDAPATAN \n"));
                pendapatan[a_ed] = pd;
                break;
            }
            case "4": {
                em = JOptionPane.showInputDialog(" EMAIL NEGARA \n "
                        + "JIKA KOSONG BERIKAN TANDA -\n");
                email[a_ed] = em;
                break;
            }
            case "5": {
                mt = JOptionPane.showInputDialog(" MOTO NEGARA \n "
                        + "JIKA KOSONG TEKAN  OK\n");
                moto[a_ed] = mt;
                break;
            }
        }
        int tp = 0, temail = 0, tmoto = 0;
        double tpd = 0;
        int gtp = 0, gtemail = 0, gtmoto = 0;
        double gtpd = 0;
        // for utama
        for (int hl = 1; hl <= 1; hl = hl + 1) {
            tampil = "";
            tampil += "                   LAPORAN NEGARA BERKEMBANG DAN MAJU       \n";
            tampil += "      ===================================================== \n";
            tampil += "       NO  NEGARA        JUMLAH PENDUDUK     PENDAPATAN     \n";
            tampil += "            EMAIL            MOTO                           \n";
            tampil += "      ===================================================== \n";
            no = 0;
            // for bersarang
            for (int d = 0; d <= x; d = d + 1) {
                no = no + 1;
                tampil += "       " + String.format("%-3s", no) + "  ";
                tampil += String.format("%-50s", nama_nrgara[d]) + "   ";
                tampil += String.format("%-50s", (angka.format(jml_penduduk[d]))) + "  ";
                tampil += String.format("%-50s", (angka.format(pendapatan[d]))) + "   \n";
                tampil += String.format("%30s", email[d]) + "   ";
                tampil += String.format("%30s", moto[d]) + "   \n";
                tp = tp + jml_penduduk[d];
                tpd = tpd + pendapatan[d];
                // hitung email
                if (!("-".equals(email[d]))) {
                    temail = temail + 1;
                }
                // hitung moto
                if (moto[d].length() > 0) {
                    tmoto = tmoto + 1;
                }
            } // akhir bersarang
            tampil += "      ===================================================== \n";
            tampil += " TOTAL PENDUDUK     = " + tp + "\n";
            tampil += " TOTAL PENDAPATAN   = " + angka.format(tpd) + "\n";
            tampil += " TOTAL EMAIL        = " + temail + "\n";
            tampil += " TOTAL MOTO         = " + tmoto + "\n";
            JOptionPane.showMessageDialog(null, tampil, " LAPORN KESELURUHAN ", JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
            // grand total
            gtp = gtp + tp;
            gtpd = gtpd + tpd;
            gtemail = gtemail + temail;
            gtmoto = gtmoto + tmoto;
        } // akhir utama 
        if ((no - 1) == x) {
            tampil += " ===================================================== \n";
            tampil += "   HASIL GRAND TOTAL KESELURUHAN \n";
            tampil += " ===================================================== \n";
            tampil += " TOTAL PENDUDUK     = " + gtp + "\n";
            tampil += " TOTAL PENDAPATAN   = " + angka.format(gtpd) + "\n";
            tampil += " TOTAL EMAIL        = " + gtemail + "\n";
            tampil += " TOTAL MOTO         = " + gtmoto + "\n";
            tampil += "===================================================== \n";
            JOptionPane.showMessageDialog(null, tampil, " LAPORN KESELURUHAN ", JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
        }
    }
}
