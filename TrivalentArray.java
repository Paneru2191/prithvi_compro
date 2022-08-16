import java.util.ArrayList;

public class TrivalentArray {
    public static void main(String args[])
    {
        int[] a={1,2,3,4};
        int result=isTrivalent(a);
        System.out.println(result);
    }
    public static int isTrivalent(int[] a)
    {
        if(a.length==0)
        return 0;
        ArrayList <Integer> arrayvalues=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(!arrayvalues.contains(a[i]))
            {
                arrayvalues.add(a[i]);
            }
            if(arrayvalues.size()>3)
            return 0;
        }
        if(arrayvalues.size()==3)
        return 1;
        else
        return 0;
    }
}
