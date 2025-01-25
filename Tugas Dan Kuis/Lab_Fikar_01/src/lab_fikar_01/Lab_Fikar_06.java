package lab_fikar_01;
public class Lab_Fikar_06 
{
    public static void main(String[] args) 
    {
        int ut = 1, sp = 14;
        while ( ut <= 4)
        {
            int op = ut,ck1 =2;
            do 
            {
                System.out.print(ck1 +" ");
                
                op= op -1;
            }
            while (op>=1);
            int hg = sp;
            while ( hg >=1)
            {
                System.out.print(" ");
                hg = hg -1;
            }
             op = ut; ck1 = ck1 +2 ;
            do
            {
                System.out.print(ck1+ " ");
                
                op = op-1;
            }
            while(op>= 1);   
            System.out.println(" ");
            sp = sp - 4;
            ut = ut +1;
        }
        System.out.println("");
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
