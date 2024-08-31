class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int longest=1;
        int start=0;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j+i-1<n;j++){
                if(i==1) dp[j][j]=1;
                else if(i==2 && s.charAt(j)==s.charAt(j+1)){
                    dp[j][j+1]=2;
                    longest=2;
                    start=j;
                    count=2;
                }
                else if(s.charAt(j)==s.charAt(j+i-1) && dp[j+1][j+i-2]!=-1){
                    dp[j][j+i-1]=dp[j+1][j+i-2]+2;
                    if(dp[j][j+i-1]>longest){
                        longest=dp[j][j+i-1];
                        start=j;
                        count=i;
                    }
                }
            }
        }
        int end=start+count;
        return s.substring(start,end);
    }
}