import java.util.Scanner;

class UserInput_ARRAYREPITITIVENO
{
   public static void main(String[] args) 
   {
    Scanner obj= new Scanner(System.in);
    int i , j;
    int a[]= new int[100];
    System.out.print("Enter size = ");
    int size=obj.nextInt();
   
    for(i=0 ;i<size ;i++)
        {
            System.out.print("Enter Array = ");
            a[i]=obj.nextInt();
        }
    for(i=0 ;i<=4  ;++i)
        {
            for(j=i+1 ; j<size ; j++)
            {
                if(a[i]==a[j])
                {
                  System.out.println(" =" +a[i]);
                }
            }
        }
}
}