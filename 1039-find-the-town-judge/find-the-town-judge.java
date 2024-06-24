class Solution {
    public int findJudge(int n, int[][] trust) {
        int v=n;
        if(n==1) return 1;
		
        int indegree[]=new int[n+1];
        int outdegree[]=new int[n+1];
        for(int i=0;i<trust.length;i++){
                    indegree[trust[i][1]]++;
                    outdegree[trust[i][0]]++;
        }
        for(int i=0;i<n+1;i++){
            if(indegree[i]==n-1 && outdegree[i]==0){
                    return i;
            }
        }
        return -1;
    }
}