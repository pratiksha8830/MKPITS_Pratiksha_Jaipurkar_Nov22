//*

import java.util.Scanner;
class assig4_feb1{
public static void main(String[] args)
{
Scanner input = new
Scanner(System.in);

System.out.print("Enter  the value of x:");
int x = input.nextInt();

System.out.println("Enter the value of y:");
int y = input.nextInt();

System.out.println("Enter the value of z:");
int z = input.nextInt();

int result1 = (x+y)*z;
System.out.println("(x+y)*z="+result1);

int result2=(x*y)+(y*z);
System.out.println("x*y+y*z="+result2);

}
}