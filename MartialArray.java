public class MartialArray {
    public static void main(String args[])
    {
        int[] a={1, 3, 2, 2, 1, 5, 1, 5};
        System.out.println(isMartial(a));
    }
    public static int isMartial(int[] a)
    {
        if(a.length==0) return 0;
        int oc=0,tc=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1]) return 0;
            if(a[i]==1)
            oc++;
            if(a[i]==2)
            tc++;
        }
        if(a[a.length-1]==1) oc++;
        if(a[a.length-1]==2) tc++;
        if(oc>tc) return 1;
        else return 0;
    }
}
