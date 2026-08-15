class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int right = 0; right<s.length(); right++){
            int index = s.charAt(right) - 'A';

            count[index]++;

            maxFreq = Math.max(maxFreq, count[index]);

            int windowLength = right-left+1;
            int changesNeeded = windowLength - maxFreq;

            while(changesNeeded > k){
                int leftIndex = s.charAt(left) - 'A';
                count[leftIndex]--;
                left++;

                windowLength = right-left+1;
                changesNeeded = windowLength - maxFreq;

            }

            maxLen = Math.max(maxLen, windowLength);
        }

        return maxLen;
    }
}