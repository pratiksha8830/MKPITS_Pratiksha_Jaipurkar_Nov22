import java.util.Scanner;

class assig19_feb1
{

public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);

System.out.println("Enter any caracter : ");
char c = scanner.next().charAt(0);

if((c >= 'a' && c <= 'z') ||  (c >= 'A' && c <= 'z')) {

System.out.println(c +" is A ALPHABET.");

}else{

System.out.println(c +" is NOT A ALPHABET.");

}
}
}