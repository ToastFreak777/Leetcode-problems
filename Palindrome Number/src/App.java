import java.util.ArrayList;

/* Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not. */

class Solution {
    public static boolean isPalindrome(int x) {
        ArrayList<Integer> arr = new ArrayList<>();

        if (x == 0) {
            arr.add(x);
        } else if (x != 0) {
            while (x != 0) {
                if (x <= -10) {
                    arr.add(x % -10);
                    x /= -10;
                } else {
                    arr.add(x % 10);
                    x /= 10;
                }
            }
        }
        int n = arr.size() - 1;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) != arr.get(n) || arr.size() == 1 && arr.get(i) < 0) {
                break;
            } else if (i == n || i > n) {
                return true;
            }
            n--;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        // 1234231
        // 0
        // 11
        System.out.println(isPalindrome(121));
    }
}