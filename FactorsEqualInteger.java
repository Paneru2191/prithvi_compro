public class FactorsEqualInteger {
    public static void main(String[] args) {
        System.out.println(isFactorsEqual(10,9));
    }
    public static int isFactorsEqual(int n, int m){
        int factorsN=2, factorsM=2;
        int i=2;
        while(i<=n/2){
            if(n%i==0) factorsN++;
            i++;
        }
        i=2;
        while(i<=m/2){
            if(m%i==0) factorsM++;
            i++;
        }
        if(factorsM==factorsN) return 1;
        return 0;
    }
}
