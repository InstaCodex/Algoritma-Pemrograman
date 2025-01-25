package kuis_fikar_01;
import javax.swing.*;
public class Kuis_Fikar_09 {
   // INPUT
   public static String tk = "", tp = "", pil = "", ss = "", kt = "", info = "", lagi = "", st = "";
   public static int n_tk = 0, x = -1, y = 0, n_st = 0, no = 0, lama = 0, b = 0, g = 0, s = 0, n_pil = 0;
   public static float n_ss = 0.0f;
   public static boolean putar = true;
   
   // TEMPAT INPUT
   public static String ed = "", je = "", p = "";
   public static boolean putar1 = false;
   public static int n_je = 0, d = 0, n_p = 0;
   
   // MENU
   public static String ph = "";
   public static boolean putar3 = true;
    public static void main(String[] args) {
       int th_kejadian[];
       th_kejadian = new int[3];
       String tempat[] = null;
       tempat = new String[3];
       String ket[] = null;
       ket = new String[3];
       float sk[];
       sk = new float[3];
       x = -1;
       
       do {
           ph = JOptionPane.showInputDialog("MENU BENCANA \n1. INPUT BENCANA"
                   + "\n2. EDIT BENCANA"
                   + "\n3. EXIT"
                   + "\n PILIH [1-3]\n");
           switch(ph) {
               case "1": {
                   if(x==2) {
                       JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH - TIDAK BISA INPUT");
                       putar3 = true;
                   } else {
                       st = JOptionPane.showInputDialog("TAHUN SEKARANG");
                       n_st = Integer.parseInt(st);
                       do {
                           do {
                               x = x + 1;
                               do {
                                   try {
                                       tk = JOptionPane.showInputDialog("TAHUN KEJADIAN");
                                       n_tk = Integer.parseInt(tk);
                                       putar = false;
                                   } catch(Exception e) {
                                       JOptionPane.showMessageDialog(null, "ERROR , DATA SALAH INPUT");
                                       putar = true;
                                   }
                               } while(putar);
                               
                               tp = JOptionPane.showInputDialog("TEMPAT");
                               do {
                                   try {
                                       pil = JOptionPane.showInputDialog("KETERANGAN \n 1. GEMPA \n 2. SUNAMI \n 3. BANJIR \n PILIH [1-3] \n");
                                       n_pil = Integer.parseInt(pil);
                                       if("1".equals(pil)) {
                                           ss = JOptionPane.showInputDialog("SEKALAR REHTER");
                                           n_ss = Float.parseFloat(ss);
                                           kt = "GEMPA";
                                           putar = false;
                                       } else if ("2".equals(pil)) {
                                           ss = JOptionPane.showInputDialog("SEKALAR REHTER");
                                           n_ss = Float.parseFloat(ss);
                                           kt = "SUNAMI";
                                           putar = false;
                                       } else {
                                           n_ss = 0.0f;
                                           kt = "BANJIR";
                                           putar = false;
                                       }
                                   } catch(Exception e) {
                                       JOptionPane.showMessageDialog(null, "ERROR , DATA SALAH INPUT");
                                       putar = true;
                                   }
                               } while(putar);
                           } while(putar);
                            th_kejadian[x] = n_tk;
                           tempat[x] = tp;
                           ket[x] = kt;
                           sk[x] = n_ss;
                           
                           info += "    TAHUN KEJADIAN  = "+th_kejadian[x]+"\n";
                           info += "    TEMPAT          = "+tempat[x]+"\n";
                           info += "    KETERANGAN      = "+ket[x]+"    SEKALAR REHTER = "+sk[x]+"\n";
                           JOptionPane.showMessageDialog(null, info, "INFO BENCANA", JOptionPane.INFORMATION_MESSAGE);
                           info = "";
                           
                           lagi = JOptionPane.showInputDialog("INPUT KEJADIAN [Y/T]");
                           if (x==2) {
                               JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH, KELUAR");
                               lagi = "t";
                           }
                       } while("y".equals(lagi) | "Y".equals(lagi));
                        // Display report
                       info = "";
                       info += "                       LAPORAN BENCANA DAERAH                  \n";
                       info += "---------------------------------------------------------------\n";
                       info += " No    Tahun  Selama   Tempat  Kejadian    SKrekter    Rk      \n";
                       info += "---------------------------------------------------------------\n";
                       no = 0;
                       
                       for(y=0; y<=x; y = y + 1) {
                           no = no + 1;
                           lama = n_st - th_kejadian[y];
                           info += " "+no+"    "+th_kejadian[y]+"      "+lama+" Th.    "+tempat[y]+"   "+ket[y]+"  "+sk[y]+"\n";
                           if("GEMPA".equals(ket[y])) {
                               g = g + 1;
                           } else if ("SUNAMI".equals(ket[y])) {
                               s = s + 1;
                           } else {
                               b = b + 1;
                           }
                       }
                       
                       info += "---------------------------------------------------------------\n";
                       info += "       GEMPA    = "+g+"\n";
                       info += "       SUNAMI   = "+s+"\n";
                       info += "       BANJIR   = "+b+"\n";
                       JOptionPane.showMessageDialog(null, info, "REKAP BENCANA", JOptionPane.INFORMATION_MESSAGE);
                       info = "";
                   }
                   break;
               }
               
               case "2": {
                   if(x == -1) {
                       JOptionPane.showMessageDialog(null, "DATA KOSONG - TIDAK BISA EDIT");
                       putar3 = true;
                   } else {
                       do {
                           do {
                               ed = JOptionPane.showInputDialog("EDIT DATA [Y/T]");
                               if(!("t".equals(ed) | "T".equals(ed) |"Y".equals(ed) | "y".equals(ed))) {
                                   JOptionPane.showMessageDialog(null, "TIDAK ADA PI;IHANNYA\n    HANYA Y/T\n"); 
                               }
                           } while(!("t".equals(ed) | "T".equals(ed) |"Y".equals(ed) | "y".equals(ed)));
                           
                           if("t".equals(ed) | "T".equals(ed)) {
                               JOptionPane.showMessageDialog(null, "ANDA AKAN KELUAR DARI EDIT");
                               putar1 = false;
                           } else {
                               JOptionPane.showMessageDialog(null, "MULAI EDIT DONG ........"); 
                                do {
                                   je = JOptionPane.showInputDialog("JUMLAH DATA EDIT [1 - "+(x+1)+"]");
                                   n_je = Integer.parseInt(je);
                               } while(!(n_je>=1 & n_je<=(x+1)));
                               
                               d = n_je-1;
                               info += "Data ke = "+n_je+"\n";
                               info += " TAHUN KEJADIAN  = "+th_kejadian[d]+"\n";
                               info += " TEMPAT          = "+tempat[d]+"\n";
                               info += " KETERANGAN      = "+ket[d]+" SEKALAREHTER = "+sk[d]+"\n";
                               JOptionPane.showMessageDialog(null, info, "INFO BENCANA", JOptionPane.INFORMATION_MESSAGE);
                               info = "";
                                p = JOptionPane.showInputDialog("DATA EDIT \n1. TAHUN KEJADIAN"
                                       + "\n2. TEMPAT"
                                       + "\n3. KETERANGAN"
                                       + "\n4. SEKALAHREAKTER "
                                       + "\n    [1-4]\n");
                                       
                               if("1".equals(p)) {
                                   do {
                                       try {
                                           tk = JOptionPane.showInputDialog("TAHUN KEJADIAN  = "+th_kejadian[d]);
                                           n_tk = Integer.parseInt(tk);
                                           putar = false;
                                       } catch(Exception e) {
                                           JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                                           putar = true;
                                       }
                                   } while(putar);
                                   th_kejadian[d] = n_tk; 
                               } else if("2".equals(p)) {
                                   tp = JOptionPane.showInputDialog("TEMPAT = "+tempat[d]);
                                   tempat[d] = tp;
                               } else if("3".equals(p)) {
                                   do {
                                       pil = JOptionPane.showInputDialog("KETERANGAN \n1. GEMPA \n2. SUNAMI \n3. BANJIR\nPILIH [1-3]\n");
                                   } while (!("1".equals(pil) | "2".equals(pil) | "3".equals(pil)));
                                   
                                   if("1".equals(pil)) {
                                       kt = "GEMPA";
                                   } else if("2".equals(pil)) {
                                       kt = "SUNAMI";
                                   } else { 
                                       kt = "BANJIR";
                                   }
                                   ket[x] = kt;
                                   putar1 = true;
                               } else {
                                   do {
                                       try {
                                           ss = JOptionPane.showInputDialog("SEKALA REHTER = "+sk[d]);
                                           n_ss = Float.parseFloat(ss);
                                           putar = false;
                                       } catch(Exception e) {
                                           JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT DATA");
                                           putar = true;
                                       }
                                   } while(putar); 
                                   sk[d] = n_ss;  
                               }
                                info += "Data ke = "+n_je+"\n";
                               info += " TAHUN KEJADIAN  = "+th_kejadian[d]+"\n";
                               info += " TEMPAT          = "+tempat[d]+"\n";
                               info += " KETERANGAN      = "+ket[d]+" SEKALAREHTER = "+sk[d]+"\n";
                               JOptionPane.showMessageDialog(null, info, "INFO BENCANA", JOptionPane.INFORMATION_MESSAGE);
                               info = "";
                               
                               info = "";
                               info += "          LAPORAN BENCANA DAERAH             \n";
                               info += " ------------------------------------------- \n";
                               info += " NO TAHUN SELAMA TEMPAT KEJADIAN SKREKTER RK \n";
                               info += " ------------------------------------------- \n";
                               no = 0;
                               g = 0;
                               s = 0;
                               b = 0;
                               
                               for (d=0; d<=x; d = d+1) {
                                   no = no + 1;
                                   lama = n_st - th_kejadian[d];
                                   info += no+"   "+th_kejadian[d]+"   "+lama+" Th.  "+tempat[d]+"   "+ket[d]+"   "+sk[d]+"\n";
                                   if("GEMPA".equals(ket[d])) {
                                       g = g + 1;
                                   } else if("SUNAMI".equals(ket[d])) {
                                       s = s + 1;
                                   } else {
                                       b = b + 1;
                                   }
                               }
                               
                               info += " ------------------------------------------- \n";
                               info += "      GEMPA        = "+g+"\n";
                               info += "      SUNAMI       = "+s+"\n";
                               info += "      BANJIR       = "+b+"\n";
                               JOptionPane.showMessageDialog(null, info, "REKAP BENCANA", JOptionPane.INFORMATION_MESSAGE);
                               info = "";
                               putar1 = true;
                           }
                       } while(putar1);
                   }
                   break;
               }
               
               case "3": {
                   JOptionPane.showMessageDialog(null, "SISTEM SELESAI - KELUAR");
                   putar3 = false;
                   break;
               }
               
               default: {
                   JOptionPane.showMessageDialog(null, "KESALAHAN DALAM INPUT PILIHAN");
                   putar3 = true;
               }
           }
       } while(putar3);
   }
}
