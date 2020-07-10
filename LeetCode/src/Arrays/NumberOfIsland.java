package Arrays;

public class NumberOfIsland {
	int row;
	int col;

	public int numIslands(char[][] grid) {
		int result = 0;
		if (grid == null || grid.length == 0)
			return 0;
		row = grid.length;
		col = grid[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				if (grid[i][j] == '1') {
					result++;
					search(grid, i, j);
				}
		}
		return result;
	}

	public void search(char[][] grid, int i, int j) {
		row = grid.length;
		col = grid[0].length;
		if (i < 0 || i > row - 1 || j < 0 || j > col - 1 || grid[i][j] == '0')
			return;
		grid[i][j] = '0';
		search(grid, i, j + 1);
		search(grid, i, j - 1);
		search(grid, i + 1, j);
		search(grid, i - 1, j);

	}

}
