class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int curr=0;
        int res=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]<=threshold){ //subarray started
            curr=1;

            while(i+1<nums.length && nums[i+1]<=threshold && (nums[i]%2 != nums[i+1]%2)){
                curr++;
                i++;
            }

            res=Math.max(curr,res);
            }
        }
        return res;
    }
}