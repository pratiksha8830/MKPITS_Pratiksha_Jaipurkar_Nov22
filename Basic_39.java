//*write a program for binary search*//
    class Basic_39{

public static int binarySearch(int[]arr,int X)
{
int first=0;
int last=arr.length-1;
while(first<=1)
{
int middle=(first+last)/2;
if(X==arr[middle])
{
return middle;
}
else if(X>arr[middle])
{
first=middle+1;
}
else
{
last=middle-1;
}
}return-1;
}
public static void main(String[]args)
{
int[]i={10,49,67,90,40,86};
System.out.println(binarySearch(i,49));
}
}