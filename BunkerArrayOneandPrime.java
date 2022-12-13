public class BunkerArrayOneandPrime {
    public static void main(String[] args) {
        int[] a={1,6,9,10};
        System.out.println(isBunker(a));
    }
    public static int isBunker(int[] a){
        int primeFound=0, oneFound=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1)  oneFound=1;
            else if(isPrime(a[i])==1) primeFound=1;
            if(oneFound==1&&primeFound==1) return 1;
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
