public class SmartNumber {
    public static void main(String[] args) {
        System.out.println(isSmartNumber(16));
    }
    public static int isSmartNumber(int n){
        if(n==0)return 0;
        int next=1;
        int i=1;
        while(next<=n){
            if(n==next)
                return 1;
            next+=i;
            i++;
        }
        return 0;
    }
}
