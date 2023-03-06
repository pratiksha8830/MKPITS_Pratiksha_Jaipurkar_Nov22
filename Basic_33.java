//*write a program  for number of characters in each word and count them*//

import java.util.Scanner;
class Basic_33{

public static void main(String[]args){

Scanner sc= new
Scanner(System.in);
System.out.println("Enter the string");
String s=sc.nextLine();
String nst=" ";
int nc=0;
for (int i=0;i<s.length();i++)
{

if(s.charAt(i)==' ')
{
nst=nst+nc;
nc=0;
}
else
{
nc++;
nst=nst+s.charAt(i);
}
}
nst=nst+nc;
System.out.println("no of character in each word in a string is "+nst);
}
}