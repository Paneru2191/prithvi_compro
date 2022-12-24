public class CompleteMaxEven{
    public static void main(String[] args) {
        int a[]= {2, 3, 2, 4, 11, 6, 10, 9, 8};
        System.out.println(isCompleteArray(a));
    }
    public static int isCompleteArray(int a[]){
        //if(a.length<=1) return 0;
        int max=0;int found=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0) return 0;
            if(a[i]%2==0){
                if(found==0)
                {
                    max=a[i];found=1;
                }   
                if(a[i]>max)
                {
                    max=a[i];
                }      
            }
        }
        int next=max-2;
        for(int i=0;i<a.length;i++){
            found=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==next){
                    found=1;
                    next=next-2;
                }
            }
            if(found==0) return 0;
            if(next<2) break;
        }
        return 1;
        
    }
}