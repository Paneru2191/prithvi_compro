public class ZeroPlentifulArray {
    public static void main(String args[])
    {
        int a[]={1, 0, 0, 0, 2, 0, 0, 0, 0};
        int result=isZeroPlentiful(a);
        System.out.println(result);
    }
    public static int isZeroPlentiful(int[] a)
    {
        if(a.length<4)
        return 0;
        int i=0,countzero,result=0;
        while(i<a.length)
        {
            if(a[i]!=0)
              {i++;}
              else{
                countzero=0;
                while(i<a.length&&a[i]==0)
                {
                    countzero++;i++;
                }
                if(countzero<4) return 0;
                else result++;
              } 
        }
        return result;
    }
}
