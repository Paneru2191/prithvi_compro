public class ISnUnique {
   public static void main(String args[])
   {
    int a[]={7, 3, 3, 2, 4};
    int result=isNUnique(a,11);
    System.out.println(result);
   } 
   public static int isNUnique(int a[], int n)
   {
       if(a.length==1)
      return 0;
      int flag=0;
      for(int i=0;i<a.length-1;i++)
      {
        for(int j=i+1;j<a.length;j++)
        {
          if(a[i]+a[j]==n)
           flag++;
           if(flag>1)
           return 0;  
        }
      }
      if(flag==1)
      return 1;
      else return 0;
   }
}
