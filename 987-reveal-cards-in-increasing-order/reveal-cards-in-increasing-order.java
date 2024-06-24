class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int arr[]=new int[deck.length];
        int z=0;
        for(int i=deck.length-1;i>=0;i--){
            arr[z++]=deck[i];

        }
        List <Integer> li=new ArrayList<>();
       
        for(int i:arr){
            if(li.size()>=1){
               int last= li.get(li.size()-1);
               li.remove(li.size()-1);
                li.add(0,last);
               li.add(0,i);
              
               
            //    return li;
              
            }
            else{
                li.add(i);
            }
        }
       
        int y=0;
        for(int j:li){
            arr[y++]=j;
        }
        return arr;

      
        
    }
}