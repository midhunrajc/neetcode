class Solution {
    public int reverse(int x) {

       int num = x;
       int rev = 0;
       while (num != 0) {
        int rem = num % 10;
        num  /= 10;

        // Check for positive overflow before multiplying
        if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
            return 0;
        }
        // Check for negative overflow before multiplying
        if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
            return 0;
        }

        rev = (rev * 10) + rem;
       } 

       return rev;
    }
}
