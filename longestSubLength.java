public class longestSubLength {
    static int maxlength(String s)
    {
        int n = s.length(), i, j;
        int ans = 0;
        for (i = 0; i <= n - 1; i++) {
 
            // Count the number of contiguous 1's
            if (s.charAt(i) == '0') {
 
                int count = 1;
                for (j = i + 1;
                     j <= n - 1 && s.charAt(j) == '0'; j++)
                    count++;
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
 
    public static void main(String[] args)
    {
        String s = "11101110";
 
        System.out.println(
            "Length of longest substring containing '1' = "
            + maxlength(s));
    }

    
}
