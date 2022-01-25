class Solution {
    public int numIslands(char[][] grid) {
        int[][] dirA={{-1,0},{0,1},{1,0},{0,-1}};
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!='0'){
                    grid[i][j]='0';
                    GCC(i,j,grid,dirA);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void GCC(int row, int col, char[][] arr, int[][] dirA){
        for(int i=0;i<dirA.length;i++){
            int x=row+dirA[i][0];
            int y=col+dirA[i][1];

            if(x>=0 && y>=0 && x<arr.length && y<arr[0].length && arr[x][y]!='0'){
                arr[x][y]='0';
                GCC(x,y,arr,dirA);
            }
        }
    }
} 