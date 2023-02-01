class ThreadisAlive{
public static void main(String[]args){
Th1 ob1 = new Th1();
//ob1.setName("ram");

Th1 ob2 = new Th1();
//ob2.setName("shyam");

Th1 ob3 = new  Th1();
 
 ob1.start();
 ob2.start();
 ob3.start();
 
 System.out.println("wating to die for " +ob2.getName()+" "+ob2.isAlive());
 try{
 
 ob2.join();
 Thread.sleep(1000);
 }catch(Exception e){}
 System.out.println("is dead " +ob2.getName()+" "+ob2.isAlive());
 
 }
} 
 