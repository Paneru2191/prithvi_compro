public class SystematicallyIncreasingArray {
    public static void main(String args[])
    {
        int a[]={1,1,2,1,2,3,1,2,3,4};
        int result=isSystematicallyIncreasing(a);
        System.out.println(result);
    }
    public static int isSystematicallyIncreasing(int[] a)
    {
        if(a.length==0)
        return 0;
        if(a[0]!=1)
        return 0;
        int j=1,k=2,isSys=1;
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]!=j)
             {
                isSys=0;break;
             }
             if(j++==k)
             {
                 j=1;k++;
             }
        }
        return isSys;
    }
}
