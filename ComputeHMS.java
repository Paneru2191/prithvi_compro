public class ComputeHMS {
    public static void main(String args[])
    {
        int a[]=computeHMS(4000);
        for(int i:a)
            System.out.println(i);
    }
    public static int[] computeHMS(int s)
    {
        int a[];
        a=new int[3];
       a[0]=s/3600;
       s=s-a[0]*3600;
       a[1]=s/60;
       a[2]=s-a[1]*60;
       return a;

    }
}
