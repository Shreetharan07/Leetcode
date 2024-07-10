class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        int l=words.length;
        for(int i=left;i<=right;i++){
            if(words[i].charAt(0)=='a' ||words[i].charAt(0)=='e' ||words[i].charAt(0)=='i' ||words[i].charAt(0)=='o' ||words[i].charAt(0)=='u'){
                int z=words[i].length()-1;
                if(words[i].charAt(z)=='a' || words[i].charAt(z)=='e' ||words[i].charAt(z)=='i' ||words[i].charAt(z)=='o' ||words[i].charAt(z)=='u') count++;
            }
        }
        return count;
    }
}