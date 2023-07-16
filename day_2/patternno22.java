public class patternno22 {
    public static void main(String s[])

    {
        
        int n=5;
        for(int i=1;i<=n;i++)

        {
            for(int j=1;j<=n;j++)
            {
                if(j==i)
                {
                    System.out.print(i);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
    }
}
}
