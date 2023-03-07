//*write a program to find first Biggest and second biggest element in given array*//

class Basic_44{

public static void main(String[]args){

int ar[]={23,12,14,56,22,28,13};
int fbig=ar[0];
int sbig=ar[1];
for(int i=1;i<ar.length;i++)
{
if(fbig<ar[i])
{
sbig=fbig;
fbig=ar[i];
}
else if(sbig<ar[i])
{
  sbig=ar[i];
  }
  }
  System.out.println("first biggest element is "+fbig);
  System.out.println("second biggest element is "+sbig);
  }
  }