public class CheckConcatenatedSum {
    public static void main(String args[])
    {
        int result=checkConcatenatedSum(198,3);
        System.out.println(result);
    }
    public static int checkConcatenatedSum(int n,int catlen)
    { 
        int catSum=0,digit,m=n,sum;
        while(n!=0)
        {
           digit=n%10;
           sum=0;
           for(int i=0;i<catlen;i++)
           {
            sum=sum*10+digit;
           }
           catSum+=sum;
           n=n/10;
        }
        if(catSum==m) return 1;
        return 0;
    }
}
