//*write a java program to remove  any negative sign in front of a number Input a value (negative)*//

import java.util.Scanner;
class assig14_jan18{
public static void main(String[]args){
Scanner scanner = new
Scanner(System.in);

System.out.print("Enter a number(negative):");
String input = scanner.nextLine();
if(input.charAt(0)=='-'){
	String output = input.substring(1);
    System.out.printf("Number without negative sign: %s\n",output);
}else {
System.out.println("Input is not negative.");
}

scanner.close();
}
}
