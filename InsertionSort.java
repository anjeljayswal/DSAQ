import java.util.Arrays;

public class InsertionSort {
    void insertionSort(int arr []){
        int size = arr.length;
        for(int step=1; step<size; step++){
            int key = arr[step];
            int j=step-1;
            while(j >= 0 && key<arr[j] ){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,6,2,7,2,8};
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    
}
