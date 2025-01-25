package fikar_kelas_tambahan;
import java.text.NumberFormat; // format angka
import javax.swing.*;
import static fikar_kelas_tambahan.MenuUtama.x;
public class MenuHapus {
    private static int no;
    public static String tampil="";
    public static void hapus_data(String[] nama_nrgara, int[] jml_penduduk, double[] pendapatan, String[] email, String[] moto) {
        int x = MenuInput.x;
        String ng=""; int jml=0; double pd=0.0; String em =""; String mt="";
        NumberFormat angka = NumberFormat.getIntegerInstance();
        angka.setMinimumFractionDigits(2);
        if(x == -1) {
            JOptionPane.showMessageDialog(null," DATA KOSONG");
        }
        else {
            int hp = Integer.parseInt(JOptionPane.showInputDialog(" DATA YANG DI HAPUS [ 1 - "+(x+1)+" ]"));
            int a_hp= (hp-1);
            tampil ="";
            tampil += "No = "+(hp)+"\n";
            tampil += "NAMA NEGRA         =  "+nama_nrgara[a_hp]+"\n";
            tampil += "JUMLAH PENDUDUK    =  "+angka.format(jml_penduduk[a_hp])+"\n";
            tampil += "PENDAPATAN         =  "+angka.format(pendapatan[a_hp])+"\n";
            tampil += "EMAIL NEGARA       =  "+email[a_hp]+"\n";
            tampil += "MOTO               =  "+moto[a_hp]+"\n";
            JOptionPane.showMessageDialog(null,tampil,"data negara",JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
            if(a_hp == x) {
                //x=x-1;
                MenuInput.x = x - 1;
            }
            //if(a_hp>=0 && a_hp<x)
            else {
                for( int hs= a_hp; hs<x; hs=hs+1) {
                    nama_nrgara[hs] = nama_nrgara[hs+1] ;
                    jml_penduduk[hs] = jml_penduduk[hs+1] ;
                    pendapatan[hs] = pendapatan[hs+1];
                    email[hs] = email[hs+1];
                    moto[hs] = moto[hs+1];
                    //INPUT.x = x - 1;
                }
                //x=x-1;
                MenuInput.x = x - 1;
            }
            //INPUT.x = x - 1;
            int tp =0, temail=0, tmoto=0; double tpd=0; 
            int gtp=0, gtemail=0,gtmoto=0; double gtpd=0;
            // for utama
            for (int hl =1 ; hl<=1; hl = hl +1) {
                tampil ="";
                tampil +="                   LAPORAN NEGARA BERKEMBANG DAN MAJU       \n";
                tampil +="      ===================================================== \n";
                tampil +="       NO  NEGARA        JUMLAH PENDUDUK     PENDAPATAN     \n";
                tampil +="            EMAIL            MOTO                           \n";
                tampil +="      ===================================================== \n";
                no =0;
                // for bersarang
                for (int d=0 ; d <= MenuInput.x ; d =d +1) {
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
}
