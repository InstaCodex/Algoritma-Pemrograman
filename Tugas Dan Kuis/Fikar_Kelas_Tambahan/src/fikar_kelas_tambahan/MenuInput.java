package fikar_kelas_tambahan;
import java.text.NumberFormat; // format angka
import javax.swing.*;
import static fikar_kelas_tambahan.MenuUtama.jml_penduduk;
import static fikar_kelas_tambahan.MenuUtama.nama_nrgara;
import static fikar_kelas_tambahan.MenuUtama.pendapatan;
import static fikar_kelas_tambahan.MenuUtama.email;
import static fikar_kelas_tambahan.MenuUtama.moto;
import static fikar_kelas_tambahan.MenuUtama.x;
public class MenuInput {
    public static int x = MenuUtama.x;
    void input_data(String[] nama_nrgara, int[] jml_penduduk, double[] pendapatan, String[] email, String[] moto) {
        NumberFormat angka = NumberFormat.getIntegerInstance();
        angka.setMinimumFractionDigits(2);
        String ng=""; int jml=0; double pd=0.0; String em =""; String mt="";
        String tampil="";
        String lagi="";
        do {
            x =x +1;
            ng = JOptionPane.showInputDialog(" NAMA NEGARA \n");
            jml = Integer.parseInt(JOptionPane.showInputDialog(" JUMLAH PENDUDUK \n"));
            pd =  Double.parseDouble(JOptionPane.showInputDialog(" PENDAPATAN \n"));
            em = JOptionPane.showInputDialog(" EMAIL NEGARA \n "
                    + "JIKA KOSONG BERIKAN TANDA -\n");
            mt = JOptionPane.showInputDialog(" MOTO NEGARA \n "
                    + "JIKA KOSONG TEKAN  OK\n");
            nama_nrgara[x] = ng;
            jml_penduduk[x] = jml;
            pendapatan[x] = pd;
            email[x] = em;
            moto[x] = mt;
            tampil ="";
            tampil += "No = "+(x+1)+"\n";
            tampil += "NAMA NEGRA         =  "+nama_nrgara[x]+"\n";
            tampil += "JUMLAH PENDUDUK    =  "+angka.format(jml_penduduk[x])+"\n";
            tampil += "PENDAPATAN         =  "+angka.format(pendapatan[x])+"\n";
            tampil += "EMAIL NEGARA       =  "+email[x]+"\n";
            tampil += "MOTO               =  "+moto[x]+"\n";
            JOptionPane.showMessageDialog(null,tampil,"data negara",JOptionPane.INFORMATION_MESSAGE);
            tampil = "";
            lagi = JOptionPane.showInputDialog(" INPUT DATA LAGI [Y/T]");
        } while ("y".equals(lagi) |"Y".equals(lagi));
        int no =0;
        for (int d=0 ; d <=x ; d =d +1) {
            no = no +1;
            tampil +="       "+String.format("%-3s",no)+"  ";
            tampil += String.format("%-50s", nama_nrgara[d])+"   ";
            tampil += String.format("%-50s",  (angka.format(jml_penduduk[d])))+"  ";
            tampil += String.format("%-50s",  (angka.format(pendapatan[d])))+"   \n";
            tampil += String.format("%30s", email[d])+"   ";
            tampil += String.format("%30s", moto[d])+"   \n";
        }
        JOptionPane.showMessageDialog(null,tampil,"data negara",JOptionPane.INFORMATION_MESSAGE);
    }
}
