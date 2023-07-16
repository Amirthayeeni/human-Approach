public class alphapattern1 {
    public static void main(String  []s)

{
    /* A
     * B C
     * D E F
     * G H I F
     * K L M N O
     */
    int n=5;
    char ch='A';
    System.out.println("alpha pattern");
for(int i=1;i<=n;i++)
{
   
    for(int j=1;j<=i;j++)
    {
      System.out.print(ch+" ");
      ch++;
    }
    System.out.println();
}
}
}
