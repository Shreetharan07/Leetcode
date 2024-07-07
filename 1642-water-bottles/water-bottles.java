class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        int n=numBottles;
        int e=numExchange;
        while(n>0){
            int rem=n%e;
            n=n/e;
            if(n==0) break;
            count=count+n;
            n=n+rem;
        }
        return count;
    }
}