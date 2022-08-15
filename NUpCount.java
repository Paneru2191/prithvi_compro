public class NUpCount {
    public static void main(String args[])
    {
        int upcount;
        int a[]={2, 3, 1, -6, 8, -3 -1, 2};
        upcount=isUpCount(a,5);
        System.out.println(upcount);
    }
    public static int isUpCount(int[] a,int n)
    {
        int partialSum=0, nUpCount=0;
        for(int i=0;i<a.length;i++)
        {
            if(partialSum<=n&&partialSum+a[i]>n)
            nUpCount++;
            partialSum+=a[i];
        }

      return nUpCount;
    }
}
