class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double ans=0;
         int n=nums.length; int sum=0;
          for(int i=0;i<k;i++)
          {
             sum+=nums[i];
          }
         ans=((double)sum/k);
            
             for(int i=k;i<n;i++)
             {
                 sum+=nums[i]-nums[i-k];
                 ans=Math.max(ans,((double)sum/k));
                System.out.println(ans);
             }
             return ans;
    }
}