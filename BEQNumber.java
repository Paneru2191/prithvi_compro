public class BEQNumber {
    public static void main(String args[])
    {
        System.out.println("Smallest BEQ Number is:"+isBEQNumber());
    }
    public static int isBEQNumber()
    {
       int j=1;
          while(true) 
          {
            int m=j*j*j;
            int count=0;
            while(m!=0)
            {
                if(m%10==6)
                  count++;
                  m=m/10;
            }
            if(count==4) return j;
            j++;
          }        
    }
}
