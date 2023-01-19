class one1{
int a;

void set1()
{
  a=12;

  }
  void dis1()
  {
  System.out.println(a);
  }
}
  class two extends one1{
	  int b;
	  void set2()
	  {
		  b=13;
	  }
	  void dis2()
	  {
		  System.out.println(a);
	  }
  }
    class three extends two{
		int c;
		void set3()
		{
			c=14;
		}
		void dis3()
		{
			System.out.println(c);
		}
	}
	class multilevelpro{
		public static void main(String[]args){
			three ob= new three();
			ob.set1();
			ob.set2();
			ob.set3();
			ob.dis1();
			ob.dis2();
			ob.dis3();
		}
	}


