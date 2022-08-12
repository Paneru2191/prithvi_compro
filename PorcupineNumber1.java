public class PorcupineNumber1 {
    public static void main(String args[])
    {
        int result=findPorcupineNumber(0);
             System.out.println(result);
       
    }
    public static int findPorcupineNumber(int n)
    {
        
        while(true)
        {
          n++;
          if(isPrime(n)&&n%10==9)
          {
            if(isPorcupine(n))
              return n;
          }

        }
    }
    public static boolean isPorcupine(int m)
    {
        while(true)
        {
            m++;
            if(isPrime(m))
            {
                if(m%10==9)
                   return true;
                else 
                    return false;
            }
        }
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
             return false;
        }
        return true;
    }
    
}
