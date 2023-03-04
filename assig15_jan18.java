//* write a java programing that reads in two integer and check whether the first integer is a multiple of the second integer*//

import java.util.Scanner;
class assig15_jan18{
public static void main(String[]args){

Scanner scanner = new
Scanner(System.in);

System.out.print("Enter the first integer:");
int num1 = scanner.nextInt();
 
 System.out.print("Enter the second integer:");
 int num2 = scanner.nextInt();
 
 if(num1 %num2 ==0){
 System.out.printf("%d is a multiple of %d.\n",num1,num2);
 }else{
 System.out.printf("%d is not a multiple of %d.\n",num1,num2);
 }
 
 scanner.close();
 }
 }
 
 
 