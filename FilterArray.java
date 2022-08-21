import java.util.Arrays;
public class FilterArray {
    public static void main(String args[])
    {
         int a[]={8, 4, 9, 0, 3, 1, 2};
         int[] result=filterArray(a, 88);
         for(int x : result) {
			System.out.println(x);
		}
         System.out.println(Arrays.toString(result));
    }
    public static int[] filterArray(int[] a, int n)
    {
       int m=n;
       int arraySize=0, binarySize=0;
       while(n!=0)
       {
        binarySize++;
        if(n%2==1)
        {
            arraySize++;
        }
        n=n/2;
       }
       int [] reqArray=new int[arraySize];
       if(reqArray.length<=a.length&&binarySize<=a.length)
       {
           int i=0,c=0;
           while(m!=0)
           {
            if(m%2==1)
            {
                reqArray[i++]=a[c];
            }
            c++;
            m=m/2;
           }
       }
       return reqArray;
    }
}
