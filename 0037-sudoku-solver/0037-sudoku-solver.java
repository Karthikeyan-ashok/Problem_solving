class Solution {
    public boolean isValid(char board[][], char k, int i, int j){
        for(int r=0; r<9; r++)
        {
            if(board[r][j] == k)
            {
                return false;
            }
        }

        for(int c=0; c<9; c++)
        {
            if(board[i][c]==k) 
            {
                return false;
            }
        }

        i = (i/3)*3;
        j = (j/3)*3;

        for(int r=i; r<i+3; r++)
        {
            for(int c=j; c<j+3; c++)
            {
                if(board[r][c]==k) 
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solve(char board[][])
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(board[i][j]=='.')
                {
                    for(char k='1'; k<='9'; k++)
                    {
                        if(isValid(board,k,i,j))
                        {
                           board[i][j] = k;
                           if(solve(board))
                           {
                            return true;
                           }
                           else
                           {
                            board[i][j]='.';
                           }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}