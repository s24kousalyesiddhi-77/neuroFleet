 class L_Even_Odd_Digit_Sum 
 {
    public static void main(String[] args) 
    {
        int num=8321,EvenAdd=0,OddAdd=0; // 8+2=10, 3+1=4  153
        while (num>0) 
        {
           int rem=num%10;
           if(rem%2==0)
           {
            EvenAdd=EvenAdd+rem;
           }
           else
           {
            OddAdd=OddAdd+rem;
           }
          num= num/10;
        }
        System.out.println("EvenAdd = "+EvenAdd);
        System.out.println("OddAdd = "+OddAdd);
    } 
}
