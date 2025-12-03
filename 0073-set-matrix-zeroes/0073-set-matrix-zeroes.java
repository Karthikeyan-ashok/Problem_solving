class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(arr[i],-1);
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<row;k++){
                        arr[k][j] = 0;
                    }
                    for(int l=0;l<col;l++){
                        arr[i][l] = 0;
                    }
                }
                else{
                    if(arr[i][j]==-1){
                        arr[i][j] = matrix[i][j];
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            System.arraycopy(arr[i],0,matrix[i],0,col);
        }
    }
}