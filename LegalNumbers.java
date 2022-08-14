public class LegalNumbers {
    public static void main(String args[])
    {
        int a[]={1,2,3};
        int islegal=isLegalNumbers(a,4);
        System.out.println(islegal);
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
