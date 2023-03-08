//*write a java program to check if two given non-negative integers have the the same last digit*//

 class assig17_jan19{

 public static void main(String[]args){

 int num1 = 123;
 int num2 = 456;

 if (hasSameLastDigit  (num1,num2)) {
 System.out.println("The two numbers have the same last digit.");

 } else {
 System.out.println("The two numbers do not have the same last digit.");
 }
 }
 public static   boolean  hasSameLastDigit(int num1,int num2){


     int lastDigit1 = num1 % 10;
     int lastDigit2 = num2% 10;

     return lastDigit1 == lastDigit2;
     }
     }