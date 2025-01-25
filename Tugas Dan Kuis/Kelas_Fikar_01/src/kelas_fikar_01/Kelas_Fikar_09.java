package kelas_fikar_01;

public class Kelas_Fikar_09 
{
    public static void main(String[] args) 
    {
        int s = 5; int gt = 0;
	for (int ut = 4; ut >=1; ut = ut -1)
	{
            for (int br = ut; br>=1; br = br-1)
            {
                int t = 0;
		for(int ss = s; ss>=1;ss = ss -1)
		{
                    System.out.print("   ");
		}		
                    for(int op = ut; op>=1; op = op-1)
			{
                            System.out.print(" # ");
                            t = t + 1;
			}
			gt = gt + t;
			System.out.println(" = "+t);
            }
            System.out.println("");
            s = s +1;
	}
	System.out.println("Total Keseluruhan = "+gt);
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
