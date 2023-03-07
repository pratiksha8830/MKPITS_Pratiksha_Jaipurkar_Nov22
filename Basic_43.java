//*write a program to search an element in the existing array*//

class Basic_43{

public static void main(String[]args)
{
int ar[] ={22,11,23,11,15,19};
int inX=search(ar,15);
display(ar);
if(inX>=0)
System.out.println("your element found at index "+inX);
else

System.out.println("not valid");
}
static void display(int a[])

{
for (int i=0;i<a.length;i++)

System.out.println(i+"------>"+a[i]);
}
static int search (int a[],int ele)
{
for(int i=0;i<a.length;i++)
{
if(ele==a[i])
return i;
}
return -1;
}
}