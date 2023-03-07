//*write a java program to check a given integer and return true if it is within 10  of 100 or 200*//

import java.util.Scanner;

class assig8_jan19{

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the integer:");
int num = scanner.nextInt();

//check if the integer is within 10 of 100 or 200

if ((Math.abs(100 -num) <= 10) || (Math.abs(200- num) <=10)) {
System.out.println("True");
} else {
System.out.println("False");
}
}
}