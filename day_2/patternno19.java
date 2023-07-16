public class patternno19 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--) //row 
        {
            //space
            for(int s=1;s<i;s++)
            {
                System.out.print(" ");
            }
            //column
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            }
        }
    }

