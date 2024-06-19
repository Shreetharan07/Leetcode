class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        // Initialize the DP array
        int[][] arr = new int[m][n];
        
        // If the start or end point is an obstacle, return 0
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) {
            return 0;
        }
        
        // Initialize the first column
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break; // If there's an obstacle, the rest of the column is not reachable
            }
            arr[i][0] = 1;
        }
        
        // Initialize the first row
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                break; // If there's an obstacle, the rest of the row is not reachable
            }
            arr[0][j] = 1;
        }
        
        // Fill in the rest of the array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    arr[i][j] = 0; 
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        
        return arr[m-1][n-1];
    }
}