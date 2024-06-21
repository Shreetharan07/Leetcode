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
        /*
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                arr.add((int)s.charAt(i));
            }
        }
        Set<Integer> li=new HashSet<>(arr);
        ArrayList<Integer> arr1=new ArrayList<>(li);
        Collections.sort(arr1);
        int l=arr1.size();
        if(l==1) return -1;
        return arr1.get(l-2);
        */
    }
}