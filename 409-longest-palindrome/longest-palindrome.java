class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        boolean oddFound=false;
        for (int freq : hm.values()) {
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                oddFound = true;
            }
        }
        
        if (oddFound) {
            count += 1;
        }

        
        return count;

    }
}