public class HenryPerfectNumber {
    public static void main(String args[])
    {
        int n=henry(1,3);
        System.out.println(n);
    }
    
    public static int henry(int i, int j)
    {
        int factorsum, totalsum=0, factorposition=0;
       for(int n=1;n<Integer.MAX_VALUE;n++)
       {
         factorsum=0;
         for(int k=1;k<n;k++)
         {
            if(n%k==0)
               factorsum+=k;
         }
         if(factorsum==n)
         {
            factorposition++;
            if(factorposition==i)
              totalsum+=n;
            if(factorposition==j)
            {
                totalsum+=n;
                break;
            }
              
        }
         
         
       }
       return totalsum;
    }
    
}
