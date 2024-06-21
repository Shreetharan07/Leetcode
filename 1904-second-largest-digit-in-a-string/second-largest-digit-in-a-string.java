class Solution {
    public int secondHighest(String s) {
        Set<Integer> arrset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                arrset.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        ArrayList<Integer> li=new ArrayList<>(arrset);
        if(li.size()<2) return -1;
        Collections.sort(li);
        return li.get(li.size()-2);
        
    }
}