public class MatchArrays {
    public static void main(String args[])
    {
        int a[]={1, 3, -5, 6, 2, -3, 18};
        int b[]={2, -1, 1, 1, -1, 1};
        int result=matches(a,b);
        System.out.println(result);
    }
    public static int matches(int[] a, int[] b)
    {
        int mark=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<Math.abs(b[i]);j++)
            {
                if((b[i]<0&&a[mark]>0)||(b[i]>0&&a[mark]<0))
                return 0;
              mark++;
            }

        }
        return 1;
    }
}
