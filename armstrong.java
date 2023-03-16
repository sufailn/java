import java.util.Scanner;
class Arm
{
 public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  int number,temp,total=0;
  System.out.println("Enter the number:");
  int num=input.nextInt();
  number=num;
  while(number!=0)
  {
   temp=number%10;
   total=total+temp*temp*temp;
   number=number/10;
  }
  if(total==num)
  System.out.println("Amstrong number");
  else
  System.out.println("Not amstrong");
 }
}
