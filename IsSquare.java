public class IsSquare {
    public static void main(String args[])
    {
        int issquare=isSquare(0);
        System.out.println(issquare);
    }
    public static int isSquare(int n)
    {
        
        for(int i=0;i*i<=n;i++)
        {
            if(i*i==n)
            {
                return 1;
                
            }
            
        }
        return 0;
    }
}
