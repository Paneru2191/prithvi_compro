public class IsStackedNumber {
    public static void main(String args[])
    {
        int result=isStackedNumber(21);
        System.out.println(result);
    }
    public static int isStackedNumber(int n)
    {
        if(n<0)
          return 0;
    int sum=0,i=0;
        while(sum<=n)
        {
           sum+=i;
           if(sum==n)
           return 1;
          i++;
        }
        return 0;
    }
    
}
