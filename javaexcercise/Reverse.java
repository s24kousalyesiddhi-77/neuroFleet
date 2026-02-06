import java.util.Scanner;
public class Reverse{
    Reverse()
    {
        Scanner sc = new Scanner(System.in);
        int n , sum , d1, d2 , rev;
        System.out.println("enter n");
        n=sc.nextInt();
        d1=n%10;
        n=n/10;
        d2=n;
        sum=d1+d2;
        rev=d1*10+d2;
        {
        System.out.println("add="+sum);
        }
        {
        System.out.println("reverse no="+rev);
        }
    }
    public static void main(String [] args)
    {
        new Reverse();
    }
}
