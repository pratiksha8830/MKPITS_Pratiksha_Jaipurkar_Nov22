//*write a java program to print the output of multiplication of three numbers which will be entered by the user*//

import java.util.Scanner;

class assig3_jan19{

public static void main(String[]args){

Scanner scanner =new
Scanner(System.in);

System.out.println("Enter the first number:");
int num1 = scanner.nextInt();

System.out.println("Enter the second number:");
int num2 = scanner.nextInt();

System.out.println("Enter the third number:");
int num3 =scanner.nextInt();

int result = num1*num2*num3;

System.out.println("The product of "+ num1 + " ," + num2 + " and " + num3 + " is " + result);
}
}