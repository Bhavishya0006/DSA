class Solution {
    public int search(int[] nums, int target) {
        int ans = 0;
        boolean found = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                ans = i;
                found = true;
                break;
            }
            else{
                found = false;
            }
        }
        if(!found){
            return -1;
        }
        return ans;
    }
}