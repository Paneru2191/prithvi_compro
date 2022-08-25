public class DigitIncreasing {
     public static void main(String args[])
     {
        int result=isDigitIncreasing(984);
        System.out.println(result);
     }
     public static int isDigitIncreasing(int n)
     {
        int totSum,digit;
        for(int i=1;i<=9;i++)
        { 
            totSum=0;digit=i;
            while(totSum<n)
            {   
                   totSum+=digit;  
                    digit=digit*10+i;    
            }
            if(totSum==n)
            return 1;
            
            
        }
        return 0;
     }
}
