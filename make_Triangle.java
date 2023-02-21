//write a java program to accept three floting values and check if it is possible to make triangle with them.

//also calculate the perimeter of triangle if the set value are valid.

import java.util.*;

class make_Triangle{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);

System.out.println("Enter 1st integer number");
float a=Sc.nextFloat();

System.out.println("Enter 2nd integer number");
float b=Sc.nextFloat();

System.out.println("Enter 3rd integer number");
float c=Sc.nextFloat();

if ((a+b+c)==180){

    System.out.println("Valid to make triangle");

     float perimeter=a+b+c;

     System.out.println("perimeter of triangle:"+perimeter);
     }
     }
     }