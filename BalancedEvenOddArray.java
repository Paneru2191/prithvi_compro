public class BalancedEvenOddArray {
    public static void main(String[] args) {
        int[] a={2,3,4,5,6,8};
        System.out.println(isBalanced(a));
    }
    public static int isBalanced(int[] a){
        int i=0;
       while(i<a.length)
       {
        if(a[i]%2!=0)return 0;
        i++;
        if(a[i]%2==0) return 0;
        i++;
       }
       return 1;
    }
}
