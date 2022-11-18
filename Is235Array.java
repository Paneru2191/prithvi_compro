public class Is235Array {
    public static void main(String args[])
    {
        int[] a={7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
        System.out.println(is235Array(a));
    }
    public static int is235Array(int[] a)
    { int ts=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
             ts++;
            if(a[i]%3==0)
            ts++;
            if(a[i]%5==0)
            ts++;
            if(a[i]%2!=0&&a[i]%3!=0&&a[i]%5!=0)
            ts++;
        }
        System.out.println(ts);
        if(ts==a.length)
        return 1;
        else
        return 0;
    }
}
