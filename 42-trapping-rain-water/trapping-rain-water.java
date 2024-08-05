class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        leftmax[0]=0;
        rightmax[n-1]=0;
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i+1]);
        }
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=Math.min(leftmax[i],rightmax[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if((dp[i]-height[i])>0) sum=sum+(dp[i]-height[i]);
        }
        return sum;

    }
}