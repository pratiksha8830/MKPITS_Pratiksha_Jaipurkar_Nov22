//* write a java program to calculate the root of a quadratic equation *//

import java.util.Scanner;
class assig14_feb1
{
public static void main (String []args){
Scanner scanner = new
Scanner(System.in);

System.out.print("Enter the value of coefficient a: ");
double a = scanner.nextDouble();

System.out.print("Enter the value of coefficient b: ");
double b = scanner.nextDouble();

System.out.print("Enter the value of coefficient c: ");
double c = scanner.nextDouble();

double discriminant = b * b - 4 * a * c ;

if (discriminant > 0){
double root1 = (-b + Math.sqrt(discriminant)) /(2 * a);
double root2 = (-b - Math.sqrt(discriminant)) /(2 * a);
System.out.println("The roots of the quadratic equation are " + root1 + " and " + root2);
}
else if (discriminant == 0) {
double root = -b /(2 * a );
System.out.println("The quadratic equation has no real roots.");
}
scanner.close();
}
}