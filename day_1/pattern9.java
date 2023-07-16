public class pattern9 {
    public static void main(String []s)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    
    }
}
