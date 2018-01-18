package dfs;

/**
 * Created by jal on 2018/1/17 0017.
 */
public class MaxAreaOfIsland {
    static class Solution {
        public static int [][]direct = {
                {0,1},{0,-1},{1,0},{-1,0}
        };
        public static int [][]book,grid;
        public  int sum ,max =0 ;
        public int maxAreaOfIsland(int[][] grid1) {
            grid = grid1.clone();
            for(int i = 0; i < grid.length; i++){
                for (int j = 0; j < grid[i].length; j++){
                   if(grid[i][j] == 1){
                       sum = 1;
                       book = new int[grid.length][grid[0].length];
                       book[i][j] = 1;
                       dfs(i,j);
                       max = Math.max(max,sum);
                       //System.out.println("sum:"+sum+" max:"+max);
                   }
                }
            }
            return max;
        }
        public void dfs(int x,int y){
            for(int i = 0; i < 4; i++){
                int tx = x + direct[i][0];
                int ty = y + direct[i][1];
                if(tx >= grid.length || tx < 0 || ty >= grid[tx].length ||ty < 0)continue;
                if(book[tx][ty] == 0 && grid[tx][ty] == 1){
                    sum++;
                   // System.out.println(sum);
                    book[tx][ty] = 1;
                    dfs(tx,ty);
                }
            }
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int [][]a = new int[][]{{0,1,1},{1,0,0}};
        int y =s.maxAreaOfIsland(a);
        System.out.println(y);
    }
}
