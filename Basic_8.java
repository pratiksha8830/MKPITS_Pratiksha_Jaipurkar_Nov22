//*write a program to find the factorial of a given number*//

import java.util.*;
class Basic_8{
public static void main(String[]args){

Scanner scn    = new
Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}