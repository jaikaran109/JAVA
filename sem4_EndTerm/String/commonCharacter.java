class Solution {
    public List<String> commonChars(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);

        for(String word : words){
            int[] freq = new int[26];
            for(int i = 0 ; i < word.length() ; i++){
                freq[word.charAt(i) - 'a']++;
            }
            for(int i = 0 ; i < 26 ; i++){
                minfreq[i] = Math.min(freq[i],minfreq[i]);
            }
        }

        List<String> str = new ArrayList<>();

        for(int i = 0 ; i < 26 ; i++){
            while(minfreq[i] > 0){
                str.add("" + (char)(i + 'a'));
                minfreq[i]--;
            }
        }
        return str;
    }
}
