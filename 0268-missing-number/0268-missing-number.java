class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expectedSum = 0;
        int n = nums.length;

        for(int num: nums){
            sum +=num;
        }

        expectedSum = (n*(n+1))/2;

        return expectedSum - sum;
    }
}