class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int a=nums.length;
        int sum=0;
       int min=Integer.MAX_VALUE;
        int left=0;
        int c=0;
        for(int right=0;right<a;right++)
        {
            sum=sum+nums[right];

            while(sum>=target)
            {   c=1;
                min=Math.min(min,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(c==1)
        return min;
        return 0;
    }
}
