public class Is121Array {
    public static void main(String args[])
    {
        int[] a={1, 1, 2, 2, 2, 2, 1, 1};
        int result=is121Array(a);
        System.out.println(result);
    }
    public static int is121Array(int[] a)
    {
        if(a.length<3||a[0]!=1||a[a.length-1]!=1||a[a.length/2]!=2)
        return 0;
        for(int i=0;i<a.length;i++)
        {
              
            if(a[i]==1&&a[a.length-1-i]!=1)
             {
                return 0;
             } 
            if(a[i]==2)
            {
                for(int j=i;j<=a.length-1-i;j++)
                {
                    if(a[j]!=2)
                    return 0;
                }
            }
        }
        return 1;
    }
}
