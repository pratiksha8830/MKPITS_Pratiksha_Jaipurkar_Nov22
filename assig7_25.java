import java.util.Scanner;
class assig7_25
{
public static void main(String[]args)
{
int a[]={4,6,9};
if(a[0]>a[1] && a[0]>a[2])
{

	System.out.println("the largest array is" +a[0]);
}
if(a[1]>a[0] && a[1]>a[2])
{
	System.out.println("the largest array is " +a[1]);
	if(a[2]>a[0] && a[2]>a[1])
	{
		System.out.println("the largest array is" +a[2]);
	}
}
}
}