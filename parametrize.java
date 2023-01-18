
class constructure
{
int a;
constructure(int x)
{
	a=x;
}
void dis()
{

System.out.println("a="+a);
}
}

class parametrize{
public static void main(String []args){
constructure ob1=new constructure(2);
constructure ob2=new constructure(6);
ob1.dis();
ob2.dis();
}
}
