public class ContinuousFactoredNumber {
    public static void main(String[] args) {
        System.out.println(isContinuousFactored(99));
    }
    public static int isContinuousFactored(int n){
        int p=1;
        int i=2,j,count;
        while(i<=n/2){
            if(n%i==0){
                j=i+1;p=i;count=1;
                while(j<=n/2){
                    if(n%j!=0||p>n){
                        break;   
                    }
                    p*=j;count++;
                    if(p==n&&count>1) return 1;
                    //if(p>n) break;
                    j++;
                }
            }
            i++;
        }
        return 0;
    }
}
