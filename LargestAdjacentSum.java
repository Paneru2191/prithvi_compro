public class LargestAdjacentSum {
    public static void main(String args[])
    {
        int a[]={18, -12, 9, -10};
        System.out.println(largestAdjacentSum(a));
    }
    public static int largestAdjacentSum(int a[])
    {
        int max=a[0]+a[1];
        for(int i=1;i<a.length-1;i++)
        {
          if((a[i]+a[i+1])>max)
          max=a[i]+a[i+1];
        }
        return max;
    }
}
