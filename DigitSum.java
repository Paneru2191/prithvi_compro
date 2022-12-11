public class DigitSum {
   public static void main(String[] args) {
    System.out.println(isDigitSum(3,7));
   }
   public static int isDigitSum(int n,int m){
    int digit, sum=0;
    while(n>0){
        digit=n%10;
        sum+=digit;
        if(sum>=m) return 0;
        n=n/10;
    }
    return 1;
   }
}
