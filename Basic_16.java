//*write a program to convert decimal to octal*//

import java.util.*;

class Basic_16{
public static void main(String[]args){

System.out.println("enter the decimal number");
Scanner sc=new
Scanner(System.in);

int n=sc.nextInt();
String oct="";
while(n>0)
{
int r=n%8;
oct =r+oct;
n=n/8;
}
System.out.println("Octal equivalent:"+oct);
}
}