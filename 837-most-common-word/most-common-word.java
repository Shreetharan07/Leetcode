class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String p=paragraph.toLowerCase();
        p=p.replaceAll("[^a-z]"," ");
        String[] str=p.split("\\s+");
        HashMap<String,Integer> hm=new HashMap<>();
        for(String s:str){
            if(!hm.containsKey(s)){
                hm.put(s,1);
            }
            else{
                hm.put(s,hm.get(s)+1);
            }
        }
        ArrayList<String> ar=new ArrayList<>(hm.keySet());
        ar.sort(Comparator.comparing(hm::get));
        Collections.reverse(ar);
        HashMap<String,Integer> hi=new HashMap<>();
        for(String t:banned){
            if(!hi.containsKey(t)){
                hi.put(t,1);
            }
          
        }
        for(int i=0;i<ar.size();i++){

            if(!hi.containsKey(ar.get(i)))
             return ar.get(i);
        }
        return "";
    }
}