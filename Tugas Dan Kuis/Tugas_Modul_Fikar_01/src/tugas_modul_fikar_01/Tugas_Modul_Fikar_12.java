package tugas_modul_fikar_01;
public class Tugas_Modul_Fikar_12 {
    public static void main(String[] args) { 
        int br = 2;
        int batasUt = 3; 
        int total = 0; 
        while (br <= 4) 
        {
            int ut = 1; 
            while (ut <= batasUt) 
            { 
                int hasil = ut + br; 
                System.out.println(ut + " + " + br + " = " + hasil);
                total = total + hasil; 
                ut = ut + 1; 
            }
            br = br + 2; 
            batasUt = 4; 
        }
        System.out.println("Total = " + total);
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
