public class NextPerfectSquare {
    public static void main(String args[])
    {
        int nextperfectSquare=nextPerfectSquare(36);
        System.out.println(nextperfectSquare);
    }
    public static int nextPerfectSquare(int n)
    {
        int square=0;int i=1;
        while(square<=n)
        {
          square=i*i;
          i++;
        }
        return square;
    }
    
}
