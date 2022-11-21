public class LayeredArray {
    public static void main(String args[])
    {
        int[] a={1,1,2,2,2,3,3};
        System.out.println(isLayered(a));
    }
    public static int isLayered(int[] a)
    {
        if(a.length == 0 || a.length == 1) return 0;
        int count=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1]) count++;
            else if(a[i]<a[i+1])
            {
                if(count<2)
                    return 0;
                count=1;
            }
        }
        if(count<2) return 0;
        else return 1;
    }
}
