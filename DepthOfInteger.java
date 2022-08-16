import java.util.ArrayList;
public class DepthOfInteger {
    public static void main(String args[])
    {
       int result=computeDepth(42);
       System.out.println(result);
    }
    public static int computeDepth(int n)
    {
        ArrayList <Integer> digits=new ArrayList<Integer>();
        int value,digit;
        for(int i=1;i<Integer.MAX_VALUE;i++)
        {
            value=n*i;
            while(value!=0)
            {
                digit=value%10;
                if(!digits.contains(digit))
                {
                    digits.add(digit);
                }
                if(digits.size()==10)
                return i;
                value=value/10;
            }
        }
        return 0;
    }


}
