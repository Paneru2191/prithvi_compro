public class MagicArray {
    public static void main(String[] args) {
        int a[]={0, 8, 9, 10} ;
        System.out.println(isMagicArray(a));
    }
    public static int isMagicArray(int[] a){
        int ps=0;
        for(int i=0;i<a.length;i++){
             if(isPrime(a[i])==1)
                ps+=a[i];
        }
        if(ps==a[0]) return 1;
        return 0;
    }
    public static int isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
}
