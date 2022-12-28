public class FancyNumber {
    public static void main(String[] args) {
       
        System.out.println(isFancyNumber(18));
    }
    public static int isFancyNumber(int n){
        int a=1;
        int b=1;
        int f=1;
        while(f<=n){
            f=3*b+2*a;
            if(f==n) return 1;
            a=b;
            b=f;
        }
        return 0;
    }
}
