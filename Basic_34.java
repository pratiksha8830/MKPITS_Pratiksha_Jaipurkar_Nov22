//*write a program reverse the sentence*//

import java.util.Scanner;
class Basic_34{

public static void main(String[]args){

Scanner sc=new
Scanner(System.in);
System.out.println("Enter the sentence");
String st=sc.nextLine();
char ch[]=st.toCharArray();
String rst=" ";
for (int i=ch.length-1;i>=0;i--)
{
int k=i;
while(i>=0&&ch[i]!=' ')
{
i--;
}
int j=i+1;
while(j<=k)
{
rst=rst+ch[j];
j++;
}
rst=rst+' ';
}
System.out.println("The reverse sentence is:"+rst);
}
}