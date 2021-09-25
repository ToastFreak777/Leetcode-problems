import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int i = 0;

        for (int n = 1; n <= nums.length; n++) {
            if (n == nums.length) {
                n = 0;
                i++;
            } else if (nums[i] + nums[n] == target && n != i) {
                output[0] = i;
                output[1] = n;
                break;
            }

        }
        return output;
    }
}

public class App {
    public static void main(String[] args) {
        int[] array = { 3, 2, 4 };

        Solution solution = new Solution();
        int[] output = solution.twoSum(array, 6);

        System.out.println(Arrays.toString(output));
    }
}