class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zeros++;
            else
                nums[k++]=nums[i];
        }
        for(int i=k;i<nums.length;i++)
            nums[i]=0;
            
    }
}
