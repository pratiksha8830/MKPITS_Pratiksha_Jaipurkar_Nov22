//* write a java program to check if  a triple is presents in an array of integers or not if a value appears three times in a row in an array it  is called a triple*//


class assig20_jan19{

public static void main(String[]args){

int[] arr1 = {1,2,3,4,5};
int[] arr2 = {1,2,2,2,3,4};
int[] arr3 = {1,1,1,2,2,2,3};

if(checkTriple(arr1)) {

System.out.println("A triple is present in the first array.");

} else {

System.out.println("A triple is not present in the first array.");

}
if (checkTriple (arr2)) {

System.out.println("A triple is present in  the  second array.");

}  else {

System.out.println("A triple is not present in the second array.");
}

if(checkTriple(arr3)) {
System.out.println("A triple is present in the third array.");

} else {

System.out.println("A triple is not present in the third array.");
}
}

public static boolean checkTriple(int[] arr) {
for (int i= 0; i< arr.length -2; i++) {
if (arr[i] == arr[i+1] && arr[i+1] == arr[i+2]) {

return true;
}
}
return false;
}
}