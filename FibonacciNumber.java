public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(isFibonacciNumber(3));
    }
    public static int isFibonacciNumber(int n){
        int a=0;
        int b=1;
        int f=1;
        while(f<=n){
            if(f==n) return 1;
            f=a+b;
            a=b;
            b=f;
        }
        return 0;
    }
}
