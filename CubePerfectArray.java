public class CubePerfectArray {
    public static void main(String[] args) {
        int a[]={64,5};
       System.out.println(isCubePerfect(a));
    }
    public static int isCubePerfect(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int flag=0;
            for(int j=0;j*j*j<=Math.abs(a[i]);j++)
            {
                if(Math.abs(a[i])==j*j*j)
                {
                    flag=1;break;
                }
            }
            if(flag!=1) return 0;
        }
        return 1;
    }
}
