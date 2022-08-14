public class ArrayHasNoZeros 
{
   public static void main(String args[])
   {
     int[] a={0,1,1,1,1,1};
     int result=arrayHasNOZeros(a);
     System.out.println(result);
   }
   public static int arrayHasNOZeros(int[] a)
   {
     for(int i=0;i<a.length;i++)
     {
        if(a[i]==0)
             return 0;
     }
     return 1;
   }
}
