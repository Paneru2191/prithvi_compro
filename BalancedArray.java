public class BalancedArray {
    public static void main(String[] args) {
        int a[]={2,-2,2,2,2};
        System.out.println(isBalanced(a));
    }
    public static int isBalanced(int[] a){
        int found;
        for(int i=0;i<a.length;i++){
            found=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==-a[j]){
                    found=1;
                    break;
                }
                
            }
            if(found!=1) return 0;
        }
        return 1;
    }
}
