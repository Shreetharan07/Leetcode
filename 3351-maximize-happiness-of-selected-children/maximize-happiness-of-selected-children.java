class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int a=0;
        long count=0;
        int n=happiness.length;
        for(int i=n-1;i>=n-k;i--){
            if(happiness[i]>0 && happiness[i]-a>0){
                count=count+(happiness[i]-a);
                a++;
            }
            
        }
        return count;
    }
}