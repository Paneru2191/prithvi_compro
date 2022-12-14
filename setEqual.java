public class setEqual {
    public static void main(String[] args) {
        int a[]={1,9,12,9,9,1,12};
        int b[]={9,1,12,9,12,12,12,9};
        System.out.println(isSetEqual(a,b));
    }
    public static int isSetEqual(int a[], int[] b){
       int found;
       for(int i=0;i<a.length;i++){
        found=0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    found=1;
                    break;
                }
            }
            if(found!=1) return 0;
       }
       for(int i=0;i<b.length;i++){
        found=0;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    found=1;
                    break;
                }
            }
        if(found!=1) return 0;
       }
       return 1;
       
    }
}
