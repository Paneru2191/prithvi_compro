public class MinDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
    }
    public static int minDistance(int n){
        int f=1,min=n-1;
       for(int j=2;j<=n/2;j++){
           if(n%j==0){
            if(j-f<min){
                min=j-f;
            }
            f=j;
           }
       }
        System.out.println(min);
        return min;
    }
}
