public class DecodeArray {
    public static void main(String args[])
    {
        int a[]={2, -3, -2, 6, 9, 18};
        int result=decodeArray(a);
        System.out.println(result);
    }
    public static int decodeArray(int[] a)
    {  
        int result=0;
        for(int i=0;i<a.length-1;i++)
            result=result*10+Math.abs(a[i]-a[i+1]);
            
        if(a[0]<0)
        return -1*result;
        else 
        return result;
    }
}
