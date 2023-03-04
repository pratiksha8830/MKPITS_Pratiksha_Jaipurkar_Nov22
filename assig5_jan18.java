//* write a java program  that accepts a positive  integer less than 500 and prints out the sum of the digits of this number*//

import java.util.Scanner;

class assig5_jan18{
public static void main(String[]args){

Scanner scanner = new
Scanner(System.in);

//Accept input from keyboard
System.out.println("Enter a positive integer less than 500:");
 int number = scanner.nextInt();
 
 //Calculate sum of digits
 int sum = 0;
 while (number !=0){
 int digit = number % 10;
 sum += digit;
 number /=10;
 
 }
 
 //print sum of digits
 System.out.println("sum of digits:" +sum);
 }
 }
 