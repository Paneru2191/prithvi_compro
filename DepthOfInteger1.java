public class DepthOfInteger1 {
    public static void main(String[] args) {
        System.out.println(depth(34));
    }
    public static int depth(int n){
        int[] a=new int[10];
        int digit,size=0,product=n,count=1;
        a[size]=product%10;
        size++;
        product/=10;
         for(int i=1;i<Integer.MAX_VALUE;i++){
            while(product!=0){
                digit=product%10;
                int f=0;
                for(int j=0;j<size;j++){
                  if(a[j]==digit) {
                    f=1;
                    break;
                  }
                }
                if(f==0){
                    a[size]=digit;
                    size++;
                }
                product/=10;
            }
            if(size==10) break;
            count++;
            product=n*(i+1);    
         } 
        return count;
    }
}
