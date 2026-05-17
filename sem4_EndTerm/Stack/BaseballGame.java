class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < op.length ; i++){
            switch(op[i]){
                case "+":
                    int temp = st.pop();
                    int sum = temp + st.peek();
                    st.push(temp);
                    st.push(sum);
                    break;

                case "D":
                    st.push(st.peek()*2);
                    break;

                case "C":
                    st.pop();
                    break;

                default:
                    st.push(Integer.parseInt(op[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
