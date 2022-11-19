public class PairwiseSum {
   public static void main(String args[])
   {
    int a[]={1,2,3,4,5,6,7};
    int[] result=pairwiseSum(a);
    if(result==null) System.out.println(result);
    else {
        for(int x:result) 
          System.out.print(x+",");
    }
   } 
   public static int[] pairwiseSum(int[] a)
   {
   
    if(a.length==0||a.length%2!=0) return null;
    int res[]=new int[a.length/2];
    int j=0;
    for(int i=0;i<a.length-1;i=i+2)
    {
        res[j]=a[i]+a[i+1];
        j++;
    }
    
    return res;

   }
}
