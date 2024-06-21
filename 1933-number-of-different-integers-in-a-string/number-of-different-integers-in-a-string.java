import java.math.BigInteger;
class Solution {
    public int numDifferentIntegers(String word) {
        String s=word.replaceAll("[a-zA-Z]"," ");
        s=s.trim();
        if(s==""){
        return 0;
       }
      String[] arr=s.split("\\s+");
       if(arr.length==1)
       {
        return 1;
       } 
        Set<BigInteger> sb=new HashSet<>();
        for(String k:arr){
            sb.add(new BigInteger(k));
        }
         return sb.size();      
    }
}