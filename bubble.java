import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] var = {-2, 45, 0, 11, -9};
        int var1 = var.length;

      for(int i = 0; i < var1 - 1; ++i) {
         for(int j = 0; j < var1 - i - 1; ++j) {
            if (var[j] > var[j + 1]) {
               int var4 = var[j];
               var[j] = var[j + 1];
               var[j + 1] = var4;
            }
         }
      }
      System.out.println(Arrays.toString(var));
    }
    
}
