public class NextPerfectSquare1 {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(111116));
    }
    public static int nextPerfectSquare(int n){
        int i=n+1;
        while(i<=Integer.MAX_VALUE){
           if(isPerfectSquare(i)) 
           {
            return i;
           }
           
           i++;
        }
        return -1;
    }
    public static boolean isPerfectSquare(int n){
    for(int i=1;i*i<=n;i++){
        if(i*i==n) return true;
    }
    return false;
    }
}
