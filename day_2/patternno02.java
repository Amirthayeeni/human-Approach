public class patternno02 {
    public static void main(String s[])
    {
        /*
         * 1
         * 2 2 
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */
        int n=5;
        //row
        for(int i=1;i<=n;i++)
        {
            //col
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            //next line
            System.out.println();
        }
    }
}
