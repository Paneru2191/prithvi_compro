public class FullnessQuotient {
    public static void main(String args[])
    {
        
        int result=fullnessQuotient(94);
        System.out.println(result);
    }
    public static int fullnessQuotient(int n)
    { 
        if(n<1)
        return -1;
        int fullnessCount=0,temp,flag;
        for(int i=2;i<10;i++)
        {   temp=n;
            flag=1;
            while(temp!=0)
            {
               if(temp%i==0)
                 flag=0;
                 temp=temp/i;
            }
            if(flag==1)
            {
                fullnessCount++;
            }

        }
        return fullnessCount;
    }
}
