public class SumSafeArray {
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(isSumSafe(a,4));
    }
    public static int isSumSafe(int a[], int n){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==sum)return 0;
        }
        return 1;
    }
}
