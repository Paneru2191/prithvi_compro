public class MercurialArray {
    public static void main(String args[])
    {
        int a[]={1,3,1};
        System.out.println(isMercurial(a));
    }
    public static int isMercurial(int[] a)
    {
        if(a.length<=2) return 1;
        int ls=0,rs=0;
        for(int i=0;i<a.length;i++)
        {
          if(a[i]==1)
          {
            ls=i;
            break;
          }  
        }
        for(int i=a.length-1;i>=0;i--)
        {
          if(a[i]==1)
          {
            rs=i;
            break;
          }  
        }
        for(int i=ls+1;i<=rs-1;i++)
        {
            
           if(a[i]==3) return 0;
        }

      return 1;
    }
}
