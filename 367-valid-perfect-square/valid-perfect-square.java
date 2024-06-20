class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid; // Use

            if (midSquared == num) {
                return true;
            } else if (midSquared > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return false;
    }
}
