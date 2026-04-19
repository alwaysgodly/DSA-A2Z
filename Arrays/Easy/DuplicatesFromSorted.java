class Solution{
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j]; //store the unique element at index i
            }
        }
        return i + 1; //i is index , we need to return length so we add 1
    }
}