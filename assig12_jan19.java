//*  write ajav program to check whether three given integer values are in the range 20..50 inclusive Return true if 1 or more of them are in the said range otherwise return false*//




import java.util.Scanner;
class assig12_jan19{

public static void main(String[]args){

Scanner scanner= new Scanner(System.in);

System.out.print("enter the first integer:");
int num1 =scanner.nextInt();

System.out.print("enter the second integer:");
int num2 = scanner.nextInt();

System.out.print("enter the third integer:");
int num3 = scanner.nextInt();

//check if any integer is an the  range 20..50 inclusive

if((num1 >= 20 && num1 <= 50) || (num2 >= 20 && num2 <= 50) || (num3 >= 20 && num3 <= 50)) {
System.out.println("True");
} else {
System.out.println("False");
}
}
}