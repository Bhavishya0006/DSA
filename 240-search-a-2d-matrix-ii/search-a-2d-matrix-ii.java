class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        boolean found = false;
        while(row<matrix.length && col>=0){
          int value = matrix[row][col];
          if(value == target){
            found = true;
            break;
          }
          else if (value > target){
            col--;
          }
          else{
            row++;
          }
        }
        return found;
    }
}