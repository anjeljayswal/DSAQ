import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int [][] test = new int[][]{
            {3,6,5,6,6,8,3,4},
            {2,5,9,8,4,8,5,4}
        };
        for(int [] inputs:test){
            System.out.println(Arrays.toString(inputs));
            System.out.println(Arrays.toString(reDuplicates(inputs)));
        }
    }
    public static int [] reDuplicates(int [] numbersWithDuplicates){
        Arrays.sort(numbersWithDuplicates);
        int [] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;
        for(int i=1; i<numbersWithDuplicates.length; i++){
            int ch =numbersWithDuplicates[i];
            if(previous != ch){
                result[i] =ch;
            }
            previous=ch;
        }
        return result;
    }
    
}
