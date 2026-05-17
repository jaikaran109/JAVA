class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()) return list;

        int[] pcount = new int[26];
        int[] scount = new int[26];

        for(int i = 0 ; i < p.length() ; i++){
            pcount[p.charAt(i) - 'a']++;
            scount[s.charAt(i) - 'a']++;
        }
        boolean same = true;
        for(int i = 0 ; i < 26 ; i++){
            if(pcount[i] != scount[i]) {
                same = false;
                break;
            }
        }
        if(same) list.add(0);

        for(int i = p.length() ; i < s.length() ; i++){
            scount[s.charAt(i) - 'a']++;
            scount[s.charAt(i - p.length()) - 'a']--;
            same = true;
            for(int j = 0 ; j < 26 ; j++){
                if(pcount[j] != scount[j]){
                    same = false;
                    break;
                }
            }
            if(same) list.add(i - p.length() + 1);
        }
        return list;
    }
}
