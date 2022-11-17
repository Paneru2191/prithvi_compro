public class HodderNumber {
    public static void main(String args[])
    {
        System.out.println(isHodderNumber(127));
    }
    public static int isHodderNumber(int n)
    {
        if(n<3) return 0;
        
        if(isPrime(n)==1)
        {
            int m=n+1;
            while(m!=1)
            {
                if((m%2)!=0)
                    return 0;
                m=m/2;
            }
            return 1;
        }
        return 0;
        
    } 
    public static int isPrime(int n)
    {
       for(int i=2;i<=n/2;i++)
       {
        if(n%i==0)
        return 0;
       }
        
        return 1;
    }
}
