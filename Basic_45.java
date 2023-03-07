//*write a program to find the second occurrence element in a given array*//


class Basic_45{

public static void main(String[]args){

int ar[]={22,11,23,11,15,19,11};
int inX=secondoccurance(ar,11);
display(ar);
if(inX>=0)


System.out.println("Second time occurred element found at the index "+inX);

else
System.out.println("not valid");
}

static void display(int a[])
{

for(int i=0;i<a.length;i++)
System.out.println("arr["+i+"]"+"------>"+a[i]);
}

static int secondoccurance (int a[],int ele)
{

int count=0;
for(int i=0;i<a.length;i++)
{

if(ele==a[i])

count++;
if(count==2)
return i;
}
return-1;
}
}