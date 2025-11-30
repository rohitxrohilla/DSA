class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int res = -1;


        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]>target){
                end=mid-1;
            }
            else if(target==nums[mid]){
                return mid;
            }
            else{
                res = mid;
                start=mid+1;
            }
        }
        return res+1;
    }
}