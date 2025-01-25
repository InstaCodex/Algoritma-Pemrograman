package fikar_kelas_tambahan;
import java.text.NumberFormat; // format angka
import javax.swing.*;
import static fikar_kelas_tambahan.MenuUtama.x;
public class MenuLaporan {
    private static int no;
    public static String tampil="";
    public static void laporan_data(String[] nama_nrgara, int[] jml_penduduk, double[] pendapatan, String[] email, String[] moto) {
        int x = MenuInput.x;
        NumberFormat angka = NumberFormat.getIntegerInstance();
        angka.setMinimumFractionDigits(2);
        int tp =0, temail=0, tmoto=0; double tpd=0; 
        int gtp=0, gtemail=0,gtmoto=0; double gtpd=0; 
      // for utama
        for (int hl = 1; hl<=1; hl = hl + 1) {
            tampil ="";
            tampil +="                   LAPORAN NEGARA BERKEMBANG DAN MAJU       \n";
            tampil +="      ===================================================== \n";
            tampil +="       NO  NEGARA        JUMLAH PENDUDUK     PENDAPATAN     \n";
            tampil +="            EMAIL            MOTO                           \n";
            tampil +="      ===================================================== \n";
            no =0;
      // for bersarang
            for (int d=0 ; d <=x ; d =d +1) {
                no = no +1;
                tampil +="       "+String.format("%-3s",no)+"  ";
                tampil += String.format("%-50s", nama_nrgara[d])+"   ";
                tampil += String.format("%-50s",  (angka.format(jml_penduduk[d])))+"  ";
                tampil += String.format("%-50s",  (angka.format(pendapatan[d])))+"   \n";
                tampil += String.format("%30s", email[d])+"   ";
                tampil += String.format("%30s", moto[d])+"   \n";
                tp     = tp +jml_penduduk[d];
                tpd    = tpd + pendapatan[d];
                // hitung email
                if(!("-".equals(email[d]))) {
                    temail = temail + 1;
                }
               // hitung moto
                if(moto[d].length()>0) {
                    tmoto = tmoto + 1;
                }
            } // akhir bersarang
            tampil +="      ===================================================== \n";
            tampil +=" TOTAL PENDUDUK     = "+tp+"\n";
            tampil +=" TOTAL PENDAPATAN   = "+angka.format(tpd)+"\n";
            tampil +=" TOTAL EMAIL        = "+temail+"\n";
            tampil +=" TOTAL MOTO         = "+tmoto+"\n";
            JOptionPane.showMessageDialog(null,tampil," LAPORN KESELURUHAN ",JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
            // grand total
            gtp = gtp+ tp;
            gtpd= gtpd +tpd;
            gtemail = gtemail + temail;
            gtmoto  = gtmoto + tmoto;
        } // akhir utama 
        if ((no-1) == x) {
            tampil +=" ===================================================== \n";
            tampil +="   HASIL GRAND TOTAL KESELURUHAN \n";   
            tampil +=" ===================================================== \n";
            tampil +=" TOTAL PENDUDUK     = "+gtp+"\n";
            tampil +=" TOTAL PENDAPATAN   = "+angka.format(gtpd)+"\n";
            tampil +=" TOTAL EMAIL        = "+gtemail+"\n";
            tampil +=" TOTAL MOTO         = "+gtmoto+"\n";
            tampil +="===================================================== \n";
            JOptionPane.showMessageDialog(null,tampil," LAPORN KESELURUHAN ",JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
        }
    }
}
