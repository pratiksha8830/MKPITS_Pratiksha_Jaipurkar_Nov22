import java.util.Scanner;
class assig6_25
{
public static void main(String[]args)
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your number");
int a=sc.nextInt();
int b=sc.nextInt();
int R=a+b;
System.out.println("sum of two no=" +R);
int R1=a-b;
System.out.println("sub of two no=" +R1);
int R2=a*b;
System.out.println("mult of two no=" +R2);
int R3=a%b;
System.out.println("Div of two no="+R3);
}
}
