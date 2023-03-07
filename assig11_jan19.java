//* write  a java program to check two given integer whether either of them is in the range 100..200inclusive*//



import java.util.Scanner;

class assig11_jan19{

public static void main(String[]args){

Scanner scanner= new
Scanner (System.in);

System.out.println("Enter the first integer:");
 int num1 =scanner.nextInt();

 System.out.println("Enter the second integer:");
 int num2 = scanner.nextInt();


 //check if either integer is in range 100..200 inclusive



 if((num1  >= 100 && num1 <= 200) ||(num2 >= 100 && num2 <= 200)){
 System.out.println("True");

 }else{

 System.out.println("False");
 }
 }
 }