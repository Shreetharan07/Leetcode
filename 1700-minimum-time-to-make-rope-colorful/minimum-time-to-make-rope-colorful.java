class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int a=0;
        for(int i=0;i<n-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                if(neededTime[i]<neededTime[i+1]){
                    a=a+neededTime[i];
                }
                else{
                    a=a+neededTime[i+1];
                    neededTime[i+1]=neededTime[i];
                }
            }
        }

       return a;
    }
}