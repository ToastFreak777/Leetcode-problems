class Solution {
    public static int reverse(int x) {
        long reverse = 0;

        while (x != 0) {

            int remainder = x % 10;

            reverse = Math.addExact(reverse * 10, remainder);

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;

        }
        return (int) reverse;
    }

    public static void main(String[] args) {
        // 2147483647
        // 1056389759
        // 964632435
        // 1534236469
        int x = 1534236469;
        reverse(x);
    }
}