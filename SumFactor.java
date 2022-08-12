public class SumFactor 
{
    public static void main(String args[])
    {
        int a[]={0, 0, 0};
        int sumfactor=sumFactor(a);
        System.out.println(sumfactor);
    }
    public static int sumFactor(int[] a)
    {
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            if(sum==a[i])
            count++;
        }
        return count;
    }
}