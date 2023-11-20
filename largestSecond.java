import java.util.Arrays;
public class largestSecond {
   
    public static void main(String[] args) {
        int [] arr = {3,5,6,7,2,8};
        int first=Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        // int second=arr[0];
        for(int i : arr){
            if(i>first){
                first=i;                
            }else if(i <small){
                small=i;
            }
        }
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != first){
                second = Math.max(second, arr[i]);

            }

        }
        System.out.println(first);
        System.out.println(small);
        System.out.println(second);
    }
    
}
