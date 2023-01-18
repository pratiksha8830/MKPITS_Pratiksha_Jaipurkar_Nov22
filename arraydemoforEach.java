class one{
void fun(){
int a[]={1,2,3,4};
int []a1;
for(int i=0;i<=3;i++)
{
System.out.println(a[i]);
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

for (int v:a){
    System.out.println("for each:="+v);
    }
    
    a1=a;
    for(int v1:a1){
    System.out.println("for each a1 :="+v1);
    }
    }
    }public class arraydemoforEach{
    public static void main(String[]args){
    one ob = new one();
    ob.fun();
    }
    }
    