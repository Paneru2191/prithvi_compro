public class OddValentArray {
    public static void main(String[] args) {
        int a[]={8, 8, 8, 4, 4, 7, 2};
        System.out.println(isOddValent(a));
    }
    public static int isOddValent(int[] a){
        int oddFound=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
            {
                oddFound=1;
                break;
            }
        }
        if(oddFound!=1) return 0;
        int result=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i!=j && a[i]==a[j]){
                    result=1;
                }
            }
        }
        return result;
    }
}
