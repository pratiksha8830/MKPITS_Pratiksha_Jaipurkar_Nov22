//write a program to read two integer and check they are multipled or not.//

import java.util.*;

class multipled{
public static void main(String[]args)
{

Scanner Sc=new Scanner (System.in);
System.out.println("Enter 1st integer number");
int num1=Sc.nextInt();

System.out.println("Enter 2nd integer number");
int num2=Sc.nextInt();

if(num1%num2==0)
{

     System.out.println("multipled");
     }
     else{
            System.out.println("Not multipled");
            }
       }
    }   