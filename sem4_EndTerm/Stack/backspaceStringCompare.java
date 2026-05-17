class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '#') {
                 if(!st1.isEmpty()) st1.pop();
            }
            else st1.push(ch);
        }
        Stack<Character> st2 = new Stack<>();
        for(char ch : t.toCharArray()){
            if(ch == '#'){
                if(!st2.isEmpty()) st2.pop();
            }
            else st2.push(ch);
        }

        String str = "";
        while(!st1.isEmpty()){
            str += st1.pop();
        }
        String gtr = "";
        while(!st2.isEmpty()){
            gtr += st2.pop();
        }

        return str.equals(gtr);
    }
}
