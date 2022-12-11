public class ZeroLimited{
    public static void main(String[] args) {
        int[] a={1, 0, 5, -1, 0, 2, 3, 0, 8};
        System.out.println(isZeroLimited(a));
    }
    public static int isZeroLimited(int[] a){
        int k=0;
        for(int i=0;i<a.length;i++){
            if(i==3*k+1){
                if(a[i]!=0)
                {
                    return 0;
                }
                k++;
            }
            else if(a[i]==0)
                return 0;

        }
        return 1;
    }
}