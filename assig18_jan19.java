//*




class assig18_jan19{

public static void main(String[]args){

int[] arr1 = {1,2,3,4,5};
int[] arr2 = {6,7,8,9 ,1,2,3,4,5};
int[] arr3 = {1,2,4,3 ,5};

if (checkSequence (arr1)) {
System.out.println("The sequence 1,2,3 appears in the first array.");
} else {

System.out.println("The sequence  1,2,3 does not  apper in the first array.");

}

if(checkSequence(arr2)) {
System.out.println("The sequence 1,2,3          appear in the second array.");

} else {

System.out.println("The sequence 1,2,3  does not appear in the second array.");
}
if(checkSequence(arr3)) {

System.out.println("The sequence 1,2,3 appers in the third array.");

} else {

     System.out.println("The sequence 1,2,3 does not appear in the third array.");

}
}

public static boolean checkSequence (int[]arr) {

for (int i= 0; i < arr.length -2;i++) {

if (arr[i] == 1 &&  arr[i+1] == 2 && arr[i+2] ==3) {

return true;

}
}

return false;
}
}
