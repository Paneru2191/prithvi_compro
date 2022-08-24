public class CubePowerfulNumber {
    public static void main(String args[])
    {
        int result=isCubePowerful(407);
        System.out.println(result);
    }
    public static int isCubePowerful(int n)
    {
        if(n<=0) return 0;
        int m=n,sum=0,digit; 
        while(n!=0)
        { 
            digit=n%10;
           sum=sum+digit*digit*digit;
           n=n/10;
        }
        if(m==sum)
        return 1;
        return 0;
    }
}
