class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuffer str = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))
                str.append(s.charAt(i));
        }

        StringBuffer rev = new StringBuffer(str).reverse();

        if(str.toString().equals(rev.toString()))
            return true;
        else
            return false;
    }
}
