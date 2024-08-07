class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            int[] arr=new int[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
            String a=Arrays.toString(arr);
            if(!hm.containsKey(a)){
                hm.put(a,new ArrayList<>());
            }
            hm.get(a).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
