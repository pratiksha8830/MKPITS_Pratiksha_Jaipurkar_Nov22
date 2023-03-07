//* write a program to find the occurrence element in which position in a given array*//

class Basic_46{

public static void main(String[]args){

int ar[]={22,11,23,11,15,19,11};
int inX=occurrence(ar,11,2);
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

static int occurrence(int a[],int ele,int oc)
{
int count=0;
for(int i=0;i<a.length;i++)
{

if(ele==a[i])
count++;
if(count==oc)
return i;

}
return -1;
}
}