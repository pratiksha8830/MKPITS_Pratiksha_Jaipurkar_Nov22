//* write a java program to check whether two given integer values are in the range 20..50 inclusive. Return true if  1 or other is in the said range otherwise false*//

import java.util.Scanner;
class assig13_jan19{

public static void main(String[]args){

Scanner scanner= new 
Scanner(System.in);

System.out.print("enter the first integer:");
int num1=scanner.nextInt();

System.out.print("enter the second integer:");
int num2=scanner.nextInt();

//Check if either of the integers is in the range 20..50 inclusive

if((num1 >=20 && num1 <= 50) || (num2 >= 20 && num2 <= 50)) {


System.out.println("True");
}else{
System.out.println("False");
}
}
}