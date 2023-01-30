
class Assig4_25
{
public static void main(String[]args)
{
int  a[]={ 14, 16, 32,23 };
int temp;
temp=a[0];
a[0]=a[5];
a[5]=temp;

for(int i=0;i<a.length;i++)
{
System.out.println(" "+a[i]);
}
}
}
