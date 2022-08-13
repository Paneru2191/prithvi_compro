public class SolveTenFactorial {
    public static void main(String args[])
    {
        int a[]=solve10();
        System.out.println(factorial(10));
        for(int n:a)
        {
            System.out.println(n);
        }
    }
    public static int[] solve10()
    {   int fact10=factorial(10);
        int[] a=new int[2];
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=10;j++)
            {
                if(factorial(i)+factorial(j)==fact10)
                {
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
                
            }
        }
        return a;
    }
    public static int factorial(int n)
    {
        if(n==0||n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
}
