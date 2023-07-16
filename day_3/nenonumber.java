public class nenonumber {
    public static void main(String s[])
{
    /*
     * number=9
     * number*number =9*9=81
     * square=  8+1=9
     * number ==square  <----neno number
     * ----------------
     * number=45
     * number*number =2025
     * square=  2+0+2+5=9
     * number !=square  <---- so, not neno number
     */
int num=45;
int copy=num;
int sum=0;
int sq=num*num;

while(sq>0)
{
    
    int rem=sq%10;
  sum=sum+rem;
  sq=sq/10;
}
if(sum==copy)
{
    System.out.println("neno");
}
else
{


System.out.println(" not neno");
}
}
}
