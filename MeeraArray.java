public class MeeraArray {
    public static void main(String[] args) {
        int[] a={8, 3, 4} ;
        System.out.println(isMeeraArray(a));
    }
    public static int isMeeraArray(int[] a){
        int tik;
        for(int i=0;i<a.length;i++){
            tik=a[i]*2;
            for(int j=0;j<a.length;j++){
                if(a[j]==tik)
                    return 0;
            }
        }
        return 1;
    }
}
