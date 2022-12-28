public class BeanArrayPlusOneOrMinusOne {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(isBeanArray(a));
    }
    public static int isBeanArray(int[] a){
        int found=0;
        for(int i=0;i<a.length;i++){
            found=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]-1||a[i]==a[j]+1)found=1;
            }
            if(found==0) return 0;
        }
        return 1;
    }
}
