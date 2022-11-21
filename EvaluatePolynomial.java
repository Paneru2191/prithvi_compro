public class EvaluatePolynomial {
    public static void main(String args[])
    {
        int a[]={3, -2, -1};
        System.out.println(eval(a,2.0));
    }
    public static double eval(int[] a, double x)
    {
        double sum=0.0;
        for(int i=a.length-1;i>=0;i--)
        {
            double pow=1;
            for(int j=1;j<=i;j++)
                pow*=x;
            sum+=a[i]*pow;
        }
        return sum;
    }
}
