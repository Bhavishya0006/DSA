class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n,m,p;
        n= nums1.length;
        m = nums2.length;
        p=n+m;
        int[] arr = new int[p];
       System.arraycopy(nums1,0,arr,0,n);
       System.arraycopy(nums2,0,arr,n,m);
        Arrays.sort(arr);
     if(p % 2 ==1){
        return arr[p/2];
     }
     else {
        return (arr[p/2-1]+arr[p/2])/2.0;
     }
    }
}