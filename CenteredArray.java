public class CenteredArray {
    public static void main(String[] args) {
        int[] a={3, 2, 1, 1, 4, 6} ;
        System.out.println(isCentered(a));
    }
    public static int isCentered(int[] a){
        if(a.length==0||a.length%2==0) return 0;
        for(int i=0;i<a.length;i++){
            if(i!=a.length/2&&a[i]<=a[a.length/2])return 0;
        }
        return 1;
    }
}
