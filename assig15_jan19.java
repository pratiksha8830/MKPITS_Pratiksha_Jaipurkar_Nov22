
//* write a java program  to check whether two given  integer are in the range 40..50 inclusive, or they are both in  the range 50..60 inclusive*//

import java.util.Scanner;
class assig15_jan19{
public static void main(String[]args){

Scanner scanner= new Scanner(System.in);

System.out.print("enter the first integer:");
int num1 = scanner.nextInt();

System.out.print("enter the second integer:");
int num2 = scanner.nextInt();

boolean rangeCheck = (num1 >= 40 && num1 <= 50 && num2 >= 40 && num2 <= 50) || (num1 >= 50 && num1 <= 60 && num2 >= 50 && num2 <=60);

if(rangeCheck) {

System.out.println("Both integers are in the specified ranges.");

} else {

System.out.println("Integers are not in the specified ranges.");
}
}
}