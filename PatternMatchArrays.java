public class PatternMatchArrays {
    public static void main(String[] args) {
        int a[]={2,3,4,-5,-5,6,7};
    int b[]={3,-2,2};
    System.out.println(isPatternMatch(a,b));
    }
    

public static int isPatternMatch(int[] a, int[] b){
    int count=1,j=0,totalSum=0;
    for(int i=0;i<b.length;i++){
        if(b[i]<0)
          totalSum+=(-1)*b[i];
          else
            totalSum+=b[i];
    }
    if(totalSum!=a.length) return 0;
    for(int i=0;i<a.length-1;i++){
        if(a[i]>0&&a[i+1]>0)
        count++;
       else if(a[i]<0&&a[i+1]<0)
        count++;
        else{
            if(b[j]<0&&count!=-1*(b[j])) return 0;
            if(b[j]>0&&count!=b[j]) return 0;
            j++;
            count =1;
        }
    }
    return 1;
}
}
