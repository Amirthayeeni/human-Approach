public class patternno01 {
    public static void main(String s[])
{
    /*1
      1 2 
      1 2 3
      1 2 3 4 
      1 2 3 4 5
    */
    /*logic <--
     * row <--
     * i=1 i<=n
     * col <--
     * j=1 j<=i
     * 
     */
    int n=5;
    //row 
    for(int i=1;i<=n;i++)
    {
        // column
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        //after complete one row to take (next line)
        System.out.println();
    }
}


}
