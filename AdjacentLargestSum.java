public class AdjacentLargestSum {
    public static void main(String args[])
    {
        int a[]={1,2,3};
    int result=adjacentLargestSum(a);
    System.out.println(result);
    }

public static int adjacentLargestSum(int[] a)
{
    int max=a[0]+a[1];
    for(int i=1;i<a.length-1;i++)
    {
        if(a[i]+a[i+1]>max)
          max=a[i]+a[i+1];
    }
   return max;
}
}
