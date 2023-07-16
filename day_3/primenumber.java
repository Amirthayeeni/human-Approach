public class primenumber {
    public static void main(String s[])

{
int n=3;
int flag=0;
if(n>1)
{
for(int i=2;i<n/2;i++)

{
    if(n%i==0)
    {
        flag=1;
        break;

    }
}
if(flag==0)
{
    System.out.println(n+"is not prime number");
}
else
{
    System.out.println(n+"is prime number");
}
}
else{
    System.out.println(n+"is not prime number");

}



}}
