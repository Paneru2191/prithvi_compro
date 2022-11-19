public class AllValueSameArray {
    public static void main(String args[])
    {
        int a[]={1,1,1,1,1,1};
        System.out.println(allValuesTheSame(a));
    }
    public static int allValuesTheSame(int[] a)
    {
        if(a.length==0) return 0;
        if(a.length==1) return 1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1]) return 0;

        }
        return 1;
    }
}
