// 200. Number of Islands

class Solution {
    int row;
    int col;
    public void dfs(int i, int j, char[][] grid, boolean[][] visited) {
        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == '0' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        int[][] adjList = {
            {i - 1, j},
            {i, j + 1}, 
            {i + 1, j}, 
            {i, j - 1}
        };
        for(int neighbour[] : adjList){
            dfs(neighbour[0], neighbour[1], grid, visited);
        }
    }
    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        int islands = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    dfs(i, j, grid, visited);
                    islands++;
                }
            }
        }

        return islands;
    }
}