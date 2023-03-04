//* write a java programing  to display the integer equivalents to letters (a-z,A-Z)*//


import java.util.Scanner;
class assig16_jan18{
public static void main(String[]args){

//Lowercase letters

for(char c= 'a';c<='z';c++) {
System.out.printf("%c:%d\n",c,(int)
c);
}

//Uppercase letters
for(char c= 'A';c<='Z';c++){
System.out.printf("%c: %d\n",c,(int)
c);
}
}
}