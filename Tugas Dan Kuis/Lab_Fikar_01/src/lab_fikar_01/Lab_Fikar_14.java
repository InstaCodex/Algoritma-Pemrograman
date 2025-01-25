package lab_fikar_01;
import javax.swing.JOptionPane;
public class Lab_Fikar_14 {
    
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
    //HAPUS
    public static String ht = "",id="",hk="";
    public static boolean putar4 = true;
    public static int n_id=0;
        // HALAMAN
    public static String jd="";
    public static int h=0,sisa=0,x1=0,x2=0,y1=-1;
    
    
    public static void main (String [] args)
    {
        int th_kejadian [];
        th_kejadian = new int [20];
        String tempat [] = null;
        tempat = new String [20];
        String ket [] = null;
        ket = new String [20];
        float sk [];
        sk = new float [20];
        x = -1;
        do
        {
            ph = JOptionPane.showInputDialog("MENU BENCANA"
                    + "\n1. INPUT BENCANA"
                    + "\n2. EDIT BENCANA"
                    + "\n3. HAPUS"
                    + "\n4. LAPORAN PER HALAMAN"
                    + "\n5. EXIT"
                    + "\n PILIH [1-5]\n");
            switch(ph)
            {
                case "1":   {
                    if(x==19)
                    {
                        JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH - TIDAK BISA INPUT");
                        putar3 = true;
                    }
                    else
                    {
                       st = JOptionPane.showInputDialog("TAHUN SEKARANG");
                        n_st = Integer.parseInt(st);
                        do
                        {
                            do
                            {
                                x = x + 1;
                                do
                                {
                                    try
                                    {
                                        tk = JOptionPane.showInputDialog("TAHUN KEJADIAN");
                                        n_tk = Integer.parseInt(tk);
                                        putar = false;
                                    }
                                    catch(Exception e)
                                    {
                                        JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                                        putar = true;
                                    }
                                }
                                while(putar);
                                tp = JOptionPane.showInputDialog("TEMPAT");
                                do
                                {
                                    try
                                    {
                                        pil = JOptionPane.showInputDialog("KETERANGAN \n 1. GEMPA \n 2. SUNAMI \n 3. BANJIR \n PILIH [1-3] \n");
                                        n_pil = Integer.parseInt(pil);
                                        if("1".equals(pil))
                                        {
                                            ss = JOptionPane.showInputDialog("SEKALAR REHTER");
                                            n_ss = Float.parseFloat(ss);
                                            kt = "GEMPA";
                                            putar = false;
                                        }
                                        else if ("2".equals(pil))
                                        {
                                            ss = JOptionPane.showInputDialog("SEKALAR REHTER");
                                            n_ss = Float.parseFloat(ss);
                                            kt = "SUNAMI";
                                            putar = false;
                                        }
                                        else
                                        {
                                            n_ss = 0.0f;
                                            kt = "BANJIR";
                                            putar = false;
                                        }
                                    }
                                    catch(Exception e)
                                    {
                                        JOptionPane.showMessageDialog(null,"ERROR , DATA SALAH INPUT");
                                        putar = true;
                                    }
                                }
                                while(putar);
                            }
                            while(putar);
                            th_kejadian[x] = n_tk;
                            tempat[x] = tp;
                            ket[x] = kt;
                            sk[x] = n_ss;
                            info += "    TAHUN KEJADIAN  = "+th_kejadian[x]+"\n";
                            info += "    TEMPAT          = "+tempat[x]+"\n";
                            info += "    KETERANGAN      = "+ket[x]+"    SEKALAR REHTER = "+sk[x]+"\n";
                            JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH - TIDAK BISA INPUT");
                            info = "";
                            lagi = JOptionPane.showInputDialog("INPUT KEJADIAN [Y/T]");
                            if (x==19)
                            {
                                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH, KELUAR");
                                lagi = "t";
                            }
                        }
                        while("y".equals(lagi) | "Y".equals(lagi));
                        info = "";
                        info += "                       LAPORAN BENCANA DAERAH                  \n";
                        info += "---------------------------------------------------------------\n";
                        info += " No    Tahun  Selama   Tempat  Kejadian    SKrekter    Rk      \n";
                        info += "---------------------------------------------------------------\n";
                        no = 0;
                        for(y=0; y<=x; y = y + 1)
                        {
                            no = no + 1;
                            lama = n_st - th_kejadian[y];
                            info += " "+no+"    "+th_kejadian[y]+"      "+lama+" Th.    "+tempat[y]+"   "+ket[y]+"  "+sk[y]+"\n";
                            if("GEMPA".equals(ket[y]))
                            {
                                g = g + 1;
                            }
                            else if ("SUNAMI".equals(ket[y]))
                            {
                                s = s + 1;
                            }
                            else
                            {
                                b = b + 1;
                            }
                        }
                        info += "---------------------------------------------------------------\n";
                        info += "       GEMPA    = "+g+"\n";
                        info += "       SUNAMI   = "+s+"\n";
                        info += "       BANJIR   = "+b+"\n";
                        JOptionPane.showMessageDialog(null,info,"REKAP BENCANA",JOptionPane.INFORMATION_MESSAGE);
                        info = "";
                    }
                                break;
                            }
                case "2":   {
                    if(x == -1)
                    {
                        JOptionPane.showMessageDialog(null,"DATA KOSONG - TIDAK BISA EDIT");
                        putar3 = true;
                    }
                    else
                    {
                        do
                        {
                            do
                            {
                                ed = JOptionPane.showInputDialog("EDIT DATA [Y/T]");
                                if(!("t".equals(ed) | "T".equals(ed) |"Y".equals(ed) | "y".equals(ed)))
                                {
                                   JOptionPane.showMessageDialog(null,"TIDAK ADA PI;IHANNYA\n    HANYA Y/T\n"); 
                                }
                            }
                            while(!("t".equals(ed) | "T".equals(ed) |"Y".equals(ed) | "y".equals(ed)));
                            if("t".equals(ed) | "T".equals(ed))
                            {
                                JOptionPane.showMessageDialog(null,"ANDA AKAN KELUAR DARI EDIT");
                                putar1=false;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"MULAI EDIT DONG ........"); 

                                do
                                {
                                    je = JOptionPane.showInputDialog("JUMLAH DATA EDIT [1 - "+(x+1)+"]");
                                    n_je = Integer.parseInt(je);
                                }
                                while(!(n_je>=1 & n_je<=(x+1)));
                                d=n_je-1;
                                info += "Data ke = "+n_je+"\n";
                                info += " TAHUN KEJADIAN  = "+th_kejadian[d]+"\n";
                                info += " TEMPAT          = "+tempat[d]+"\n";
                                info += " KETERANGAN      = "+ket[d]+" SEKALAREHTER = "+sk[d]+"\n";
                                JOptionPane.showMessageDialog(null,info,"INFO BENCANA",JOptionPane.INFORMATION_MESSAGE);
                                info ="";

                                p= JOptionPane.showInputDialog("DATA EDIT \n1. TAHUN KEJADIAN"
                                        + "\n2. TEMPAT"
                                        + "\n3. KETERANGAN"
                                        + "\n4. SEKALAHREAKTER "
                                        + "\n    [1-4]\n");
                                if("1".equals(p) )
                                {
                                    do
                                    {
                                       try
                                       {
                                           tk = JOptionPane.showInputDialog("TAHUN KEJADIAN  = "+th_kejadian[d]);
                                           n_tk = Integer.parseInt(tk);
                                           putar = false;
                                       }
                                       catch(Exception e)
                                       {
                                            JOptionPane.showMessageDialog(null,"KESALAHAN DALAM INPUT DATA");
                                            putar = true;
                                       }
                                    }
                                    while(putar);
                                    th_kejadian[d] = n_tk; 
                                }
                                else if("2".equals(p))
                                {
                                     tp = JOptionPane.showInputDialog("TEMPAT = "+tempat[d]);
                                     tempat[d] = tp;
                                }
                                 else if("3".equals(p))
                                {
                                    do
                                    {
                                        pil = JOptionPane.showInputDialog("KETERANGAN \n1. GEMPA \n2. SUNAMI \n3. BANJIR\nPILIH [1-3]\n");
                                    }
                                    while (!("1".equals(pil) | "2".equals(pil) | "3".equals(pil)));
                                    if("1".equals(pil))
                                    {
                                        kt="GEMPA";
                                    }
                                    else if("2".equals(pil))
                                    {
                                        kt="SUNAMI";
                                    }
                                    else
                                    { 
                                        kt="BANJIR";
                                    }
                                    ket[x] = kt;
                                    putar1=true;
                                }
                                else
                                {
                                    do
                                   {
                                       try
                                       {
                                            ss = JOptionPane.showInputDialog("SEKALA REHTER = "+sk[d]);
                                            n_ss = Float.parseFloat(ss);
                                            putar = false;
                                       }
                                       catch(Exception e)
                                       {
                                           JOptionPane.showMessageDialog(null,"KESALAHAN DALAM INPUT DATA");
                                           putar = true;
                                       }
                                   }
                                   while(putar); 
                                   sk[d] = n_ss;  
                                }
                                info += "Data ke = "+n_je+"\n";
                                info += " TAHUN KEJADIAN  = "+th_kejadian[d]+"\n";
                                info += " TEMPAT          = "+tempat[d]+"\n";
                                info += " KETERANGAN      = "+ket[d]+" SEKALAREHTER = "+sk[d]+"\n";
                                JOptionPane.showMessageDialog(null,info,"INFO BENCANA",JOptionPane.INFORMATION_MESSAGE);
                                info ="";
                                info ="";
                                info +="          LAPORAN BENCANA DAERAH             \n";
                                info +=" ------------------------------------------- \n";
                                info +=" NO TAHUN SELAMA TEMPAT KEJADIAN SKREKTER RK \n";
                                info +=" ------------------------------------------- \n";
                                no=0;
                                g=0;
                                s=0;
                                b=0;
                                for (d=0; d<=x; d = d+1)
                                {
                                    no = no + 1;
                                    lama = n_st - th_kejadian[d];
                                    info += no+"   "+th_kejadian[d]+"   "+lama+" Th.  "+tempat[d]+"   "+ket[d]+"   "+sk[d]+"\n";
                                 if("GEMPA".equals(ket[d]))
                                 {
                                   g = g + 1;
                                 }
                                else if("SUNAMI".equals(ket[d]))
                                 {
                                   s = s + 1;
                                 }
                                else
                                 {
                                    b = b + 1;
                                 }
                                }
                                info +=" ------------------------------------------- \n";
                                info +="      GEMPA        = "+g+"\n";
                                info +="      SUNAMI       = "+s+"\n";
                                info +="      BANJIR       = "+b+"\n";
                                JOptionPane.showMessageDialog(null,info,"REKAP BENCANA",JOptionPane.INFORMATION_MESSAGE);
                                info="";
                                putar1=true;
                           }
                        }
                        while(putar1);
                    }
                                break;
                            }
                case "3" : {
                        JOptionPane.showMessageDialog(null,"SISTEM HAPUS DATA");
                    if(x == -1) {
                        JOptionPane.showMessageDialog(null,"MAAF DATA TERNYATA KOSONG\n"
                                                  + "BALIK KEMENU");
                    } else {   
                        do {
                            ht = JOptionPane.showInputDialog("HAPUS DATA [Y/T]");
                            if("t".equals(ht) | "T".equals(ht)) {
                                putar4=false;
                            } else {
                                do {
                                    id = JOptionPane.showInputDialog("INFO DATA [1 - "+(x+1)+"]");
                                    n_id = Integer.parseInt(id);
                                } while(!(n_id>=1 & n_id<=(x+1)));  

                                d=n_id-1; 
                                info = ""; 
                                info += "Data ke = "+n_id+"\n";
                                info += " TAHUN KEJADIAN  = "+th_kejadian[d]+"\n";
                                info += " TEMPAT          = "+tempat[d]+"\n";
                                info += " KETERANGAN      = "+ket[d]+" SEKALAREHTER = "+sk[d]+"\n";
                                JOptionPane.showMessageDialog(null,info,"INFO BENCANA",JOptionPane.INFORMATION_MESSAGE);
                                info ="";  

                                hk = JOptionPane.showInputDialog("HAPUS - TIDAK [Y/T]");
                                if("t".equals(hk) | "T".equals(hk)) {
                                    JOptionPane.showMessageDialog(null,"DATA TIDAK DI HAPUS\n"
                                            + "KEMBALI KE MENU");
                                    putar4=false;
                                } else {
                                    if(n_id>=1 & n_id<(x+1)) {
                                        for(int putar=(n_id-1); putar<x;putar=putar+1) {
                                            th_kejadian[putar] = th_kejadian[putar+1];
                                            tempat[putar] = tempat[putar+1];
                                            ket[putar] =  ket[putar+1];
                                            sk[putar] = sk[putar+1];
                                        }
                                        x = x -1;
                                    } else if(n_id == (x+1)) {
                                        x = x -1;
                                    }

                                    info = "";
                                    info += "                       LAPORAN BENCANA DAERAH                  \n";
                                    info += "---------------------------------------------------------------\n";
                                    info += " No    Tahun  Selama   Tempat  Kejadian    SKrekter    Rk      \n";
                                    info += "---------------------------------------------------------------\n";
                                    no = 0;
                                    g=0; s=0; b=0;
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
                                    JOptionPane.showMessageDialog(null,info,"REKAP BENCANA",JOptionPane.INFORMATION_MESSAGE);
                                    info = "";
                                    putar4=true;
                                }
                            }
                            if(x == -1) {
                                JOptionPane.showMessageDialog(null,"DATA HABIS KELUAR");
                                putar4=false;
                            } 
                        } while(putar4);
                    }  
                    break;
                }
                case "4" : {
                                no = 0;
                    
                                 JOptionPane.showMessageDialog(null,"SISTEM LAPORAN PERHALAMAN");
                                 sisa = (x+1) % 3;
                                 if(sisa == 0)
                                 {
                                     h =(x+1) / 3;
                                 }
                                 else
                                 {
                                    h = ((x+1) /3)+1;
                                 }
                                 if(h==1)
                                {
                                    x1 = 1;
                                    x2 = (x+1);
                                }
        
                                 else
                                {
                                   x1 = 1;
                                   x2 = 3;
                                }
                                info ="";
                                for (int ut = 1; ut<=h; ut = ut + 1)
                                {
                                info += "                       LAPORAN BENCANA DAERAH                  \n";
                                 info += "---------------------------------------------------------------\n";
                                 info += " No    Tahun  Selama   Tempat  Kejadian    SKrekter    Rk      \n";
                                 info += "---------------------------------------------------------------\n";
                                 
                                 g=0; s=0; b=0;
                                if(ut == h)
                                 {
                                       x2 = (x+1);
                                 }
                                for (int z= x1; z<=x2; z = z + 1) 
                                {
                                   no = no + 1;
                                   y1 = y1 + 1;
                                   lama = n_st - th_kejadian[y1];
                                   info += " "+no+"    "+th_kejadian[y1]+"      "+lama+" Th.    "+tempat[y1]+"   "+ket[y1]+"  "+sk[y1]+"\n";
                                    if("GEMPA".equals(ket[y1]))
                                    {
                                        g = g + 1;
                                    }
                                    else if ("SUNAMI".equals(ket[y1]))
                                    {
                                        s = s + 1;
                                    }
                                    else
                                    {
                                        b = b + 1;
                                    }
                                }
                                info += "---------------------------------------------------------------\n";
                                info += "       GEMPA    = "+g+"\n";
                                info += "       SUNAMI   = "+s+"\n";
                                info += "       BANJIR   = "+b+"\n";
                                
                                x1 = x1 + 3;
                                x2 = x2 + 3; 
                                JOptionPane.showMessageDialog(null,info,"DATA",JOptionPane.INFORMATION_MESSAGE);
                                info ="";
                                }
                             
                                 break;
                            }
                case "5":   {
                    
                                JOptionPane.showMessageDialog(null,"SISTEM SELESAI - KELUAR");
                                putar3 = false;
                                break;
                            }
                default :   {
                                JOptionPane.showMessageDialog(null,"KESALAHAN DALAM INPUT PILIHAN");
                                putar3 = true;
                            }
            }
        }
        while(putar3);
    }
}
