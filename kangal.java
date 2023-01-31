class kangalException extends Exception
{
kangalException(String s)
{
super(s);
}
}

public class kangal
{
public static void main(String[]args) throws Exception
{

int bal = 3000;
int width = 5000;

if (bal>width)
{

System.out.println("rupay le lo");
}

else
{

kangalException ob=new kangalException("paisa nahi hai");
throw ob;
}
}
}