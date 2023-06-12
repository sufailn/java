import java.util.Scanner;
class Student
{
String name;
int rollno,mark;
void get(String nm,int rn,int mk)
{
name=nm;
rollno=rn;
mark=mk;
}
class Sports
{
String spname;
int acpoint;
void detail(String sn,int acp)
{
spname=sn;
acpoint=acp;
}
void display()
{
System.out.println("STUDENT NAME:" +name);
System.out.println("ROLL NO:" +rollno);
System.out.println("ACADEMIC MARK:" +mark);
System.out.println("SPORTS NAME:" +spname);
System.out.println("SPORTS POINT:" +acpoint);
}
}}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the student name:");
String n=sc.next();
System.out.println("Enter the rollno:");
int r=sc.nextInt();
System.out.println("Enter the Academic mark:");
int am=sc.nextInt();
System.out.println("Enter the sports name:");
String sp=sc.next();
System.out.println("Enter the sports point:");
int sm=sc.nextInt();
Student s1=new Student();
Student.Sports sp1=s1.new Sports();
s1.get(n,r,am);
sp1.detail(sp,sm);
sp1.display();
}

}
