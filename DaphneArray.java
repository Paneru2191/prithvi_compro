public class DaphneArray {
    public static void main(String[] args) {
        int a[]={8,7};
        System.out.println(isDaphne(a));
    }
    public static int isDaphne(int[] a)
    {
        if(a[0]%2==0){
            for(int i=1;i<a.length;i++){
                if(a[i]%2!=0)
                return 0;
            }
        }
        else{
            for(int i=0;i<a.length;i++)
            {
                if(a[i]%2==0)
                return 0;
            }
        }
        return 1;
    }
   
}
