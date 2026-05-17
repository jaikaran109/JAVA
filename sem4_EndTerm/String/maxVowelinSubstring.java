class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0 ; i < k ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;
        }
        int max = count;
        for(int i = k ; i < s.length() ; i++){
            char add = s.charAt(i);
            char remove = s.charAt(i-k);
            if(add == 'a' || add == 'e' || add == 'i' || add == 'o' || add == 'u') count++;
            if(remove == 'a' || remove == 'e' || remove == 'i' || remove == 'o' || remove == 'u') count--;
            max = Math.max(max,count);
        }
        return max;
    }
}
