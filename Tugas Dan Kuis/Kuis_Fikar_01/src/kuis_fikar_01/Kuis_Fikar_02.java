package kuis_fikar_01;
public class Kuis_Fikar_02 
{
    public static void main(String[] args) 
    {
        int a=1,b=72,c=32,d=0,bt=1;
        int to=0;
         while(b<=80)
        {
            d = b - c;
            
            System.out.println("Ternak "+a+","+" Memiliki "+b+" Telor "+","+" Dijual "+c+"="+d);
            to = to + d;
            a =  a + 1;
            b = b + 2;
            c = c - bt;
            bt = bt + 1;
        }
        System.out.println("------------------------------------------+");
        System.out.println("Sisa Telur Adalah = "+to);
    }
}
