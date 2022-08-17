public class MinMaxDisjointArray {
    public static void main(String args[])
    {
        int[] a={2, 4, 1,5, 3, 2};
        int result=isMinMaxDisjoint(a);
        System.out.println(result);
    }
    public static int isMinMaxDisjoint(int[] a)
    {
        int min=0,max=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[max])
            max=i;
           if(a[i]<a[min]) 
            min=i;
        }
        if(a[min]==a[max]||max==min+1||max==min-1)
        return 0;
        int mincount=0,maxcount=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==a[min])
            mincount++;
            if(a[i]==a[max])
            maxcount++;
        }
        if(mincount>1||maxcount>1)
         return 0;


        return 1;
    }
}
