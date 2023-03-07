//*write a program to combine two arrays in zigzag manner*//

class Basic_54{

public static void main(String[]args){

int ar1[]={12,13,23,15,11,16};
int ar2[]={53,26,23,15,18,13,23,45};

int res[]=new int [ar1.length+ar2.length];
int i=0, j=0;

for(int k=0;k<res.length;
)
{
if(i<ar1.length)
{
res[k]=ar1[i];
i++;
k++;
}
if(j<ar2.length)
{
res[k]=ar2[j];
j++;
k++;
}
}

System.out.println("Zigzag Array is");
for(int I=0;I<res.length;I++)
{
System.out.println(res[i]);
}
}
}