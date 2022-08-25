public class DecodeZeroOneArray {
    public static void main(String args[])
    {
        int a[]={0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1};
        int result=decodeArray(a);
        System.out.println(result);
    }
    public static int decodeArray(int[] a)
    {
        int result=0,countZero=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
              countZero++;
            if(a[i]==1)
            {
                result=result*10+countZero;
                countZero=0;
            }
               
        }
        if(a[0]==-1)
        return -1*result;
        else
        return result;
    }
}
