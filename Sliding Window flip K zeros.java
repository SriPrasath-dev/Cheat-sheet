class Solution {
    public int longestOnes(int[] nums, int k) {
        int a=nums.length;
        int max=0;
        int zer=0;
        int left=0;
        for(int right=0;right<a;right++)
        {
            if(nums[right]==0)
            zer++;

            while(zer>k)
            {
             if(nums[left]==0)
             zer--;   
            left++;
            }
            max=Math.max(right-left+1,max);

        }
            return max;
        
    }
}
