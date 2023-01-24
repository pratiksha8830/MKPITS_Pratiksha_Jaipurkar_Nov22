import java.lang.String;
public class ConcateDemo
{
public static void main(String[] args)
{

String ob1="Ram";
String ob2=new String();

ob2=ob1;
System.out.println(ob2);

//using concate
String ob3="Sita";
System.out.println(ob1.concat(ob3));

//using equal
System.out.println(ob1.compareTo("rutuja"));
}
}

