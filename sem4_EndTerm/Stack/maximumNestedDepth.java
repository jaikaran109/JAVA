class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                count++;
                if(count > max) max = count;
            }
            else if(ch == ')'){
                count--;
            }
            
        }
        return max;
    }
}
