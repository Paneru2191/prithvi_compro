import javax.lang.model.util.ElementScanner6;

public class RepsEqual {
    public static void main(String args[])
    {
        int a[]={0,2,3,4,5};
        int n=2345;
        int isreps=repsEqual(a,n);
        System.out.println(isreps);
        
    }
    public static int repsEqual(int[] a,int n)
    {
        int sum=0, place=1;
        for(int i=a.length-1;i>=0;i--)
        {
            sum+=a[i]*place;
            place*=10;
        }
        if(n==sum)
        return 1;
        else
        return 0;
    
    }
}
