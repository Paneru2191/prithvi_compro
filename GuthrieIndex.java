public class GuthrieIndex {
    public static void main(String args[])
    {
        
        int guthriecount=guthrieIndex(10);
        System.out.println(guthriecount);
    }
    public static int guthrieIndex(int n)
    {  
        
        int count=0;
        while(true)
        { 
          if(n==1)
          return count;
          if(n%2==0)
            n=n/2;
          else
            n=n*3+1;  
            
        count++;
        }
      
    }
}
