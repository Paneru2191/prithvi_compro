public class SequentiallyBoundedArray {
    public static void main(String args[])
    {
        int[] a={6,6,6,6,6};
        int result=isSequentiallyBounded(a);
        System.out.println(result);
    }
    public static int isSequentiallyBounded(int[] a)
    {
        if(a.length==0)
        return 1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1]||a[i]<0)
            return 0;
        }
        int count,temp,j=0;
        while(j<a.length)
        {
            count=0;
            temp=a[j];
            while(count<temp&&j<a.length)
            {
                if(a[j]!=temp)
                break;
                count++;
                j++;
            }
            if(count==temp)
             return 0;
        }
        
        return 1;
    }
    
}
