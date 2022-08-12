public class PrimeCount {
    public static void main(String args[])
    {
      int count;
      count=primeCount(10,50);
      System.out.println(count);
    }
    public static int primeCount(int start, int end)
    { int count=0;
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i)==1)
            count++;
        }
        return count;
    }
    public static int isPrime(int n)
    {    if(n<=1)
            return 0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            return 0;
        }
        return 1;
          
    }
    
}
