//*write a program to find the palindrome numbers in  the given array*//

class Basic_55{

static void display(int a[])
{
for (int i=0;i<a.length;i++)

{
System.out.print(a[i]+",");
}
System.out.println();
}
static int revdig(int n)
{
int rev =0;
while(n>0)
{
int r=n%10;
rev=rev*10+r;
n=n/10;
}
return rev;
}
public static void main(String[]args){
int ar[]={232,12,78,898,34543,45};

display(ar);
int count=0;
for(int i=0;i<ar .length;i++)

{

if(ar[i]==revdig(ar[i]))    count++;
}
System.out.println("-------------------");
System.out.println("number of palindrome:"+count);
}
}
