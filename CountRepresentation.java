public class CountRepresentation {
    public static void main(String args[])
    {
        int result=countRepresentation(15);
        System.out.println(result);
    }
    public static int countRepresentation(int rupee)
    {
        int count=0;
        for(int rupee20=0;rupee20<=rupee/20;rupee20++)
        {
            for(int rupee10=0;rupee10<=rupee/10;rupee10++)
            {
                for(int rupee5=0;rupee5<=rupee/5;rupee5++)
                {
                    for(int rupee2=0;rupee2<=rupee/2;rupee2++)
                    {
                        for(int rupee1=0;rupee1<=rupee;rupee1++)
                        {
                            if((rupee20*20+rupee10*10+rupee5*5+rupee2*2+rupee1)==rupee)
                            count++;
                        }
                    }
                }
            }
           

        }
        return count;
    }

    
}
