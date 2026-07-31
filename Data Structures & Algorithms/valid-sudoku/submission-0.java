class Solution {
    public boolean isValidSudoku(char[][] board) {
       List< HashSet<Character>> boxes = new ArrayList<>();
       boolean isValid=true;
        for(int i =0; i<board.length;i++){
            boxes.add(new HashSet<>());
            HashSet<Character> rowSet= new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            for(int j=0; j<board.length;j++){
                if(rowSet.contains(board[i][j]) || colSet.contains(board[j][i])){
                    isValid= false;
                }
                if(board[i][j]!='.'){
                    rowSet.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                    colSet.add(board[j][i]);
                }
            }
            // System.out.printf("row %d set : %s",i,rowSet.toString());
            // System.out.printf("col %d set : %s",i,colSet.toString());
        }
        for(int i =0 ; i< board.length;i++){
            for(int j =0 ; j<board.length;j++){
                int boxIndex = ((i/3)*3)+(j/3);
                // System.out.println("box index for "+i+" and "+j+" is :: "+boxIndex);
                HashSet box= boxes.get(boxIndex);
                if(box.contains(board[i][j])){
                    isValid= false;
                }
                if(board[i][j]!='.'){
                    box.add(board[i][j]);
                }
            }
        }


        return isValid;
    }
}
