import java.util.Scanner;
class Sum
{
 public static void main(String args[])
 {
  int n;
  int sum=0;
  Scanner input = new Scanner(System.in);
  System.out.print("enter the number:");
  n=input.nextInt();
  while(n!=0)
  {
   sum=sum+n%10;
   n=n/10;
  }
  System.out.println("sum of the number is:"+sum);
 }
}
