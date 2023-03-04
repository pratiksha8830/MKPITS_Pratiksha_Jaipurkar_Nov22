//*write a java programming that accepts one seven-digit number and separates the number into its individual digits, and prints the digits separated from one another by two spaces each*//

import java.util.Scanner;
class assig17_jan18{

public static void main(String[]args){

Scanner scanner = new
Scanner(System.in);

System.out.print("Enter a seven-digit number:");
int num = scanner.nextInt();


int digit7 = num % 10;
int digit6 = num / 10 % 10;
int digit5 = num / 100 % 10;
int digit4 = num / 1000 % 10;
int digit3 = num / 10000 % 10;
int digit2 = num / 100000 % 10;
int digit1 = num / 1000000;


//print digits separated by two spaces

System.out.printf("%d %d %d %d %d %d %d\n",digit1,digit2,digit3,digit4,digit5,digit6,digit7);
scanner.close();
}
}