class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = s.length();
        if(n1!=n2)
            return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
            return true;
        return false;
    }
}
