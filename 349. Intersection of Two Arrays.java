class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int res[];
        int n1,n2,i=0,j=0,k=0;
        n1=nums1.length;
        n2=nums2.length;
        res = new int[n1];

        for(i=0;i<n1;i++){
            int f=0;
            for(j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    if(f==0){
                        res[k++]=nums1[i];
                        f++;
                        nums2[j]=-1;
                    }
                    else{
                        nums2[j]=-1;
                    }
                    
                }
            }
        }
        int [] num = new int[k];
        for(i=0;i<k;i++)
            num[i]=res[i];
        return num;

        /*HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])
                    hs.add(nums1[i]);
            }
        }
        int[] res = new int[hs.size()];
        int i=0;
        for(int num:hs)
            res[i++]=num;
        return res;*/
        
    }
}
