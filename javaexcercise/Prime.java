import java.util.Scanner;
public class Prime{
    Prime(int start , int stop)
    {
        for(int i=start ; i<=stop ;i++)
        {
        if(n%i==0)
        {
          if(i==n)
          {
            System.out.println("prime"+i);
          }
        }
        else
        {
            System.out.println("not prime");
        }
            
        }
    }
    Prime()
    {
                    System.out.println("hello");
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        int a=2, b=n;
        new Prime(a,b);
         new Prime();

    }
}