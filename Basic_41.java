//* write  a program to insert the elements in an array*//

import java.util.Scanner;

class Basic_41{

public static void main(String[]args){

Scanner sc= new
Scanner(System.in);

System.out.println("enter the size ");

int length =sc.nextInt();

int arr[]=new int [length];
System.out.println("enter the  "+length+" elements");
for (int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
System.out.println("arr["+i+"]---->"+arr[i]);
}
}
}