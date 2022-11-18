public class RailRoadTieArray {
    public static void main(String args[])
    {
      int a[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int result=isRailRoadTie(a);
      System.out.println(result);
    }
    
    public static int isRailRoadTie(int [] a)
    {
     if(a[0]==0||a[a.length-1]==0)
     return 0;
     //if(a.length==2&&(a[0]!=0&&a[1]!=0)) return 1;
       
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
