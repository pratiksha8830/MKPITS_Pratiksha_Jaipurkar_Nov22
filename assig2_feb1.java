import java.util.Scanner;
class assig2_feb1
{
public static void main (String[]args)
{
Scanner input = new
Scanner(System.in);

System.out.println("Enter a number:");

int number = input.nextInt();

System.out.println("Multiplication table of" +number +":");

for(int i=1;i<= 10;i++){
System.out.println(number +"X"+i +"="+(number*i));
}

input.close();
}
}