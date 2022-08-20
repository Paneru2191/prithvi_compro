public class IsOddHeavyArray {
    public static void main(String args[])
    {
        int a[]={1, 1, 1, 1, 1, 1};
        int result=isOddHeavy(a);
        System.out.println(result);
    }
    public static int isOddHeavy(int[] a)
    {
        if(a.length==0)
        return 0;
        if(a.length==1)
        {
            if(a[0]%2==0)
             return 0;
             else
             return 1;
        }
        int isodd=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            { isodd=1;
               for(int j=0;j<a.length;j++)
               {
                    if(a[j]%2==0 && a[j]>a[i])
                    return 0;
               }
            }
        }
        if (isodd!=1)
        return 0;
        return 1;
    }
    
}
