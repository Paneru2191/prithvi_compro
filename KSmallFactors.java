public class KSmallFactors {
    public static void main(String[] args) {
        System.out.println(isKSmall(10,20));
    }
    public static int isKSmall(int k,int n){
         for(int i=2;i<=n/2;i++){
            if(n%i==0&&i<k&&n/i<k) return 1;
         }
         return 0;
    }
}
