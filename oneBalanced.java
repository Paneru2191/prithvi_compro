public class oneBalanced {
    public static void main(String args[])
    {
        int a[]={1, 1, 1, 1, 1, 1};
      System.out.println(isOneBalanced(a));
    }
    public static int isOneBalanced(int[] a)
    {
        if(a.length==0)
        return 1;
        int oc=0,noc=0,seq=0;int j=0;
        while(j<a.length)
        {
            if(a[j]==1)
            {
                while(j<a.length&&a[j]==1)
                {
                    oc++;j++;
                }
               
            }
            else
            {
                seq++;
                while(j<a.length&&a[j]!=1)
                {
                    noc++;j++;
                }
            }
        }
        if(oc==noc&&seq==1) return 1;
        return 0;
    }
}
