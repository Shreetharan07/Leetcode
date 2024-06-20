class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                rc++;
            } if (s.charAt(i) == 'L') {
                lc++;
            }
            if (rc == lc) {
                count++;
                rc = 0;
                lc = 0;
            }
        }

        return count;
    }
}
