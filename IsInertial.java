public class IsInertial {
    public static void main(String args[])
    {
        int a[]={-2, -4, -6, -8, -11};
        int isinertial=isInertial(a);
        System.out.println(isinertial);
    }
    public static int isInertial(int[] a)
    { 
        if(a.length==0)
             return 0;
        int oddFlag=0;
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(oddFlag==0&&a[i]%2==1)
            oddFlag=1;
        }
        if(oddFlag==1&&max%2==0)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==1)
                {
                    for(int j=0;j<a.length;j++)
                    {
                        if(a[i]<=a[j]&&a[j]!=max&&a[j]%2==0)
                        return 0;
                    }
                }
            }
        }
        else
           return 0;
           return 1;
    }
    
}
