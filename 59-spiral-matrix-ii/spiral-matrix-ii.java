class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int [n][n];
        int start = 1;
        int top = 0;
        int bottom = n-1;
        int left=0;
        int right = n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]= start++;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                arr[j][right] = start++;
            }
            right--;
            if(top<=bottom){
            for(int k = right;k>=left;k--){
                arr[bottom][k] = start++;
            }
            bottom--;
            }
            if(left<=right){
            for(int l=right;l>=top;l--){
                arr[l][left] = start++;
            }
            left++;
            }
            }
            return arr;
    }
}