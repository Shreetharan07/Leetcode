class Solution {
    public int countSeniors(String[] details) {
        int l=details.length;
        int count=0;
        for(int i=0;i<l;i++){
            String s="";
            s+=details[i].charAt(11);
            s+=details[i].charAt(12);
            int a=Integer.parseInt(s);
            if(a>60) count++;
        }
        return count;
    }
}