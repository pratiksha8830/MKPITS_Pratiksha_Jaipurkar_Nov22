import java.util.Scanner;
class assignment6
{
int n,sub;
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enterthe value of n");
n=sc.nextInt();}
void fun()
{
sub=n-51;
if(n>51)
{
sub=sub*3;
System.out.println(sub);
}
else{
System.out.println(sub);
}
}
}

class assig6_jan19
{
public static void main(String[]args)
{
assignment6 ob=new assignment6();
ob.set();
ob.fun();
}
}