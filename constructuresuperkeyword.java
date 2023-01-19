class one1{
one1(int x, int y)
{
System.out.println(x+" "+y);
}

}

class two extends one1{
two()
{
super(1,2);// 2nd use of super()
  }
}

  class constructuresuperkeyword{
public  static void main (String []args){
two ob=new two();
  }
}
