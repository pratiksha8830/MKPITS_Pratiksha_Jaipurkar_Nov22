//* write a java program     *//

import java.util.Scanner;
class assig11_jan18{
public static void main(String[]args){

int n = 10;
int [][] table = new int [n+1][n+1];

//Calculate binomial coefficients and store in table
for (int i=0; i< n; i++){
for (int j = 0; j < i;j++){
if (j == 0 || j == i){
table[i][j] = 1;
}
else {
table[i][j] = table [i-1][j-1]+table[i-1][j];
}
}
}


//print the table
for (int i=0; i<n; i++){
for (int j=0;j<=i;j++){
System.out.printf("%4d",table[i][j]);
}
System.out.println();
}
}
}
