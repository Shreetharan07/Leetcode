class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startcolor=image[sr][sc];
        dfs(sr,sc,image,color,startcolor);
        return image;
    }
    public int[][] dfs(int i,int j,int[][] grid,int color,int startcolor){
        int rows=grid.length;
        int columns=grid[0].length;
        if(i<0 || i>=rows || j<0 || j>=columns){
            return grid;
        }
        if(startcolor!=grid[i][j] || grid[i][j]==color){
            return grid;
        }
        grid[i][j]=color;
        dfs(i-1,j,grid,color,startcolor);
        dfs(i+1,j,grid,color,startcolor);
        dfs(i,j-1,grid,color,startcolor);
        dfs(i,j+1,grid,color,startcolor);
        return grid;
    }

}