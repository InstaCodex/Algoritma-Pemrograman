package tugas_modul_fikar_01;
import javax.swing.*;
public class Tugas_Modul_Fikar_42 {
    
    public static String hasil, laporan, ket, grade;
    public static float sem_ipk = 0f, sem=0f, tot_ipk=0f, rata_nil=0f , rata_ipk=0f;
    public static int uji, x , ll =0 , tl=0 , z = 0, tot_nil=0;
    public static int no_data;
    private static boolean putar;
    private static boolean balik;
    private static String ed;
    private static boolean n_ruang;
    private static boolean selesai;
    private static int m;
    private static String pil;
    public static void main (String[] args)
    {
        no_data =0;
        String nama[]=null;
        nama = new String[8];
        
        int nilai[];
        nilai = new int[8];
        
        float ipk[];
        ipk = new float[8];
        
        x=-1;
        boolean lanjut = true, lewat = true;
        String lapor="",lagi ="y";
        boolean keluar =true;
        do
           {
             if (x == 8 )
             {
               JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
             }
             else
             {
                do
                   {
                     x = x +1; no_data = no_data + 1;
                     String hasil ="";
                     String nm = JOptionPane.showInputDialog("NAMA MAHASISWA ");
                     nama[x] = nm;
                     do
                        {
                          try
                              {
                                do
                                   {
                                      String nu = JOptionPane.showInputDialog("NILAI UJIAN (0-100) ");
                                      uji = Integer.parseInt(nu);
                                      lanjut = false;
                                   }
                                   while (!(uji >= 0 & uji <= 100));
                              }
                              catch (Exception e)
                              {
                                 lanjut = true;
                                 JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                              }
                        }
                        while (lanjut);
                        nilai[x] = uji;
                        if (uji <=30)
                        {
                           grade ="E";
                        }
                        else if ( uji <=59)
                        { 
                           grade = "D";
                        }
                        else if (uji <=70)
                        {
                           grade ="C";
                        }
                        else if (uji <=80)
                        {
                           grade ="B";
                        }
                        else
                        {
                           grade ="A";
                        }
                        do
                           {
                             try
                                  {
                                     do
                                        {
                                          String sem = JOptionPane.showInputDialog("IPK SEMESTER [0-4.00] ");
                                          sem_ipk = Float.parseFloat(sem);
                                          lewat = false;
                                        }
                                        while (!(sem_ipk >= 0 & sem_ipk <= 4.00));
                                  }
                                  catch (Exception e)
                                  {
                                    lewat = true;
                                    JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                                  }
                           }
                           while (lewat);
                           ipk[x] = sem_ipk;
                           if (sem_ipk >=2.00)
                           {
                              ket ="LULUS";
                           }
                           else
                           {
                              ket = "TIDAK LULUS";
                           }
                           hasil += "NO : "+no_data+"\n";
                           hasil += " HASIL DATA MAHASISWA \n";
                           hasil += " NAMA = "+ nama[x]+"\n";
                           hasil += " NILAI = "+ nilai[x]+"\n";
                           hasil += " GRADE = "+ grade +"\n";
                           hasil += " IPK = "+ ipk[x]+" KET "+ket+"\n";
                           JOptionPane.showMessageDialog(null,hasil,"DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE); 
                           
                           do
                              {
                                lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T] ");
                                if (x == 7)
                                {
                                   JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                                   lagi ="T";
                                }
                              }
                              while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));
                   }
                   while (("y".equals(lagi)) | ("Y".equals(lagi)));
             }
             keluar = false;
            }
            while (keluar);
            z = 0;
            lapor += " LAPORAN HASIL PENILAIAN MAHAS \n";
            lapor += " ==================================================\n";
            lapor += " NO NAMA NILAI GRADE IPK KETERANGAN \n";
            lapor += " ==================================================\n";
            for (int y=0; y<=x; y=y+1)
            {
               z = z + 1;
               if (nilai[y] <=30)
               {
                  grade ="E";
               }
               else if ( nilai[y] <=59)
               {
                  grade = "D";
               }
               else if (nilai[y] <=70)
               {
                  grade ="C";
               }
               else if (nilai[y] <=80)
               {
                  grade ="B";
               }
               else
               {
                  grade ="A";
               }

               if (ipk[y] >=2.00)
               {
                  ket ="LULUS"; ll = ll + 1;
               }
               else
               {
                  ket = "TIDAK LULUS"; tl = tl + 1;
               }
               tot_nil = tot_nil + nilai[y];
               tot_ipk = tot_ipk + ipk[y];
               lapor += " "+z+" "+nama[y]+" " +nilai[y]+" "+grade+" "+ipk[y]+" "+ket+"\n";
            }
            rata_nil = tot_nil /z;
            rata_ipk = tot_ipk / z;
            lapor += " ==================================================\n";
            lapor += " RATA RATA NILAI = "+rata_nil+" \n";
            lapor += " RATA RATA IPK = "+rata_ipk+" \n";
            lapor += " LULUS = "+ll +"\n";
            lapor += " TIDAK LULUS = "+tl +"\n";
            lapor += " ==================================================\n";
            JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
            
            do
              {
                putar = false;
                do
                   {
                     balik = true;
                     ed = JOptionPane.showInputDialog("EDIT DATA [Y/T]");
                     if (("y".equals(ed)) | ("Y".equals(ed)) | ("t".equals(ed)) | ("T".equals(ed)))
                     {
                        balik = false;
                     }
                   }
                   while (balik);
                   int j = x +1;
                   if (("y".equals(ed)) | ("Y".equals(ed)))
                   {
                     do
                        {
                          try
                              {
                                do
                                   {
                                      n_ruang = true;
                                      String nr = JOptionPane.showInputDialog("NOMOR RUANG [1 - "+j+"]");

                                      m = Integer.parseInt(nr);
                                      if (m>=1 & (m<=x+1))
                                      {
                                        n_ruang = false;
                                      }
                                   }
                                   while (n_ruang);
                                   selesai = false;
                              }
                              catch (Exception e)
                              {
                                JOptionPane.showMessageDialog(null,"INPUT SALAH");
                                selesai = true;
                              }
                        }
                        while (selesai);
                        pil = JOptionPane.showInputDialog("DATA YANG AKAN DI EDIT [1-3] \n \n1. NAMA \n2. NILAI \n3. IPK \n");
                        switch (pil){
                        case "1":
                        String nm = JOptionPane.showInputDialog("NAMA MAHASISWA ");
                        nama[m-1] = nm;
                        break;
                        case "2":
                        do
                           {
                              try
                                   {
                                      do
                                          {
                                             String nu = JOptionPane.showInputDialog("NILAI UJIAN (0-100) ");
                                             uji = Integer.parseInt(nu);
                                             lanjut = false;
                                          }
                                          while (!(uji >= 0 & uji <= 100));
                                   }
                                   catch (Exception e)
                                   {
                                      lanjut = true;
                                      JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                                   }
                           }
                           while (lanjut);nilai[m-1] = uji;
                           if (uji <=30)
                           {
                              grade ="E";
                           }
                           else if ( uji <=59)
                           {
                              grade = "D";
                           }
                           else if (uji <=70)
                           {
                              grade ="C";
                           }
                           else if (uji <=80)
                           {
                              grade ="B";
                           }
                           else
                           {
                              grade ="A";
                           }
                           break;
                           default :
                           do
                              {
                                try
                                     {
                                       do
                                          {
                                            String sem = JOptionPane.showInputDialog("IPK SEMESTER [0-4.00] ");
                                            sem_ipk = Float.parseFloat(sem);
                                            lewat = false;
                                          }
                                          while (!(sem_ipk >= 0 & sem_ipk <= 4.00));
                                     }
                                     catch (Exception e)
                                     {
                                        lewat = true;
                                        JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                                     }
                              }
                              while (lewat); ipk[m-1] = sem_ipk;
                              break;
                                     }
                                     if (sem_ipk >=2.00)
                                     {
                                        ket ="LULUS";
                                     }
                                     else
                                     {
                                        ket = "TIDAK LULUS";
                                     }
                                     hasil ="";
                                     hasil += "NO : "+m+"\n";
                                     hasil += " HASIL DATA MAHASISWA \n";
                                     hasil += " NAMA = "+ nama[m-1]+"\n";
                                     hasil += " NILAI = "+ nilai[m-1]+"\n";
                                     hasil += " GRADE = "+ grade +"\n";
                                     hasil += " IPK = "+ ipk[m-1]+" KET "+ket+"\n";
                                     JOptionPane.showMessageDialog(null,hasil,"DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
                                     putar = true;
                   }
              }
              while(putar);
              ll = 0;
              tl = 0;
              tot_nil = 0;
              tot_ipk = 0;
              rata_nil = 0;
              rata_ipk = 0;
              lapor="";
              z = 0;
              lapor += " LAPORAN HASIL PENILAIAN MAHAS \n";
              lapor += " ==================================================\n";
              lapor += " NO NAMA NILAI GRADE IPK KETERANGAN \n";
              lapor += " ==================================================\n";
              for (int y=0; y<=x; y=y+1)
              {
                z = z + 1;
                if (nilai[y] <=30)
                {
                   grade ="E";
                }
                else if ( nilai[y] <=59)
                {
                   grade = "D";
                }
                else if (nilai[y] <=70)
                {
                   grade ="C";
                }
                else if (nilai[y] <=80)
                {
                   grade ="B";
                }
                else
                {
                   grade ="A";
                }
                if (ipk[y] >=2.00)
                {
                   ket ="LULUS"; ll = ll + 1;
                }
                else
                {
                   ket = "TIDAK LULUS"; tl = tl + 1;
                }
                tot_nil = tot_nil + nilai[y];
                tot_ipk = tot_ipk + ipk[y];
                lapor += " "+z+" "+nama[y]+" " +nilai[y]+" "+grade+" "+ipk[y]+" "+ket+"\n";
              }
              rata_nil = tot_nil /z;
              rata_ipk = tot_ipk / z;
              lapor += " ==================================================\n";
              lapor += " RATA RATA NILAI = "+rata_nil+" \n";
              lapor += " RATA RATA IPK = "+rata_ipk+" \n";
              lapor += " LULUS = "+ll +"\n";
              lapor += " TIDAK LULUS = "+tl +"\n";
              lapor += " ==================================================\n";
              JOptionPane.showMessageDialog(null,lapor,"LAPORAN HASIL DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
              System.exit(0);
}
    }