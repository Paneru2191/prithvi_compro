public class NiceArray {
    public static void main(String[] args) {
        int[] a={1,0,2};
        System.out.println(isNiceArray(a));
    }
    public static int isNiceArray(int[] a){
        int found;
        if(a.length<1) return 0;
        for(int i=0;i<a.length;i++){
            found=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]-1||a[i]==a[j]+1){
                    found=1;break;
                }
              
            }
            if(found!=1) return 0;

        }
        return 1;
    }
}
