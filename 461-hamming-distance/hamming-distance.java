class Solution {
    public int hammingDistance(int x, int y) {
        String a=Integer.toBinaryString(x);
        String b=Integer.toBinaryString(y);
        int count=0;
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        for(int i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i)) count++;
        }
        return count;
    }
}