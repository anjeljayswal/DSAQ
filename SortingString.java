import java.util.Arrays;
import java.util.Scanner;
public class SortingString {
   /**
 * @param args
 */
public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String str = sc.nextLine();
      char charArray[] = str.toCharArray();
    //   Arrays.sort(charArray);
    //   System.out.println(new String(charArray));

    for(int i=0;i<charArray.length; i++){
        for(int j=i+1; j<charArray.length; j++){
            if(charArray[j] < charArray[i]){
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            

        }
        
    }
    // System.out.println("Third largest element is: "+Arrays.toString(charArray));
    System.out.println(charArray);

   }
}