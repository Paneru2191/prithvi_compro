public class IsFibonacci {
    public static void main(String args[])
    {
        System.out.println(isfibonacci(55));
    }
    public static int isfibonacci(int n)
    {
        int a=0,b=1,f=1;
        while(f<n)
        {
            f=a+b;
            a=b;
            b=f;
        }
        if(f==n) return 1;
        else return 0;
    }
}
