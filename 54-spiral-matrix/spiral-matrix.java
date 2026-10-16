class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1; // matrix[0] is for colums
        int top = 0;
        int bottom = matrix.length-1; //matrix.length is for rows
        List<Integer> list = new ArrayList<>();
        while(top<=bottom && left<=right){
           for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
           }
           top++;
           for(int j=top;j<=bottom;j++){
            list.add(matrix[j][right]);
           }
           right--;
           if(top<=bottom){
            for(int k=right;k>=left;k--){
                list.add(matrix[bottom][k]);
            }
            bottom--;
           }
           if(left<=right){
            for(int j=bottom;j>=top;j--){
                list.add(matrix[j][left]);
            }
            left++;
           }
        }
        return list;
    }
}