//*write a program to display Diamond with stars*//

class Basic_27{

public static void main(String[]args){

java.util.Scanner scn=new
java.util.Scanner(System.in);
System.out.println("enter odd number");
int n=scn.nextInt();
int spaces=n/2;
int stars=1;
for (int i=1;i<n;i++)
{
for (int j=1;j<=spaces;j++)
{
System.out.print(" ");
}

for (int k=1;k<=stars;k++)

{
System.out.print("*");
}
System.out.println();
if(i<=n/2)
{

spaces--;
stars+=2;

}
else
{
spaces++;
stars-=2;
}

}
}
}