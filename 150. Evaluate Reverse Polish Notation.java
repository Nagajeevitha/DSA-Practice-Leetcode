class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        s.push(Integer.parseInt(tokens[0]));
        for(int i=1;i<tokens.length; i++){
            if("+-*/".contains(tokens[i])){
                int second = s.pop();
                int first = s.pop();
                switch(tokens[i]){
                    case "+" : s.push(first+second); break;
                    case "-" : s.push(first-second); break;
                    case "*" : s.push(first*second); break;
                    case "/" : s.push(first/second); break;
                }
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
