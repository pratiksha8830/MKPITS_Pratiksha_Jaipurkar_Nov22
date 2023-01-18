class adddemo
{
//int a;
static int b;
void set()
{
b++;
}
void dis()
{
System.out.println(b);
}
}
  class Staticvarieable
 {
 public static void main (String []args){
 adddemo ob1 = new adddemo();
 adddemo ob2 = new adddemo();
 adddemo ob3 = new adddemo();


 ob1.dis ();
 ob2.dis ();
 ob3.dis ();


 adddemo.b=12;

 ob1.dis();
 ob2.dis();
 ob3.dis();

 }
 }