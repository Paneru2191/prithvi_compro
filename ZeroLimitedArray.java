public class ZeroLimitedArray {
    public static void main(String args[])
    {
        int a[]={1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0};
        System.out.println(isZeroLimited(a));
    }
    public static int isZeroLimited(int[] a)
    {
        if(a.length<=1) return 1;
        if(a.length>1&&a[0]==0) return 0;
       for(int i=0;i<a.length;i++)
       { 
        if((3*i+1)<a.length && a[3*i+1]!=0)
           {
            return 0;
           } 
        for(int j=3*i+2;j<a.length&&j<3*(i+1)+1;j++){
            if(a[j]==0) return 0;
        }
       }
       return 1;
    }
}
