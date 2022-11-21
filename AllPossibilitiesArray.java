public class AllPossibilitiesArray {
    public static void main(String args[])
    {
        int a[]={0,3,4,1,2};
        System.out.println(isAllPossibilities(a));
    }
    public static int isAllPossibilities(int[] a)
    {
        if(a.length==0) return 0;
        int found=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==a[j])
                {
                    found=1;break;
                }
            }
            if(found!=1) return 0;
            found=0;
        }
        return 1;
    }
}
