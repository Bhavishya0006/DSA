class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int result = 0;
        while(left<right){
            int width = right - left;
            int min = Math.min(height[left],height[right]);
            int area = min * width;
            int max = area;
             result = Math.max(result,max);
             if(height[left]<height[right]){
                left++;
             }
             else{
                right--;
             }
        }
        return result;
    }
}