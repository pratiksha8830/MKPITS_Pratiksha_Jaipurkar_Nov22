//*write a program to find sum of prime number*//

import java.util.Scanner;
class Basic_4{
public static void main(String[]args){

Scanner scn =new
Scanner(System.in);
System.out.println("Enter the range to print sum of prime Number");
int range=scn.nextInt();
int sum=0;
for(int i=1;i<=range;i++)
{
   if(isPrime(i))
   sum=sum+i;
}
System.out.println(sum);
}

public static boolean  isPrime(int num)
{
	if(num==1)return false;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			   return false;
			   }
			   }
			   return true;
			   }
			   }