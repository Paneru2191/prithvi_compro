public class StantonNumber {
    public static void main(String args[])
    {
       int a[]={3, 1, 1, 4};
        int stantonCount=stantonMeasure(a);
        System.out.println(stantonCount);
    }
    public static int stantonMeasure(int[] a)
    {
        int oneCount=0,againCount=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
             oneCount++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==oneCount)
            againCount++;
               
        }
        return againCount;
    }
}
