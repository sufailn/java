import java.util.Scanner;
class Fib
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int n1=0,n2=1;
System.out.println("Enter the limit");
int n=input.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(n1+" ");
int n3=n1+n2;
n1=n2;
n2=n3;
}
}
}
