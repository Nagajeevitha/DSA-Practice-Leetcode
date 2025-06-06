class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        String[] res = new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
            res[j++]=arr[i];
        return String.join(" ",res);
    }
}
