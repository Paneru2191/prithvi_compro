public class DaphneArray1 {
    public static void main(String[] args) {
        int a[]={8,8};
        System.out.println(isDaphne(a)); 
    }
    public static int isDaphne(int[] a){
        for(int i=0;i<a.length-1;i++){
            if((a[i]%2==0&&a[i+1]%2!=0))
            return 0;
            else if((a[i]%2!=0&&a[i+1]%2==0))
            return 0;
        }
        return 1;
    }
}
