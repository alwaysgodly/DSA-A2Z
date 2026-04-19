class Solution{
    public int rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; //for k larger than n

        reverse(nums, 0, n-1); //reverse the whole array
        reverse(nums, 0, k-1); //reverse the first k elements
        reverse(nums, k, n-1); //reverse the remaining n-k elements



}

    private void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

}