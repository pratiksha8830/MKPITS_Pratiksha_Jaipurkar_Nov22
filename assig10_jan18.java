

//*write a java program to print the powers of 2 table for the power 0 to 10,both positive and negative*//

import java.util.Scanner;
class assig10_jan18{
public static void main(String[]args){

//print positive powers of 2

for(int i=0; i<=10; i++){
int powerOfTwo =(int)Math.pow(2,i);
System.out.println("2^" + i + " = " + powerOfTwo);
}
//print negative powers of 2
for (int i=-1; i>=-10; i--){
	double powerOfTwo = Math.pow(2,i);

	System.out.println("2^"+i+"="+ powerOfTwo);

}
}
}