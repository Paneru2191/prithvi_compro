public class IsIsolatedNumber {
    public static void main(String args[])
    {
        int result=isIsolatedNumber(15);
        System.out.println(result);
    }
    public static int  isIsolatedNumber(int n)
    {
        if(n<0||n>2097151)
        return -1;
        int nsquare=n*n;
        int ncube=nsquare*n;
        int nc,sdigit,cdigit;
        while(nsquare!=0)
        {
            nc=ncube;
            sdigit=nsquare%10;
            while(nc!=0)
            {
               cdigit=nc%10;
               if(sdigit==cdigit)
               return 0;
                  nc=nc/10;
            }
            nsquare=nsquare/10;

        }
        return 1;
    }
}
