public class SameNoOfFactor {
    public static void main(String args[])
    {
        System.out.println(sameNoOfFactor(30,21));
    }
    public static int sameNoOfFactor(int n1, int n2)
    {
        if(n1<0||n2<0) return -1;
        int fn1=0,fn2=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            fn1++;
        }
        for(int i=1;i<=n2;i++)
        {
            if(n2%i==0)
            fn2++;
        }
        if(fn1==fn2) return 1;
        else return 0;
    }
}
