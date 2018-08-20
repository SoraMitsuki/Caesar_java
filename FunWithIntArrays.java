/**Jiaqi Fan 
A12584051
cse8b
1/8/201
**/

public class FunWithIntArrays {

 // return the largest element in the input array
 public static int findMax(int[] array) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int max = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] > max) {
    max = array[i];
   }
  }

  return max;
 }

 // return the smallest element in the input array
 public static int findMin(int array[]) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int min = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] < min) {
    min = i;
   }
  }

  return min;
 }


 // return a copy of the input array
 public static int[] arrayCopy(int[] array) {
  if (array == null)
   return null;

  int[] result = new int[array.length];

  for (int i = 0; i < array.length; i++) {
   result[i] = array[i];
  }
  return result;
 }

 // output the elements of the input array
 public static void printArray(int[] array) {
  if (array == null)
   return;

  for (int i = 0; i < array.length; i++) {
   System.out.print(array[i] + ", ");
  }

  System.out.println();
 }

 // return a sorted copy of the input array
 public static int[] arraySort(int[] array) {
  if (array == null)
   return null;

  int[] result = new int[array.length];

  for (int i = 0; i < array.length - 1; ++i) {
   for (int j = 0; j < array.length - i - 1; j++) {
    if (array[j] > array[j + 1]) {
     //swapping array[j] and array[j+1]
     int temp = array[j];
     array[j + 1] = array[j];
     array[j] = temp;
    }
   }
  }
  return array;
 }
}



