//*write a program to convert octal to decimal*//

import java.util.*;
class Basic_15{

public static void main(String[]args){

System.out.println("Enter the octal number");
Scanner sc= new 
Scanner(System.in);

int n=sc.nextInt();
int dec=0;
int count=0;
while(n>0)
{

int r=n%10;
dec=dec+r*pow(8,count);
count++;
n/=10;
}
System.out.println("decimal equivalent:"+dec);
}
static int pow( int n,int p)
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}
}