 class  typecasting{
public static void main(String []args){
//byte->short->int->long->float->double
byte a=5;
short s=a;//implict bhyte to short
long l1=10;
a=(byte)l1;//explict long to byte
System.out.println("the result is "+s);
System.out.println("the result is "+a);
}
}
