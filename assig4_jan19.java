//*write a java program to reads in five digit integer and determines whether or not it's a palindrome*//

import java.util.Scanner;

class assig4_jan19{

public static void main(String[]args){

Scanner scanner = new
Scanner(System.in);

System.out.print("Enter the first number: ");
int num1 = scanner.nextInt();

System.out.print("Enter the second number:");
int num2 = scanner.nextInt();

System.out.print("Enter the third number:");
int num3 = scanner.nextInt();

int result = num1 *num2 *num3;

System.out.println("The product of " +num1 + " , " +  num2 + " and " + num3 + " is " + result );
}
}