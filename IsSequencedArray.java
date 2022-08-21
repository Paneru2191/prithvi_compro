public class IsSequencedArray {
    public static void main(String args[])
    {
        int a[]={-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
        int result=isSequencedArray(a,-5,-2);
        System.out.println(result);
    }
    public static int isSequencedArray(int[] a,int m, int n)
    {
        if(a.length==0)
        return 0;
        if(a.length==1&&m!=n)
        return 0;
        if(a[0]!=m||a[a.length-1]!=n)
        return 0;
        for(int i=0;i<a.length-1;i++)
        {
           if(a[i+1]<a[i])
           return 0;
           if(a[i]!=a[i+1])
           {
            if(a[i+1]!=a[i]+1)
            return 0;
           }
        }
        return 1;
    }
}
