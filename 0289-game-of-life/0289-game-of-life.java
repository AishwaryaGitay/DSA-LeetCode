class Solution {
    public void gameOfLife(int[][] board) {
        
        int[][] clone = new int[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                clone[i][j] = board[i][j];
            }
        }

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[i].length ; j++){
                if(clone[i][j] == 1){
                    int live = checkForLive(clone, i, j);
                    if(live == 2 || live == 3){
                        board[i][j] = 1;
                    } else{
                        board[i][j] = 0;
                    }
                } else {
                    if (checkForLive(clone, i, j) == 3) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 0;
                    }
                }
            }
        }
    }


    public int checkForLive(int[][] board, int i, int j) {

        int alive = 0;

        if(i+1 < board.length && board[i+1][j] == 1){   // down
            alive++;
        }
        if(j+1 < board[0].length && board[i][j+1] == 1){   // right side
            alive++;
        }
        if(i-1 >= 0 && board[i-1][j] == 1){    // up
            alive++;
        }
        if(j-1 >= 0 && board[i][j-1] == 1){    // left
            alive++;
        }
        if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1){  //upper left diag
            alive++;
        }
        if(i-1 >= 0 && j+1 < board[0].length && board[i-1][j+1] == 1){  // upper right diagonal
            alive++;
        }
        if(i+1 < board.length && j-1 >= 0 && board[i+1][j-1] == 1){   // lower left diagonal
            alive++;
        }
        if(i+1 < board.length && j+1 < board[0].length && board[i+1][j+1] == 1){   // lower right diagonal
            alive++;
        }

        return alive;
    }
}