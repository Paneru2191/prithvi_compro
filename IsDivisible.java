public class IsDivisible {
   public static void main(String args[])
   {
    int[] a={3,3,6,12};
    int result=isDivisible(a,3);
    System.out.println(result);
   } 
   public static int isDivisible(int[] a, int n)
   {
      for(int i=0;i<a.length;i++)
      {
        if(a[i]%n!=0)
            return 0;
      }
      return 1;
   }
}
