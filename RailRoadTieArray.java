public class RailRoadTieArray {
    public static void main(String args[])
    {
      int a[]={1,0,1,1,0,1,1,0,1,1};
      int result=isRailRoadTie(a);
      System.out.println(result);
    }
    public static int isRailRoadTie(int [] a)
    {
     if(a.length<=4||a[0]==0||a[a.length-1]==0)
     return 0;
     for(int i=1;i<a.length-1;i++)
     {
        if(a[i]==0)
        {
         if(a[i-1]==0||a[i+1]==0)
         return 0;
        }
        if(a[i]!=0)
        {
          if((a[i-1]==0&&a[i+1]==0)||(a[i-1]!=0&&a[i+1]!=0))
          return 0;
        }
     }
     return 1;
    }
}
