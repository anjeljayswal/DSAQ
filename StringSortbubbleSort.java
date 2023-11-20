
public class StringSortbubbleSort {
    public static void main(String[] args) {
        String arr [] = {"Ram", "Sita", "Gita","Rita"};
        String temp;
        for(int i=0;i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareTo(arr[i])<0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
            System.out.println(arr[i]);
        }
        
    }
    
}
