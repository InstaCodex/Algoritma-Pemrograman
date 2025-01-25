package tugas_modul_fikar_01;

public class Tugas_Modul_Fikar_14 
{
    public static void main(String[] args) 
	{
            int ut = 1, br, ck;
            do
            {
                br = ut;
                ck = 1;
                while(br>=1)
                {
                    System.out.print(ck+" ");
                    ck = ck + 1;
                    br = br - 1;
                }
                System.out.println("");
                ut = ut + 1;
            }
            while(ut<=6);
            System.out.println("");
            System.out.println("FIKAR DWI RAMADHANI 0022");
        }
}
