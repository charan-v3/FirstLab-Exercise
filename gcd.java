// 12. Calculate the greatest common divisor (GCD) of two positive integers
import java.util.Scanner;
public class gcd{
    public static void main(String ar[])
    {
        int a,b,r;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("A : ");
            a=sc.nextInt();
            System.out.print("B : ");
            b=sc.nextInt();
        }
        if(a<b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
        }
        // System.out.println(a+"  "+b);
        r=b;
        b=a;
        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
        }
        System.out.println("GCD : "+b);
    }
}