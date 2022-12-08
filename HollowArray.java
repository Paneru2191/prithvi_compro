public class HollowArray {
    public static void main(String[] args) {
        int[] a={1,1,0,0,0,0,1,1};
        System.out.println(isHollow(a));
    }
    public static int isHollow(int[] a)
    {
        if(a.length<3) return 0;
        int i=a.length/2;
        if(a[i]!=0||a[i-1]!=0||a[i+1]!=0)
            return 0;
        int j=a.length-1;i=0;
        while(a[i]!=0)
        {
            if(a[j]==0)
                return 0;
            i++;
            j--;
        }
        return 1;
    }
}
