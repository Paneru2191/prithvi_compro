public class PairedN {
    public static void main(String args[])
    {
        int a[]={8, -8, 8, 8, 7, 7, -7};
        System.out.println(isPariedN(a,-15));
    }
    public static int isPariedN(int[] a,int n)
    {
        if(a.length==0) return 0;
        if(((a.length-1)+(a.length-2))<n)  return 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i!=j&&(i+j==n)&&(a[i]+a[j])==n)
                return 1;
            }
        }
        return 0;
    }
}
