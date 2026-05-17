class Solution {
    public int maxFreqSum(String s) {
        int[] v = new int[26];
        int[] c = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'u' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'e') {
                ++v[s.charAt(i) - 'a'];
            }else{
                ++c[s.charAt(i) - 'a'];
            }
        }
        int max1 = 0;
        int max2 = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(max1 < v[i]) max1 = v[i];
            if(max2 < c[i]) max2 = c[i];
        }
        return max1 + max2;
    }
}
