public class FineArray {
    public static void main(String[] args) {
        int a[]={3, 8, 15}  ;
        System.out.println(isFineArray(a));
    }
    public static int isFineArray(int[] a){
       int found;
       for(int i=0;i<a.length;i++){
        if(isPrime(a[i])==1){
            found=0;
            for(int j=0;j<a.length;j++){
                if((a[j]==a[i]+2||a[j]==a[i]-2)&&isPrime(a[j])==1)
                  found=1;
            }
            if(found!=1) return 0; 
        }
       }
       return 1;
    }
    public static int isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return 0;
        }
        return 1;
    }
}
