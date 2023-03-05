//*write a program to display prime numbers from  1 to n*//

class Basic_2{
 public static void main(String[]args){
 java.util.Scanner sc= new java.util.Scanner(System.in);
 System.out.println("Enter number");
 int n=sc.nextInt();
 System.out.println("Prime numbers between 1 and"+n);

 //loop through the numbers one by one
 for(int i=1;i<n;i++)
 {
 boolean isPrime=true;
 //check to see if the number is prime
 for (int j=2;j<i;j++)
 {
 if(i%j==0)
 {
 isPrime = false;
 break;
 }

 }

 //print the number
 if(isPrime)
 System.out.print(i+"");
 }
 }
 }
