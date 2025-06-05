class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str= "";
        int n = strs.length;
        int m = strs[0].length();
        for(int i=1;i<n;i++){
            if(m>strs[i].length())
                m=strs[i].length();
        }
        for(int i=0;i<m;i++){
            int f=0;
            for(int j=0;j<n;j++){
                if(strs[0].charAt(i) == strs[j].charAt(i))
                    continue;
                else{
                    f=1;
                    break;
                }
            }
            if(f==1)
                break;
            str = str+strs[0].charAt(i);
        }
        return str;
    }
}
