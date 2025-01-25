package tugas_modul_fikar_01;
import javax.swing.JOptionPane;
public class Tugas_Modul_Fikar_36  
{
    public static String jurusan="", jk="", lagi = "Y",ijzah="",np="",almt="",info="",ipkk="",rekap="",ket="";
    public static float ipk = 0f, totalIPK = 0f, rataIPK = 0f,ijz = 0f;
    public static int ti = 0, si = 0, ka = 0, tl = 0, tp = 0,gt=0,x=0;
    public static double def = 0.25,koreksi;
    public static boolean putar = true;
    public static void main(String[] args) 
    {
        rekap = "                                         HASIL REKAP DATA MAHASISWA                   \n";
        rekap += "---------------------------------------------------------------------------------------------------------------------\n";
        rekap += "NO      NAMA        ALAMAT        JURUSAN           NILAI IJAZAH           IPK          JENIS KELAMIN\n";
        rekap += "---------------------------------------------------------------------------------------------------------------------\n";
        do {
            x = x + 1;
            np = JOptionPane.showInputDialog("NAMA MAHASISWA");
            almt = JOptionPane.showInputDialog("ALAMAT MAHASISWA");
            do 
            {
                jurusan = JOptionPane.showInputDialog("JURUSAN [TI/SI/KA]");
            }
            while (!(("TI".equals(jurusan)) | ("SI".equals(jurusan)) | ("KA".equals(jurusan))));
            if ("TI".equals(jurusan)) 
            {
                ti = ti + 1;
            } 
            else if ("SI".equals(jurusan))
            {
                si = si + 1;
            }
            else if ("KA".equals(jurusan))
            {
                ka = ka + 1;
            }
            do 
            {
                jk = JOptionPane.showInputDialog("JENIS KELAMIN [L/P]");
            }
            while (!(("l".equals(jk)) | ("L".equals(jk)) | ("p".equals(jk)) | ("P".equals(jk))));
            if ("l".equals(jk) | ("L".equals(jk))) 
            {
                ket = "LAKI-LAKI";
                tl = tl + 1;
            } 
            else 
            {
                ket = "PEREMPUAN";
                tp = tp + 1;
            }
            do 
            {
                try 
                {
                    ijzah = JOptionPane.showInputDialog("NILAI IJAZAH MAHASISWA");
                    ijz = Float.parseFloat(ijzah);
                    putar = false;
                } 
                catch (Exception e) 
                {
                    putar = true;
                    JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH, INPUT ULANG");
                }
            } 
            while(putar);
            do 
            {
                try 
                {
                    ipkk = JOptionPane.showInputDialog("IPK MAHASISWA");
                    ipk = Float.parseFloat(ipkk);
                    putar = false;
                } 
                catch (Exception e) 
                {
                    putar = true;
                    JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH, INPUT ULANG");
                }
            } 
            while (putar);
            info += "-----------------------------------------\n";
            info += "TAMPILAN DATA MAHASISWA\n";
            info += "-----------------------------------------\n";
            info += "NAMA MAHASISWA: " + np + "\n";
            info += "ALAMAT MAHASISWA: " + almt + "\n";
            info += "JURUSAN: " + jurusan + "\n";
            info += "NILAI IJAZAH: " + ijz + "\n";
            info += "IPK MAHASISWA: " + ipk + "\n";
            info += "JENIS KELAMIN: " + ket + "\n";
            JOptionPane.showMessageDialog(null, info, "TAMPILAN DATA MAHASISWA", JOptionPane.INFORMATION_MESSAGE);
            rekap +="   "+x+"         "+np+"      "+almt+"             "+jurusan+"                     "+ijz+"                        "+ipk +"             "+ket+"\n";
            do 
            {
                lagi = JOptionPane.showInputDialog("INGIN INPUT DATA LAGI? [Y/T]");
            } 
            while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("T".equals(lagi)) | ("t".equals(lagi))));
        }   
        while(("y".equals(lagi)) | ("Y".equals(lagi)));
        totalIPK = totalIPK + ipk;
        rataIPK = totalIPK / x;
        koreksi = rataIPK * def;
        gt = gt + ti + si + ka; 
        rekap += "---------------------------------------------------------------------------------------------------------------------\n";
        rekap += "TOTAL TEKNIK INFORMATIKA = " + ti + " MAHASISWA\n";
        rekap += "TOTAL SISTEM INFORMASI = " + si + " MAHASISWA\n";
        rekap += "TOTAL KOMPUTERISASI AKUNTANSI = " + ka + " MAHASISWA\n";
        rekap += "RATA-RATA IPK = " + rataIPK + "\n";
        rekap += "HASIL DEFIASI IPK = " + koreksi + "\n";
        rekap += "TOTAL SEMUA MAHASISWA = " + gt + "\n";
        JOptionPane.showMessageDialog(null, rekap, "REKAP", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        }
    }