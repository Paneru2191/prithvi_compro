
public class AnagramsArrays {
    public static void main(String args[])
    {
        char a[]={'p','o','l','l'};
        char b[]={'p','o','o','l'};
        System.out.println(areAnagrams(a,b));
    }
    public static int areAnagrams(char[] a, char[] b)
    {    
        if(a.length==0&&b.length==0) return 1;
        if(a.length!=b.length) return 0;
        char a1[]=sort(a);
        char a2[]=sort(b);
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]!=a2[i])
            return 0;
        }
        return 1;
    }   
    public static char[] sort(char a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
               if(a[j]<a[j+1])
               {
                    char temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
               }
            }
        }
        return a;
    } 
}
