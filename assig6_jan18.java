
//* write a java program  that accepts integers from the user until a zero or a negative number,display the number of positive values, the minimum value the maximum value and the  average of all numbers*//
import java.util.Scanner;

class assig6_jan18{

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int positiveCount = 0;
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

int sum= 0;
int count = 0;

//Accept input from keyboard
System.out.println("Enter integers(enter a negaive number or zero to stop):");

int number = scanner.nextInt();
while (number > 0){

//Update statistics
positiveCount++;
if (number < min) {
min = number;
}
if (number > max) {
max = number;

}
sum += number;
count++;


//Accept next input from keyboard
number = scanner.nextInt ();
}

//Print statistics
double average = (double) sum/count;
System.out.println("Number of positive values: " + positiveCount);

System.out.println("Minimum value: " + min);
System.out.println("Maximum value: "+ max);
System.out.println("Average of all numbers: " + average);
}
}

