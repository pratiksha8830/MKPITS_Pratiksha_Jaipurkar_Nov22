//* write a java program to read age of a candidate and determine whether it is eligible for casting his/her own vote*//



import java.util.Scanner;
class assig9_feb1
{

public static void main(String[]args){
Scanner input = new
Scanner(System.in);

System.out.println("Enter your age:");
int age = input.nextInt();

if (age>=18){
System.out.println("you are eligible to cast your vote,");
}
else{
System.out.println("you are not eligible to cast your vote,");
}
}
}

