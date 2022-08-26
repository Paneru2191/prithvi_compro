public class EncodeNumberToArray {
    public static void main(String args[])
    {
        int result[]=encodeArray(100001);
        for(int x:result)
        System.out.print(x+",");
    }
    public static int[] encodeArray(int n)
    {
        if(n==0)
        return new int[]{1};
        int m=n,digit,size=0;
        if(n<0)
        {
            size=1;
            n=-1*n;
        }
        while(n!=0)
        {
            digit=n%10;
            if(digit==0)
            size++;
            else
            size=size+digit+1;
            n=n/10;
        }
        int result[]=new int[size];
        if(m<0)
        {
            result[0]=-1;
            m=-1*m;
        }
        int index=result.length;
        while(m!=0)
        {
            digit=m%10;
            index--;
            result[index]=1;
            for(int i=index-1;i>index-digit;i--)
            {
                result[i]=0;
            }
            index=index-digit;
            m=m/10;
        }
          return result;
        //int a[]=new int[size];
        
    }
}
