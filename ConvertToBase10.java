public class ConvertToBase10 {
    public static void main(String args[])
    {
        int a[]={1, 1, 2,7};
        int result=convertToBase10(a,3);
        System.out.println(result);
    }
    public static int convertToBase10(int a[], int n)
    {
        int sum=0;int islegal;
        islegal=isLegalNumbers(a,n);
        if(islegal==1)
        {
            
           for(int i=a.length-1,j=0;i>=0;i--,j++)
           {
             sum+=a[i]*Math.pow(n,j);
           }
           return sum;
        }
        return -1;

    }
    public static int isLegalNumbers(int[] a, int n)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0||a[i]>=n)
            return 0;
        }
        return 1;
    }
}
