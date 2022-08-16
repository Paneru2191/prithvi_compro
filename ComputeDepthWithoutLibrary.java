public class ComputeDepthWithoutLibrary {
    public static void main(String args[])
    {
        int result=computeDepth(42);
        System.out.println(result);
    }
    public static int computeDepth(int n)
    {
        int digit, found, depth=0,count=0, value;
        int[] a=new int[10];
        for(int i=0;i<a.length;i++)
           { a[i]=-1;}
        while(true)
        {
          depth++;
          value=n*depth;
          while(value!=0)
          {
             digit=value%10;
             found=0;
             for(int i=0;i<a.length;i++)
             {
                if(a[i]==digit)
                {
                    found=1;
                    break;
                }
             }
             if(found==0)
             {
                a[count]=digit;
                count++;
                if(count==10) 
                    return depth;
             }
             value=value/10;
          }
        }
    }
}
