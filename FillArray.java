public class FillArray {
    public static void main(String[] args) {
        int a[]={1,2,3,5, 9, 12,2,1};
            int b[]=fill(a,3,10);
            for(int x:b)
            System.out.println(x);
    }
    public static int[] fill(int[] a, int k, int n){
        if(k==0)return null;
        int b[]=new int[n];
        int j=0;
        for(int i=0;i<b.length;i++){
             b[i]=a[j];
                j++;
             if(j==k)
                j=0;
        }
        return b;
    }
}
