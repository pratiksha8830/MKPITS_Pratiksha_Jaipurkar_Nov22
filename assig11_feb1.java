//* write a java program to accept the height of a person in centimeter and categorize the person according to their height*//

import java.util.Scanner;
class assig11_feb1
{

public static void main(String []args)
{

Scanner scanner = new
Scanner(System.in);

System.out.println("Enter the height of the person in centimeters :");
float height_cm = scanner.nextFloat();

if(height_cm < 150){
System.out.println("Enter the height of the short stature.");
}
else if (height_cm >= 150 &&  height_cm < 165){
System.out.println("The person is of average height.");
}
else if (height_cm >= 165 && height_cm <180){
  System.out.println("The person is tall.");
  }
  else{
   System.out.println("The person is very tall.");
   }
   }
   }
