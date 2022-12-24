public class MeeraArray1 {

    public static void main(String[] args) {
        int a[]={-4,0,0,2,2};
        System.out.println(isMeeraArray(a));
    }
    public static int isMeeraArray(int[] a){
        if(a.length<=1) return 0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=i) return 0;
            sum+=a[i];
        }
        if(sum==0) return 1;
        return 0;
    }
}
