//*write a java program to check if one given tempatures is less than 0 and the other is greater than 100*//

import java.util.Scanner;

class  assig10_jan19{

public static void main(String[]args){

Scanner scanner = new
Scanner (System.in);

System.out.print("Enter the first temperature:");
int temp1 = scanner.nextInt();

System.out.print("Enter the second temperature:");
int temp2 = scanner.nextInt();

//Check if one temperature is less than 0 and the other is greater than  100

if ((temp1 < 0  &&  temp2 > 100) || (temp1 > 100 && temp2 < 0)) {

System.out.println("True");

} else {

System.out.println("False");
}
}
}