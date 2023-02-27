


import java.util.Scanner;
class assig7_feb1
{
public static void main(String[]args)
{
Scanner input = new
Scanner(System.in);

System.out.print("Enter temperature in Celsius:");

double celsius = input.nextDouble();
double kelvin = celsius + 273.15;
System.out.println("Tempature in Kelvin;"+ kelvin);


 double fahrenheit=(celsius*1.8)+32;

 System.out.println("Temperature in Fahrenheit;" +fahrenheit);
 }
 }