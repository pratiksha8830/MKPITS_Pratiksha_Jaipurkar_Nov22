//* write a java program  that  prints out the prime numbers between 1 and 200*//

import java.util.Scanner;

class assig7_jan18{
public static void main(String[]args){

int start = 2;
int end = 200;

System.out.println("Prime numbers between " + start + "and" + end +":");

for (int i=2; i<=200; i++){
boolean isPrime = true;

for(int j=2; j<i; j++){
if(i%j == 0){
isPrime = false;
break;
}
}
if(isPrime){
System.out.print(i + " ");
}
}
}
}