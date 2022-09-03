public class FactorialPrime {
    public static void main(String args[])
    {
        int result=isfactorialPrime(7);
        System.out.println(result);
    }
   

    public static int isfactorialPrime(int n)
    {
        if(n<=0)
        return 0;
        int isprime=1, isfactprime=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isprime=0;
                break;
            }
        }
        if(isprime==1)
        {
            for(int i=1;i<n;i++)
            {
                if(factorial(i)+1==n)
                {
                    isfactprime=1;break;
                }
            }
        }
       return isfactprime;
    }
    public static int factorial(int n)
    {
        if(n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
}
