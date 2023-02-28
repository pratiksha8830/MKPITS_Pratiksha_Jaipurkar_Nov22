import java.util.Scanner;
class assig
{
int num1,num2,sum;
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
num1=sc.nextInt();
System.out.println("num1:"+num1);
System.out.println("Enter second number");
num2=sc.nextInt();
System.out.println("num2:"+num2);
}


void fun()
{
	if(num1==30||num2==30)

	{

System.out.println("true");
}
else
{

System.out.println("Sum of two number is:"+sum);

if(sum==30)
{

		System.out.println("true");
	}
}
}
}
class assig7_jan19
{
public static void main(String[]args)
{
assig ob=new assig();
ob.set();
ob.fun();
}
}