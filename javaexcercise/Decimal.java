import java.util.Scanner;
public class Decimal{
    Decimal()
    {
        Scanner sc = new Scanner(System.in);
        int n , sum , d1, d2,d3 , dec;
        System.out.println("enter n");
        n=sc.nextInt();
        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        d3=n;
        dec=d1+d2*2+d3*4;
        {
        System.out.println("decimal no="+dec);
        }
    }
    public static void main(String [] args)
    {
        new Decimal();
    }
}
