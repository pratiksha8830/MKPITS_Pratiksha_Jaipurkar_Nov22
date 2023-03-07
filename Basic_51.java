//* write a program to exchange of first part element to second  part element between two array*//

class Basic_51{

public  static void main(String[]args){

int ar[]={21,12,15,32,16,17,22};
System.out.println("Before exchange of aarray");
for (int i=0;i<ar.length;i++)
{
System.out.println(ar[i]);
}
int n;
if(ar.length%2==0)
n=ar.length/2;
else

n=(ar.length/2)+1;
for(int i=0;i<ar.length/2;i++)
{

int t=ar[i];
ar[i]=ar[n+i];
ar[n+i]=t;

}
System.out.println("After exchange of array");
for(int i=0;i<ar.length;i++)
{

System.out.println(ar[i]);
}
}
}