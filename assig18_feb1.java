//* write a java program  to check whether a triangle can be formed by the given value for the angles*//


import java.util.Scanner;
class assig18_feb1
{
public static void main(String args[])
{
Scanner input = new
Scanner(System.in);

System.out.println("Enter first angle in degrees: ");
double angle1 = input.nextDouble();
System.out.println("Enter the second angle in degrees:");
double angle2 = input.nextDouble();

System.out.println("Enter the third angle in degrees: ");
double angle3 = input.nextDouble();

 double sum = angle1 + angle2 + angle3;
 if (sum ==180)
 {
   System.out.println("A triangle can be formed with the given angles.");
   }else{
      System.out.println("A triangle cannot be formed with the given angles.");
      }
       input.close();
       }
       }
