public class NBasedIntegerRounding {
    public static void main(String args[])
    {
        int [] a={-18, 1, 2, 3, 4, 5};
        int [] result=doIntegerBasedRounding(a,4);
        for(int x:result)
        System.out.println(x);
    }
    public static int[] doIntegerBasedRounding(int a[],int n)
    {
      if(n<=0)
      return a;
      int higher,lower;
      for(int i=0;i<a.length;i++)
      {
        if(a[i]<=0||a[i]==n)
        continue;
            lower=(a[i]/n)*n;
            higher=lower+n;
            if((higher-a[i])<=(a[i]-lower))
            {
                a[i]=higher;
            }
            else
              a[i]=lower;
      }
      return a;
    }
}
