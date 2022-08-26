public class OnionArray {
    public static void main(String args[])
    {
        int a[]={1, 2, 3, 4, 15};
        int result=isOnionArray(a);
        System.out.println(result);
    }
    public static int isOnionArray(int[] a)
    {
        if(a.length<=1)
        return 1;
        for(int j=0,k=a.length-1;j<a.length/2;j++,k--)
        {
            if(a[j]+a[k]>10)
               return 0;
        }
        return 1;
    }
}
