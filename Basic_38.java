//*write a progam for linear search*//

class Basic_38{

public static int linearSearch(int[]arr,int x)
{
for(int i=0;i<arr.length;i++)
{
if(x==arr[i])
{
return i;
}
}
return -1;
}
public static void main(String[]args){
int[]ar={3,46,76,4,89,7,27};
System.out.println(linearSearch(ar,4));
System.out.println(linearSearch(ar,78));
}

}