//* write a program to check whether the given number is prime  or not *//

class Basic_3{

public static void main(String[]args){

java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
int i;
if(n==1)

{
System.out.println("Prime start from 2");
}
for(i=2;i<n;i++)
{

if(n%i==0)
System.out.println("not a prime");
break;
}
if(n==i)
System.out.println("prime");
}
}
