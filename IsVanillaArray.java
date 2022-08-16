public class IsVanillaArray {
    public static void main(String args[])
    {
        int[] a={-9,-999,-9999};
        int result=isVanilla(a);
        System.out.println(result);
    }
    public static int isVanilla(int[] a)
    {
        if(a.length==0)
        return 1;
        int absdigit,digit,check;
        check=Math.abs(a[0])%10;
        for(int i=0;i<a.length;i++)
        {
            absdigit=Math.abs(a[i]);
            while(absdigit!=0)
            {
                digit=absdigit%10;
                if(digit!=check)
                return 0;
                absdigit=absdigit/10;
            }
            
        }
        return 1;
    }
}
