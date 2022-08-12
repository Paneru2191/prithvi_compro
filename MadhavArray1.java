public class MadhavArray1 {
    public static void main(String args[])
    {
        int[] a={2,1,1,3,-1,0,7,3,-8,0,9};
        int result;
        result=isMadhavArray(a);
        System.out.println(result);
    }
    public static int isMadhavArray(int[] a)
    {
        int condition=0; int ismadhav=1;
        for(int i=1;i<=a.length;i++)
        {
            if(i*(i+1)/2==a.length)
            {
                condition=1;
                break;
            }
            if(i*(i+1)/2>a.length)
            {
                break;
            }
        }
        if(condition==1)
        {
            int sum,counter=0;
            for(int i=0;i<a.length;i=i+counter)
            {
                sum=0;
                for(int j=i;j<=i+counter;j++)
                {
                    sum+=a[j];
                }
                if(sum!=a[0])
                {
                    ismadhav=0;break;
                }
                counter++;
                    
            }
        }
        else
        ismadhav=0;
        return ismadhav;
    }
}
    

