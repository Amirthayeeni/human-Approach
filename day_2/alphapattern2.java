public class alphapattern2 {
    public static void main(String s[])
    {
        /*
         * A
         * A B
         * A B C
         * A B C D
         * A B C D F
         */
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for(int j=1;j<=i;j++)
            {
               System.out.print(ch);
               ch++;
            }
            System.out.println();
        }
    }
}
