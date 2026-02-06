public class Pattern{
    Pattern(int start , int stop)
    {
        for(int i=start ; i<=stop ; i++)
        {
         for(int j=start ; j<=i ; j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    }
    Pattern()
    {
                    System.out.println("hello");
    }
    public static void main(String [] args)
    {
        int a=1, b=7;
        new Pattern(a,b);
         new Pattern();

    }
}