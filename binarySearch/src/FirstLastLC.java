public class FirstLastLC {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            // first occurence

            int start = 0;
            int end = nums.length-1;
            int res1 = -1;
            int[] ans = new int[2];

            while(start<=end){
                int mid = (start+end)/2;

                if(nums[mid]>target){
                    end = mid-1;
                }
                else if(nums[mid]==target){
                    res1 = mid;
                    end = mid-1;
                }
                else{
                    start=mid+1;
                }
            }

            //last occurence

            start = 0;
            end = nums.length-1;
            int res2 = -1;

            while(start<=end){
                int mid = (start+end)/2;

                if(nums[mid]<target){
                    start=mid+1;
                }
                else if(nums[mid]==target){
                    res2 = mid;
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

            ans[0] = res1;
            ans[1] = res2;

            return ans;

        }
    }
}
