class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String s1 = "";
        
        if (s.charAt(0) == '-') {
            s1 += '-';
            for (int i = s.length() - 1; i > 0; i--) {
                s1 += s.charAt(i);
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                s1 += s.charAt(i);
            }
        }
        
        try {
            return Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            return 0; // Return 0 in case of overflow
        }
    }
}
