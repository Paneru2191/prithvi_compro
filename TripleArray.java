public class TripleArray {
    public static void main(String[] args) {
        int[] a={3, 1, 2, 1, 3, 1, 3, 2, 2};
        System.out.println(isTripleArray(a));
    }
    public static int isTripleArray(int[] a){
        if(a.length%3!=0) return 0;
        int count;
        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]) count++;
                if(count >3) return 0;
            }
            if(count!=3) return 0;
        }
        return 1;
    }
}
