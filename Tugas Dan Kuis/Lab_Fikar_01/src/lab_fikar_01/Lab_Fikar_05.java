package lab_fikar_01;
public class Lab_Fikar_05 
{
    public static void main(String[] args) 
    {
        int ut = 1; int ck = 9; int jk = 0; int t = 0;
        while(ut<=2)
        {
            int br1 = 34; int tot = 0;
            while(br1>=31)
            {
                int br2 = 9; int nl = 2;
                while(br2>=7)
                {
                    jk = br1 + br2 - ck;
                    t = jk * nl;
System.out.println(br1+" + "+br2+" - "+ck+" = "+jk+" * "+nl+" = "+t);
tot = tot + t;
                    nl = nl + 2;
                    ck = ck - 1;
                    br2 = br2 - 2;
                    tot = tot + 1;
                }
                br1 = br1 - 3;
            }
            System.out.println("------------------ +");
            System.out.println("Total = "+tot);
            ut = ut + 1;
        }
        System.out.println("FIKAR DWI RAMADHANI 0022");
    }
}
