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
//itterate over the array to find the 1's 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				if (grid[i][j] == '1') {
					result++;
					//once you find the 1 call the recursive method 
					//itterative could be done but that would be very difficult to implement 
					search(grid, i, j);
				}
		}
		return result;
	}

	public void search(char[][] grid, int i, int j) {
		row = grid.length;
		col = grid[0].length;
		//check for boundary and '0'
		if (i < 0 || i > row - 1 || j < 0 || j > col - 1 || grid[i][j] == '0')
			return;
		//change 1 to 0 so it is not counted again 
		grid[i][j] = '0';
		//when we call it recursively what actually happens 
		/*[0 1 1 0 ]
		 *[1 0 1 0 ]
		 *[1 0 0 1 ]
		 *[0 0 0 1 ]
		 *
		 *1st instance is row 0 col 1 :: first recursion call happens and continues till col 2, then it hits the base case 
		 *hence unwinding of the stack starts 
		 *after unwinding i=0 and j=1, and now it will check j=0 and hit base case , similarly, 
		 *it will check in all 4 direction
		 * 
		 * */
		search(grid, i, j + 1);
		search(grid, i, j - 1);
		search(grid, i + 1, j);
		search(grid, i - 1, j);

	}

}
