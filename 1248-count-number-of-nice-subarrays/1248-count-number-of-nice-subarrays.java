class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }

    private int atMost(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }

        int left = 0;
        int ans = 0;
        int oddCount = 0;

        for(int right = 0; right<nums.length; right++){
            oddCount += nums[right]%2;

            while(oddCount > goal){
                oddCount -= nums[left]%2;
                left++;
            }

            ans += right-left+1;
        }

        return ans;

    }
}