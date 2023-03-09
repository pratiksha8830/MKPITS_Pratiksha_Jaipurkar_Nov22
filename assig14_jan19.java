//*write a java program to check which number nearest to the value 100 among two given integers Return 0 if the two numbers are equal*//

import java.util.Scanner;

class assig14_jan19{

public static void main(String[]args){
Scanner scanner=new
Scanner(System.in);


System.out.print("enter the  first integer:");
int num1 =scanner.nextInt();

System.out.print("enter the second integer:");
int num2 = scanner.nextInt();


//find the difference between the numbers and 100

int diff1 = Math.abs(num1-100);
int diff2 = Math.abs(num2-100);

//Check which number is nearest to 100
	if (diff1 < diff2) {
System.out.println(num1+ "is nearest to 100");

} else if(diff2 > diff1) {
System.out.println(num2  + " is nearest to 100");

} else {
System.out.println("0");
}
}
}