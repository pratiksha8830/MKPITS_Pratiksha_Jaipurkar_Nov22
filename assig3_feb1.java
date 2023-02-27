
//* write a java program that takes four numbers as input to calculate and print  the average*//
import java.util.Scanner;
class assig3_feb1
{

public static void main(String[]args){
Scanner  input = new
Scanner(System.in);

System.out.print("Enter  first number:");
Double Num1 =input.nextDouble();

System.out.println("Enter second number:");
Double Num2 =input.nextDouble();

System.out.println("Enter third number:");
Double Num3 =input.nextDouble();

System.out.println("Enter fourth number:");
Double Num4 =input.nextDouble();


Double average =(Num1 + Num2 + Num3 + Num4)/4;

System.out.println("The average of the four numbers  is: " +average);
}
}


