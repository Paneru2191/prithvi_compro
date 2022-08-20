public class GetExponent {
   public static void main(String args[])
   {
    int result=getExponent(28,3);
    System.out.println(result);
   } 
   public static int getExponent(int n, int p)
   {    if(p<=1)
            return -1; 
        int count=0;
       while(n!=0)
       {
        if(n%p!=0)
        break;
        else{
            count++;
            n=n/p;
        }
       }
       return count;
   }
}
