//* write a program to convert binary to decimal*//

import java.util.*;
class Basic_13{
public static void main(String[]args){

System.out.println("enter the binary number");
Scanner sc=new
Scanner(System.in);

long n=sc.nextLong();
long dec=0;
int count=0;
while(n>0)
{
long r=n%10;
dec=dec+r*pow(2,count);
count++;
n/=10;
}
System.out.println("decimal Equivalent:"+dec);

}
static int pow(int n,int p)
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
