public class NormalNumber {
    public static void main(String[] args) {
        System.out.println(isNormal(7));
    }
    public static int isNormal(int n)
    {
        for(int i=3;i<=n/2;i=i+2)
        {
            if(n%i==0) return 0;
        }
        return 1;
    }
}
