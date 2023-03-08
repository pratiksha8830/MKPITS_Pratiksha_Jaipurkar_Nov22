//*


class assig19_jan19{

public static void main (String []args) {
int[] arr1 = {1,5,5,6,7,5};
int[] arr2 = {5,5,5,6,5,6,5};
int[] arr3 = {1,2,3,4,5,6};


int count = countFives(arr1);

System.out.println("Number of occurrences where two 5's are next to each other or a 5 and 6 are next to each other in the first array:"+ count);


count = countFives (arr2);
System.out.println("Number of occurrences where two 5's are next to each  other or a 5 and 6 are next to each other in the second array:" + count );

count = countFives (arr3);
System.out.println("Number of occurrences where two 5's are next to each other or a 5 and 6 are the  next to each  other  in the third array: " +count);

}

public static int countFives (int[] arr){

int count = 0;

for (int i=0; i< arr.length -1; i++) {

if ((arr[i] ==5 && arr[i+1] == 5) ||
(arr[i] == 5 && arr[i+1] ==6)) {
	count++;
}
}
return count;
}
}
