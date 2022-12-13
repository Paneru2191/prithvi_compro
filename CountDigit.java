public class CountDigit {
    public static void main(String[] args) {
        //int a[]={};
        System.out.println(isCountDigit(233331,3));
    }
    public static int isCountDigit(int n, int digit){
        if(n<0||digit<0) return -1;
        int count =0;
        while(n>0){
            if(n%10==digit) count++;;
            n=n/10;
        }
        return count;
    }
}
