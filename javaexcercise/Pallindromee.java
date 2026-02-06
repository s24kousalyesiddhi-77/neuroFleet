import java.util.Scanner;
 class Pallindromee
    {
        public static void main(String [] args)
        {
        Scanner sc = new Scanner(System.in);
        int n , t , rem , r=0;
        System.out.println("enter n");
        n=sc.nextInt();
        t=n;
        while (t>0)
        {
            rem=t%10;
            r=r*10+rem;
            t=t/10;
        }
        System.out.println("  reverse of entered number is ="+r);
        if (n==r)
        {
            System.out.println(" is pallindrome="+n);
        }
        else
        {
            System.out.println(" not pallindrome=");
        }
    }
        
}