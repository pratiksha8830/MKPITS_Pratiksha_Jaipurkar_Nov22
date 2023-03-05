//*write  aprogram to find the factorial of a given range of  number*//

import java.util.*;
class Basic_9{


static int fact(int n)
{
int fact=1;
while(n>0)
{
  fact=fact*n;
  n--;
  }
  return fact;
  }
  public static void main(String[]args)
  {
  Scanner scn= new
  Scanner(System.in);
  System.out.println("Enter the factorial range number");
  int k=scn.nextInt();
  for(int i=1;i<=k;i++)
  {
  System.out.println(i+"!---->"+fact(i));
  }
  }
  }