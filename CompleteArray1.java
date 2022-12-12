public class CompleteArray1 {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7,8} ;
        System.out.println(isCompleteArray(a));
    }
    public static int isCompleteArray(int[] a){
        int min=0,max=0,evenFound=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            {
                min=max=a[i];
                evenFound=1;
                break;
            }      
        }
        if(evenFound!=1)return 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                if(a[i]<min)
                    min=a[i];
                else if(a[i]>max)
                    max=a[i];
            }
        }
        if(min==max) return 0;
        for(int i=min+1;i<max;i++){
            int found=0;
            for(int j=0;j<a.length;j++){
                if(i==a[j]){
                    found=1;
                    break;
                }
            }
            if(found!=1)return 0;
        }
        return 1;
    }
}
