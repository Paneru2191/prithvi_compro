public class PrimeProduct {
    public static void main(String[] args) {
        System.out.println(isPrimeProduct(50));
    }
    public static int isPrimeProduct(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                if(isPrime(i)==1&&isPrime(n/i)==1) return 1;
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
