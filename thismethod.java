class adddemo{
int a;

void set(int a)
{
this.a=a;
}
void dis()
{
System.out.println(a);
  }
}
class thismethod {
public static void main(String[]args){

adddemo ob1=new adddemo();
adddemo ob2=new adddemo();


ob1.set(3);
ob2.set(4);



ob1.dis();
ob2.dis();


}
}
