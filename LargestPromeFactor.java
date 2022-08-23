public class LargestPromeFactor {
    public static void main(String args[])
    {
        int result=largestPrimeFactor(1000);
        System.out.println(result);
    }
    
    public static int largestPrimeFactor(int n)
    {
        if(n<=1)
        return 0;
        int large=0, isprime;
       for(int i=2;i<=n/2;i++)
       {
         isprime=1;
         if(n%i==0)
         {
            for(int j=2;j<=i/2;j++)
            {
               if(i%j==0)
               {
                   isprime=0;
                   break;
               }
            }
            if(isprime==1)
             large=i;
            
         }
       }
       return large;
    }
}
