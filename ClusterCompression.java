public class ClusterCompression {
   public static void main(String args[])
   {
        int a[]={8, 8, 6, 6, -2, -2, -2};
        int result[]=clusterCompression(a);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
   }
   public static int[] clusterCompression(int[] a)
   {
    if(a.length==0||a.length==1)
    return a;
    int cluster=1;
    for(int i=0;i<a.length-1;i++)
    {
        if(a[i]!=a[i+1]) 
        cluster++;
    }
    int result[]=new int[cluster];
    result[0]=a[0];
    int k=1;
    for(int i=1;i<a.length;i++)
    {
        if(a[i]!=a[i-1])
        {
            result[k]=a[i];
            k++;
        }
    }
    return result;
   } 
}
