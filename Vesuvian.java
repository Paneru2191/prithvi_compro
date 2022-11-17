public class Vesuvian {
    public static void main(String args[])
    {
        System.out.println(isVesuvian(50));
    }
    public static int isVesuvian(int n)
    { int c=0;
        for(int i=1;i*i<n;i++)
        {    
                for(int j=i;j*j<n;j++)
                {
                    if(i*i+j*j==n)
                    c++;
                }
                
        }
        if(c==2) return 1; else return 0;
    }
    
}
