class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // 1. Pehle 'k' elements ka sum nikaal lo
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // 2. Max sum ko initialize karo pehle k elements ke sum se
        double max_sum = sum;
        
        // 3. Sliding Window: i ko 1 se start karke end tak le jao
        // i-1 wala element nikaalo aur i+k-1 wala add karo
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum, sum);
        }
        
        // 4. Last mein average return karo
        return max_sum / k;
    }
}
