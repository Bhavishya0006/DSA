class Solution {
    public void nextPermutation(int[] nums) {
       int lastSecond = nums.length - 2;
       int last = nums.length - 1;
       while( lastSecond>=0 && nums[lastSecond]>=nums[lastSecond+1]){
        lastSecond--;
       }
        if (lastSecond == -1) {
    reverse(nums, 0, nums.length - 1);
    return;
     }
       while(last>= 0){
        if(nums[lastSecond]<nums[last]){
            int temp = nums[last];
          nums[last] =  nums[lastSecond];
          nums[lastSecond] = temp;
          break;
        }
        else{
            last--;
        }
       }  
        reverse(nums, lastSecond + 1, nums.length - 1);  
    }
 void reverse(int []nums,int left, int right){
       while(left<right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
       }
       }
}