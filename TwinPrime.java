public class TwinPrime {
    public static void main(String[] args) {
        System.out.println(isTwinPrime(17));
    }
    public static int isTwinPrime(int n)
    {
        int i=n+2;
        int j=n-2;
        if(isPrime(i)&&isPrime(j))
        return 1;
        else 
        return 0;
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}
