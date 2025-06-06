class Solution {
    public int reverse(int x) {
        long rev =0;
        int d,f=0;
        if(x<0){
            x*=-1;
            f=1;
        }
        while(x>0){
            d=x%10;
            rev = (rev*10)+d;
            x/=10;
        }
        if(f==1)
            rev*=-1;
        int ans = (int)rev;
        if(rev>=Integer.MIN_VALUE && rev<=Integer.MAX_VALUE)
            return ans;
        else 
            return 0;

    }
}
