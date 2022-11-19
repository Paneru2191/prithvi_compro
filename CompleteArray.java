public class CompleteArray {
    public static void main(String args[])
    {
        int a[]={3, 2, 9, 5};
        System.out.println(isComplete(a));
    }
    public static int isComplete(int[] a)
    { if(a.length<=1) return 0;
        int ef=0,ps=0,as=0;
       for(int i=0;i<a.length;i++)
       {
            if(ef==0)
            {
                if(a[i]%2==0) ef=1;
            }
            if(ps==0)
            {
                if(isPerfectSquare(a[i])==1)
                ps=1;
            }
            if(as==0)
            {
                for(int j=0;j<a.length;j++)
                {
                    if(i!=j&&(a[i]+a[j])==8)
                    as=1;
                }
            }
            if(ef==1&&ps==1&&as==1) return 1;  
       }
       
       return 0;
    }
    public static int isPerfectSquare(int n)
    {
        for(int i=0;i*i<=n;i++)
        {
            if(i*i==n) return 1;
        }
        return 0;
    }
}
