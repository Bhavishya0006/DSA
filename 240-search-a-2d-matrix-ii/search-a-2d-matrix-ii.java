class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; // give number of row
        int m = matrix[0].length; // give number of colum
        int row = 0;
        int col = m - 1;
        while(row < n && col >= 0){
          int value = matrix[row][col];
          if(value == target){
            return true;
          }
          else if (value > target){
            col--;
          }
          else{
            row++;
          }
        }
        return false;
    }
}