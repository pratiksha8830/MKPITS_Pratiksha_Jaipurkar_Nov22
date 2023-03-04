//* write a java program that swaps two numbers without using third varieable*//

import java.util.Scanner;
class assig1_18jan
{
public static void main(String[]args)
{
int a=5 ;
int b=10 ;
System.out.println("Before swapping: a ="+ a +",b = "+ b);
//swapping without using a third varieable
a=a+b;
b=a-b;
a=a-b;
 System.out.println("After swapping: a ="+ a +",b = "+ b);

}
}
