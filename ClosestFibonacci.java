public class ClosestFibonacci {
    public static void main(String args[])
    {
        System.out.println(isClosestFibonacci(1));
    }
    public static int isClosestFibonacci(int n)
    {
        if(n<1) return 0;
        //if(n==1) return 1;
        int a=0,b=1,f=1;
        while(f<n)
        {
            f=a+b;
            a=b;
            b=f;
        }
        return a;
    }
}
