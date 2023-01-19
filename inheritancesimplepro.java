class one1{
int a;
}
class two extends one1
{
void set()
{
  a=12;

  }
  void dis()
  {
  System.out.println(a);
  }
}
  class inheritancesimplepro{
  public static void main(String[]args){

 two ob = new two();
  ob.set();
  ob.dis();
  }
 }