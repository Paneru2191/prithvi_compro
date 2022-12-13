public class BunkerArray {
    public static void main(String[] args) {
        int[] a={2,2,2,2,9,7};
        System.out.println(isBunkerArray(a));
    }
    public  static int isBunkerArray(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]%2!=0){
                if(isPrime(a[i+1])==1) return 1;
            }
        }
        return 0;
    }
    public static int isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return 0;
        }
        return 1;
    }
}
