class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        
        n=n%14==0?14:n%14;
        for(int i=1;i<=n;i++){
            int[] tempArr=new int[cells.length];
            for(int j=1;j<cells.length-1;j++){
                if(cells[j-1]==cells[j+1]){
                    tempArr[j]=1;
                }
                else tempArr[j]=0;
            }
            cells=tempArr;
        }
        return cells;
    }
}