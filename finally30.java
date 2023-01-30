class finally30
{
public static void main(String[]args){
System.out.println("start program");
int a=2;
int c=0;
try
{
c=a/0;
}
catch(ArithmeticException e)
{
System.out.println("Exception generated");
}
finally
{
System.out.println("finally block executes");
}
System.out.println("End program" +c);
}
}
