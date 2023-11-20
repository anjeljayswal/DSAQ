// // Quick sort in Java

// import java.util.Arrays;
// import java.util.Scanner;
// public class Quicksort {
//     //method to find partition position
//     static int partition(int arr[], int low, int high){
        
//         //choose pivot to rightmost element
//         int pivot = arr[high];

//         //pointer for greater element
//         int i=(low-1);

//         // traverse throug all elements , compare ecah elemet with pivot
//         for(int j=low; j<high; j++){
//             if(arr[j] <= pivot){

//                 // if element smaller than pivot is found
//                 // swap it with the greatr element pointed by i        
//                 i++;

//                  // swapping element at i with element at j
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         // swapt the pivot element with the greater element specified by i
//     int temp = arr[i + 1];
//     arr[i + 1] = arr[high];
//     arr[high] = temp;

//     // return the position from where partition is done
//     return (i + 1);
//     }
//     static void quickSort(int array[], int low, int high) {
//         if (low < high) {
    
//           // find pivot element such that
//           // elements smaller than pivot are on the left
//           // elements greater than pivot are on the right
//           int pi = partition(array, low, high);
          
//           // recursive call on the left of pivot
//           quickSort(array, low, pi - 1);
    
//           // recursive call on the right of pivot
//           quickSort(array, pi + 1, high);
//         }
//     }
    
    
// }
// class Main {
//   public static void main(String args[]) {
//     // Scanner sc = new Scanner(System.in);
//     // int data[] = sc.nextInt();
//     int[] data = { 8, 7, 2, 1, 0, 9, 6 };
//     System.out.println("Unsorted Array");
//     System.out.println(Arrays.toString(data));

//     int size = data.length;

//     // call quicksort() on array data
//     Quicksort.quickSort(data, 0, size - 1);

//     System.out.println("Sorted Array in Ascending Order: ");
//     System.out.println(Arrays.toString(data));
//   }
// }

import java.util.Arrays;

class Quicksort {

  static int partition(int array[], int low, int high) {
    
    int pivot = array[high];    
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);      
      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }
}

// Main class
class Main {
  public static void main(String args[]) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));

    int size = data.length;

    Quicksort.quickSort(data, 0, size - 1);

    System.out.println("Sorted Array in Ascending Order ");
    System.out.println(Arrays.toString(data));
  }
}