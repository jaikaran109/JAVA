class Solution {
    public int numOfSubarrays(int[] nums, int k, int t) {
        int ans = 0;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        if(sum / k >= t) ans++;
        for(int i = k ; i < nums.length ; i++){
            sum += nums[i] - nums[i - k];
            if(sum / k >= t) ans++;
        }
        return ans;
    }
}
