//* write a java program  to evaluate the equation y=xn when n is a non-negative integer*//

import java.util.Scanner;

class assig9_jan18{
public static void main(String[]args){
	Scanner scanner= new
    Scanner(System.in);

System.out.print("Enter x:");
double x = scanner.nextDouble();

System.out.print("Enter n:");
int n = scanner.nextInt();

double result = power(x,n);
System.out.println(x +" raiesd to the power of "+ n +" is "+ result);
}

 public static  double power(double x,int n)
 {
  if(n==0){
  return 1;
  }
 else if (n%2==0){
 double y = power(x,n/2);
 return y*y;
 }else{
 double y = power(x,(n-1)/2);
 return x*y*y;
 }
 }
 }