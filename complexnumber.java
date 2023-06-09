import java.util.Scanner;
class Compnum {
        int real;
        int img;
        public Compnum(int real, int img){
                this.real=real;
                this.img=img;
        }
Compnum addComp(Compnum c1, Compnum c2)
{
Compnum temp = new Compnum(0,0);
temp.real = c1.real + c2.real;
temp.img = c1.img + c2.img;
return temp;
}
}
class main{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first real part:");
int r1 = sc.nextInt();
System.out.println("enetr the first img part:");
int i1 = sc.nextInt();
System.out.println("enetr the second real part:");
int r2 = sc.nextInt();
System.out.println("enter the second img part:");
int i2 = sc.nextInt();
Compnum c1=new Compnum(r1,i1);
Compnum c2=new Compnum(r2,i2);
Compnum sum=new Compnum(0,0);
sum=sum.addComp(c1,c2);
System.out.println("the complex number after addiation : " +sum.real+"+"+sum.img+"i");
}
}
~
