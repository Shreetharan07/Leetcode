class Solution {
    public boolean isPerfectSquare(int num) {
        int n=(int)Math.sqrt(num);
        int t=n*n;
        if(num==t) return true;
        else return false;
    }
}