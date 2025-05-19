class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zeros = 0, x = 0, y = 0;

        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                if(grid[r][c] == 0) zeros++;
                else if(grid[r][c] == 1) {
                    x = r;
                    y = c;
                }
            }
        } 
        return path(grid, x, y, zeros); 
    }

    private int path(int[][] grid, int x, int y, int zeros) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) return 0;

        if(grid[x][y] == 2) return zeros == -1 ? 1 : 0;

        grid[x][y] = -1;
        zeros--;

        int total = path(grid, x + 1, y, zeros) + path(grid, x, y + 1, zeros) + path(grid, x - 1, y, zeros) + path(grid, x, y - 1, zeros);

        grid[x][y] = 0;
        zeros++;

        return total;
    }
}