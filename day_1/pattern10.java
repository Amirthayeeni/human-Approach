import javax.lang.model.util.ElementScanner14;

public class pattern10 {
    public static void main(String []s)
    {
        int i;
        int n=5;
        for( i=1;i<=2*n-1;i++)
        {
            if(i<=5)
            {
            for(int k=1;k<=i;k++)
            {
                System.out.print(".");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*"+" ");
            }
          System.out.println();
        }
    else
    {
            for(int k=1;k<=i;k++)
              {
                System.out.print(" ");
              }  
            for(int j=1;j<=n-i;j++) 
            {
                System.out.print("*");
            }   
            System.out.println();  
        
    }

    }}
}
