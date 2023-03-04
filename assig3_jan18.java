//*write a java program  to reverse and print a given number*//

import java.util.Scanner;
class assig3_jan18{

public static void main(String[]args){

int number = 12345;
int reversedNumber = 0;

while (number !=0) {
  int digit = number %10;
  reversedNumber = reversedNumber *10 + digit;
  number /=10;
  }

  System.out.println("Original number: "+ number);
  System.out.println("Reversed number: "+ reversedNumber);

  }
  }