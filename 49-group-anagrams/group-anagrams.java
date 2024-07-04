class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            // String to char arr
            char[] a = s.toCharArray();

            Arrays.sort(a);
            String sort = new String(a);

            // not contains then add empty list
            if(!map.containsKey(sort))
            {
                map.put(sort,new ArrayList<>());
            }

            map.get(sort).add(s);
        }
        return new ArrayList<>(map.values());
    }
}



