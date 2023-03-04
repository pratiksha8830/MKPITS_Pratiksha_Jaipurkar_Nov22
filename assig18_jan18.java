//* write a java programming to calculate and prints the squares and cubes of the numbers from 0 to 20 and uses tabs to display tham in a table of values*//

import java.util.Scanner;

class assig18_jan18{
public static void main(String[]args){

System.out.print("Number\tSquare \tCube");
for(int i= 0;i<=20;i++){
int square = i*i;
int cube = i*i*i;
System.out.printf("%d\t%d\t%d\n",i,square,cube);
}
}
}