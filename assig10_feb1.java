
//* write a java program to read the value of an integer m and display the  value of n is 1 when m is larger than 0,0 when m is 0 and -1 when m is less than 0*//
import java.util.Scanner;

class assig10_feb1
{
public static void main(String[] args)
{
Scanner scanner = new
Scanner (System.in);

System.out.print("Enter an integer value for m:");
int m = scanner.nextInt();

int n;
if ( m > 0 )
{
n=1;
}
else if ( m == 0){
n = 0;
}else{
n= -1;
}

System.out.println("The value of n is " + n);
}
}
