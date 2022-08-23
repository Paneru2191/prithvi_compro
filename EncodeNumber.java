import java.util.ArrayList;
public class EncodeNumber {
   public static void main(String args[])
   {
     int[] result=encodeNumber(24);
     for(int x:result)
     System.out.println(x);
   } 
   public static int[] encodeNumber(int n)
   {  int i=2,product=1,m=n;
    ArrayList<Integer> array=new ArrayList<Integer>();
      while(true)
      { 
         if(isPrime(i))
         {
            while(n%i==0)
            {
                array.add(i);
                product=product*i;
                n=n/i;
            }
         }
         if(m==product)
         break;
         i++;

      }
      int result[]=new int[array.size()];
      for(int j=0;j<result.length;j++)
        result[j]=array.get(j);
        return result;
        
   }
   public static boolean isPrime(int n)
   {
     for(int i=2;i<=n/2;i++)
     {
        if(n%i==0)
         return false;
     }
     return true;
   }
}
