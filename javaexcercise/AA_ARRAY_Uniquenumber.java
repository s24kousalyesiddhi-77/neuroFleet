public class AA_ARRAY_Uniquenumber 
{
    public static void main(String args[])
    {
        int a[][]={ { 33 , 43 ,52} , { 101 , 52 , 43} , { 66 , 578 , 578}} , i , j , k , l ;
        int count=0;
        for(i=0 ; i<=2 ; i++)
        {
            for(j=0 ; j<=2 ; j++)
            {
                for(k=0 ; k<=2 ; k++)
                {
                    for(l=0 ; l<=2 ; l++)
                    {
                        if(a[i][j]==a[k][l])
                        {
                            count++;
                        }
                    }
                }
                    if(count==1)
                      {
                         System.out.println("unique number="+a[i][j]);
                      }
                count=0;
            }
        }
    }
}
