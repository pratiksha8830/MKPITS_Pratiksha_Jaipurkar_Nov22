//* write a java program  to read roll no, name and marks of three subjects and calculate the total ,percentage and division*//

import java.util.Scanner;
class assig15_feb1
{
public static void main(String[]args)
{
Scanner  scanner = new
Scanner(System.in);


 System.out.print("Enter the roll number: ");
 int rollno = scanner.nextInt();

 System.out.print("Enter the name: ");
 String name = scanner.next();

 System.out.print(" Enter the  marks of subject 1: ");
 int marks1 = scanner.nextInt();

 System.out.print("Enter the marks of subject 2: ");
 int marks2 = scanner.nextInt();

 System.out.print("Enter the marks of subject 3: ");
 int marks3 = scanner.nextInt();

 int total = marks1 + marks2 + marks3;
 double percentage = (double) total /3;

 System.out.println("Roll no: " + rollno);
 System.out.println("Name: " + name);
 System.out.println("Marks in subject 1: " + marks1);
 System.out.println("Marks in subject 2: " + marks2);
 System.out.println("Marks in subject 3: " + marks3);
 System.out.println("Total marks: " + total);
 System.out.println("percentage: " + percentage);

 if (percentage >=60) {
 System.out.println("Division: First" );
 }
 else if (percentage >= 50){
 System.out.println("Division: Second");
 }
 else if (percentage >= 40) {
 System.out.println("Division: Third");
 }
 else {
 System.out.println("Division: fail");
 }
 scanner.close();
 }
 }


