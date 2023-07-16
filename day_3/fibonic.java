public class fibonic {
    public static void main(String []s)
    {
        int count=10;
        int num1=0;
        int num2=1;
        int num3;
        
        for(int i=2;i<=count;i++)
        {
            
            
            System.out.print(num1);
            
            num3=num1+num2;
            num1=num2;
            num2=num3;

            

        }
        
    }
}
