package Arrays;

public class PerimeterOfIsland {
    public int islandPerimeter(int[][] grid) {
        //null check done 
        int result=0;
        if (grid==null)return result;
        //Now ittereate and look for 1 
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
               // System.out.println("i is :"+i +" j is "+j);
                if (grid[i][j]== 1){
                	//whenever find add one 
                    result=result+4;
                    if (i>0){
                    	//check for one row above 
                    	//if found subtract -2 
                    	/*  __  __
                    	 * |__||__|  when these squares are adjacent they will expose only 6 sides instead of 
                    	 *   8 hence -2 
                    	 * */
                        if (grid[i-1][j] ==1){
                            result-=2;
                        }}
                        if (j>0){
                            if (grid[i][j-1]==1){
                                result-=2;
                            }
                        }
                    }
                }
            }
        return result;
        
    }
}
