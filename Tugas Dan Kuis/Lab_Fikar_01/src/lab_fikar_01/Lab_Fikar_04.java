package lab_fikar_01;
public class Lab_Fikar_04 
{
    public static void main(String[] args) 
    {
        int a=50,b=9,c=13,d=0,e=2,f=0;
        int t1=0,t2=0,t3=0,t4=0,t5=0,t6=0;
        while(e<=6)
        {
            d=a+b-c;
            f=d*e;
            System.out.println(a+" + "+b+" - "+c+" = "+d+" * "+e+" = "+f);
            t1 = t1+a;
            t2 = t2+b;
            t3 = t3+c;
            t4 = t4+d;
            t5 = t5+e;
            t6 = t6+f;
            b = b -1;
            c = c+2;
            e = e + 1;
        }
        System.out.println("------------------------------ +");
        System.out.println(" "+t1+" + "+t2+" - "+t3+" = "+t4+" * "+t5+" = "+t6);
        System.out.println("Fikar Dwi Ramadhani 0022");
    }
    
}