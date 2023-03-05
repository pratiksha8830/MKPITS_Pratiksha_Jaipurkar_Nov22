//* Write  program weather the number is perfect number or not*//

import java.util.*;
class Basic_5{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();int sum=1;
for(int i=2;i<num/2;i++)
{

if(num%i==0)
sum=sum+i;
}
if(sum==num)
{
System.out.println( num+"is a Perfect number");
}
else
System.out.println(num+" is not a Perfect number");
}
}