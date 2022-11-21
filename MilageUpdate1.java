public class MilageUpdate1 {
    public static void main(String args[])
    {
        int a[]={8, 9, 9, 5, 0};
        updateMilage(a,2);
       
    }
    public static void updateMilage(int[] a, int miles)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=a[i]+miles;
            a[i]=sum%10;
            miles=sum/10;
            System.out.print(a[i]+",");
        }
    }
}
