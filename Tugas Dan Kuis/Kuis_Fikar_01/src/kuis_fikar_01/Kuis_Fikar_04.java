package kuis_fikar_01;
public class Kuis_Fikar_04 
{
    public static void main(String[] args) 
	{
		int ci = 1, ck = 5;
		while(ci<=3)
		{
			int ut = 5, br;
			do 
			{
				br = ut;
				while(br>=1)
				{
					System.out.print(ck+" ");
					br = br - 1;	
				}
				System.out.println("");
				ut = ut - 1;
			}
			while(ut>=1);
			System.out.println("");
			ci = ci +1;
			ck = ck - 1;
		}
                System.out.println("FIKAR DWI RAMADHANI 0022");
	}
}
