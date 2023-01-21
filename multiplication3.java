import java.util.*;

class multiplication3
{
public static void main(String[]args)
{
int n1,n2,n3,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your 1 number");

n1=sc.nextInt();

System.out.println("Enter your 2 number");
n2=sc.nextInt();

System.out.println("Enter your 3 number");
n3=sc.nextInt();
num=n1*n2*n3;
System.out.println("multiplication3 * "+num);
}
}