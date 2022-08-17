public class Smallest {
    public static void main(String args[])
    {
        int result=smallest(20);
        System.out.println(result);

    }
    public static int smallest(int n)
    {

       int multiple,isTwo,have2=0,result=0;
        for(int i=1;i<Integer.MAX_VALUE;i++)
        {
            have2=0;
            for(int j=1;j<=n;j++)
            {
                multiple=i*j;isTwo=0;
                while(multiple!=0)
                {
                    if(multiple%10==2)
                    {
                        isTwo=1;have2++;break;
                    }
                    multiple=multiple/10;
                }
                if(isTwo==0)
                break;
            }
            if(have2==n)
            {
                 result=i;
                break;
            }
        }
        return result;
    }
    
}
