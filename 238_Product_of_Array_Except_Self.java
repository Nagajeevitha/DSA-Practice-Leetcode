class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod =1;
        int n=nums.length;
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int p=1;
                for(int j=0;j<n;j++){
                    if(i!=j){
                        p*=nums[j];
                        res[j]=0;
                    }
                }
                res[i]=p;
                return res;
            }
            prod *= nums[i];
        }

        for(int i=0;i<n;i++){
            res[i]=prod/nums[i];
        }
        return res;
    }
}
