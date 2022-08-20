public class IsPackedArray {
   public static void main(String args[])
   {
    int a[]={2,2,1,3,3,3};
    int result=isPacked(a);
    System.out.println(result);
   } 
   public static int isPacked(int a[])
   {int i=0;
      while(i<a.length)
      {
        if(a[i]<1)
           return 0;
           int j=a[i];
           int val=a[i];
           while(j>0 && i<a.length)
           {
              if(val==a[i])
               {
                i++;
                j--;
               }
               else break;

           }
           for(int k=i;k<a.length;k++)
           {
             if (val==a[k])
               return 0;
           }
           if(j!=0) return 0;
      }
      return 1;
   }
}
