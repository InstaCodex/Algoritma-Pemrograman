package tugas_modul_fikar_01;
import javax.swing.JOptionPane;
public class Tugas_Modul_Fikar_30 
{
    private static String jt;
    private static int hm;
    private static int jm;
    private static int pd;
    public static void main(String[] args) {
        String ulang = "y";
        do {
            String info = "";
            String np = "",nm="",ar="";
            np = JOptionPane.showInputDialog("NAMA PEMBELI");
            nm = JOptionPane.showInputDialog("NAMA MOBIL");
            ar = JOptionPane.showInputDialog("ALAMAT RUMAH");
            hm = Integer.parseInt(JOptionPane.showInputDialog("HARGA MOBIL"));
            jm = Integer.parseInt(JOptionPane.showInputDialog("JUMLAH MOBIL"));
            pd = Integer.parseInt(JOptionPane.showInputDialog("POTONGAN DISKON"));
            int hb = 0, by = 0;
            hb = hm * jm;
            by = hb - pd;
            jt = JOptionPane.showInputDialog("MASUKAN JENIS TRANSAKSI [D/C]"); 
            String jenistransaksi = "DEBIT";
            if ("C".equals(jt) | ("C".equals(jt)))
            {
                jenistransaksi = "CASH";
            }
            String bonuspembeli;
            if (by <=1000) 
            {
                bonuspembeli = "BONUS BAN 1 PCS";
            } 
            else if (by <= 2000) 
            {
                bonuspembeli = "BONUS BAN 2 PCS";
            }
            else if (by <= 3000) 
            {
                bonuspembeli = "BONUS BAN 3 PCS";
            } 
            else if (by <= 4000) 
            {
                bonuspembeli = "BONUS BAN 4 PCS";
            } 
            else if (by <= 5000) 
            {
                bonuspembeli = "BONUS 1 MOBIL BEKAS";
            }
            else if (by <= 6000) 
            {
                bonuspembeli = "BONUS 2 MOBIL BEKAS";
            }
            else
                bonuspembeli = "BONUS MOBIL 1 BARU";
            String levelpelayanan;
            if (by<=3000)
                levelpelayanan = "KELAS REGULER";
            else 
                levelpelayanan = "KELAS VIP";
            info += " NAMA PEMBELI  ="+np+"\n";
            info += " NAMA MOBIL    ="+nm+"\n";
            info += " ALAMAT RUMAH  ="+ar+"\n";
            info += " HARGA MOBIL   ="+hm+"\n";
            info += " JUMLAH MOBIL  ="+jm+"\n";
            info += " POTONGAN DISKON   ="+pd+"\n";
            info += " TOTAL TAGIHAN ="+by+"\n";
            info += " JENIS TRANSAKSI ="+jenistransaksi+"\n";
            info += " TOTAL BONUS   ="+bonuspembeli+"\n";
            info += " LEVEL PELAYANAN   ="+levelpelayanan+"\n";
            JOptionPane.showMessageDialog(null, info, "TOKO MOBIL", JOptionPane.INFORMATION_MESSAGE);
            ulang = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
            while (!("y".equals(ulang) | "Y".equals(ulang) | "t".equals(jenistransaksi) | "T".equals(jenistransaksi)));
        }
        while("y".equals(ulang) | "Y".equals(ulang));
        System.exit(0);
    }
}
