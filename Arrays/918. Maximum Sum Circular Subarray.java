class Solution {
    public int maxSubarraySumCircular(int[] nums) {
           
            int Csum=0,Msum=0,tsum=0;
             int MaxSum=Integer.MIN_VALUE;
             int Minsum=Integer.MAX_VALUE;
           for(int i=0;i<nums.length;i++)
           {
              Csum=Math.max(Csum+nums[i],nums[i]);
               MaxSum=Math.max(MaxSum,Csum);

               Msum=Math.min(nums[i],Msum+nums[i]);
                Minsum=Math.min(Msum,Minsum);
                tsum+=nums[i];
           }
         if(tsum-Minsum==0)
          return MaxSum;
        return Math.max(tsum-Minsum,MaxSum);
    }
}