import java.util.Scanner;
class Concatenate
{
int sum=0;
String s=null;
void add(int n1,int n2)
{
sum=n1+n2;
}
void add(String s1,String s2)
{
s=s1+s2;
}
void display()
{
System.out.println("The sum of 2 numbers are:" +sum);
System.out.println("The concatenated string is:" +s);
}
}

class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
Concatenate c=new Concatenate();
try
{
System.out.println("Enter the number1:");
int n1=in.nextInt();
System.out.println("Enter the number2:");
int n2=in.nextInt();
System.out.println("Enter the string1:");
String s1=in.next();
System.out.println("Enter the string2:");
String s2=in.next();
c.add(n1,n2);
c.add(s1,s2);
c.display();
}
catch(Exception e)
{
System.out.println("Exception occurred:");
}
}
}
