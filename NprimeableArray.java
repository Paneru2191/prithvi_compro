public class NprimeableArray {
    public static void main(String args[])
    {
        int[] a={5, 15, 27};
        System.out.println(isNprimeable(a,2));
    }
    public static int isNprimeable(int[] a, int n)
    {
        for(int i=0;i<a.length;i++)
        {
            if(isPrime(a[i]+n)==0)
            return 0;
        }
        return 1;
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
