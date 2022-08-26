public class PrimeHappyNumber {
    public static void main(String args[])
    {
        int result=isPrimeHappy(25);
        System.out.println(result);
    }
    public static int isPrimeHappy(int n)
    {
        if(n<=2)
        return 0;
        int sum=0,isprime;
        for(int i=2;i<n;i++)
        {
            isprime=1;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                 {
                    isprime=0;break;
                 } 
            }
            if(isprime==1)
              sum+=i;
        }
        if(sum%n==0)
           return 1;
           return 0;
    }
}
