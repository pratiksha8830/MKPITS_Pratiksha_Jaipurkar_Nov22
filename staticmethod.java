class adddemo{
int a;
static int b;
static void set()
{
b++;
//a=2;//
}
void dis()
{
System.out.println(b);
  }
}
class staticmethod{
public static void main(String[]args){

adddemo ob1=new adddemo();
adddemo ob2=new adddemo();
adddemo ob3=new adddemo();

ob1.dis();
ob2.dis();
ob3.dis();

adddemo.set();
ob1.set();

ob1.dis();
ob2.dis();
ob3.dis();

}
}
