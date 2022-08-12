public class SquarePair {
    public static void main(String args[])
    {
       int[] a={ 11,5,20};
        int count=countSquarePairs(a);
        System.out.println(count);
    }
    public static int countSquarePairs(int[] a)
    {
        if(a.length<=1)
        return 0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]<a[j]&&a[i]>0&&a[j]>0)
                {
                    if(isPerfectSquare(a[i]+a[j])==1)
                    count++;
                }
            }

        }
        return count;
    }
    public static int isPerfectSquare(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(i*i==n)
              return 1;
        }
        return 0;
    }
    
}
