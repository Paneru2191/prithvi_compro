public class LoopSum {
    public static void main(String args[])
    { 
        int a[]={3};
        System.out.println(loopSum(a,10));
    }
    public static int loopSum(int[] a, int n)
    {
        int result=0, j=0;
       for(int i=0;i<n;i++)
       {
           result+=a[j];
           j++;
           if(j==a.length)
             j=0;
       }
       return result;
    }
}
