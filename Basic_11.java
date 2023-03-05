//*write a program to display range of fibonacci number*//

import java.util.Scanner;
class Basic_11{

public static void main(String[]args){

Scanner scn=new Scanner(System.in);
System.out.println("Enter the range:.........");
int range=scn.nextInt();

int a=0;
int b=1;
int c=0;

System.out.print(a);
System.out.print(b);
for (int i=2;i<=range;i++)
{
c=a+b;
if(c<=range)
{
//c=a+b;
System.out.print(c);
a=b;
b=c;
}
}
}
}