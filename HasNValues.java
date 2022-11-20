import java.util.ArrayList;
public class HasNValues {
    public static void main(String args[])
    {
        int a[]={1, 1, 1, 8, 1, 1, 1, 3, 3};
        System.out.println(hasNvalues(a,2));
    }
    public static boolean hasNvalues(int[] a, int n)
    {
        if(n>a.length) return false;
        ArrayList <Integer> b=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(b.size()>n) break;
            if(!b.contains(a[i]))
            {
                b.add(a[i]);
            }    
        }
        if(b.size()==n) return true;
        else return false;
    }
}
