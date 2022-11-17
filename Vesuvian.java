public class Vesuvian {
    public static void main(String args[])
    {
        System.out.println(isVesuvian(41));
    }
    public static int isVesuvian(int n)
    {
        for(int i=1;i<n;i++)
        {    if(isSquare(i)==1){
                for(int j=1;j<n;j++)
                {
                    if((isSquare(j)==1)&&(i+j==n))
                    return 1;
                }
            }    
        }
        return 0;
    }
    public static int isSquare(int n)
    {
        for(int i=1;i<n;i++)
        {
            if(i*i==n)
            return 1;
        }
        return 0;
    }
}
