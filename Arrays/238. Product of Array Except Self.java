class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        if(n==1)
         return nums;
         int fprod[]=new int[n];
         int bprod[]=new int[n];
          fprod[0]=nums[0];
            bprod[n-1]=nums[n-1];
         for(int i=1;i<n;i++)
         {
            fprod[i]=fprod[i-1]*nums[i];
         }
         for(int i=n-2;i>=0;i--)
         {
            bprod[i]=bprod[i+1]*nums[i];
         }
         int ans[]=new int[n];
          ans[0]=bprod[1];
          for(int i=1;i<n-1;i++)
          {
            ans[i]=fprod[i-1]*bprod[i+1];
          }
          ans[n-1]=fprod[n-2];
          return ans;
    }
}