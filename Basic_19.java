//*write a program to display the filled box with stars*//



class Basic_19{

public static void main(String[]args){

java.util.Scanner sc=new 
java.util.Scanner(System.in);
System.out.println("enter value of n");
int n=sc.nextInt();
for(int i=1;i<n;i++)
{
for (int j=0;j<n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}

