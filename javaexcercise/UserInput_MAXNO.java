import java.util.Scanner;

class UserInput_MAXNO
{
    public static void main(String[] args) 
    {
     Scanner obj= new Scanner(System.in);
     int i ;
     int a[]= new int[100];
     System.out.print("Enter size = ");
     int size=obj.nextInt();

     for(i=0 ;i<size ;i++)
     {
         System.out.print("Enter Array = ");
         a[i]=obj.nextInt();
     }
     int max=a[0];
     for(i=0 ; i<=size; i++)
    {
         if(max<a[i])
         {
             max=a[i];
         }
     }
     System.out.println("="+max);
    }
}
