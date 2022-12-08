public class ZeroBalanced {
    public static void main(String[] args) {
        int[] a={1,-1,4};
        System.out.println(isZeroBalanced(a));
    }
    public static int isZeroBalanced(int[] a)
    {
        if(a.length==0) return 0;
        int flag,sum=0;
        for(int i=0;i<a.length;i++)
        {     flag=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==-1*a[j])
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0) return 0;
            sum+=a[i];
        }
        if(sum==0) return 1;
        else return 0;
    }
}
