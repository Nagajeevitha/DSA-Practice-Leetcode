class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Stack<Integer> s = new Stack<>();
        for(int i=len-1;i>=0;i--){
            while(!s.isEmpty() && temperatures[i]>=temperatures[s.peek()])
                s.pop();
            
            if(!s.isEmpty())
                res[i] = s.peek()-i;
            
            s.push(i);
        }
        return res;
    }
}
