import java.util.Scanner;
class assig8_25
{
public static void main(String[]args)
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter your no");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter "+n+"element");
for(int i=0; i<arr.length; i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("enter array value");
for (int i=0; i<arr.length; i++)
{
	if(arr[i]%2==0)
	{
		System.out.println("even no=" +arr[i]);
		count++;
	}
}
System.out.println("count="+count);



}
}