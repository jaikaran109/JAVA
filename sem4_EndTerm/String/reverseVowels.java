class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length - 1;
        while (l < r) {
            if (ch[l] != 'a' && ch[l] != 'e' &&
                    ch[l] != 'i' && ch[l] != 'o' &&
                    ch[l] != 'u' && ch[l] != 'A' &&
                    ch[l] != 'E' && ch[l] != 'I' &&
                    ch[l] != 'O' && ch[l] != 'U')
                l++;
            else if (ch[r] != 'a' && ch[r] != 'e' &&
                    ch[r] != 'i' && ch[r] != 'o' &&
                    ch[r] != 'u' && ch[r] != 'A' &&
                    ch[r] != 'E' && ch[r] != 'I' &&
                    ch[r] != 'O' && ch[r] != 'U')
                    r--;
            else {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}
