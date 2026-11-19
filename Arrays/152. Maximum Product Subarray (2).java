class Solution {
    public int maxProduct(int[] nums) {
         
          int ans=Integer.MIN_VALUE;
          int ans1=ans; int s1=1,s2=1;
           for(int i=0;i<nums.length;i++)
           {
             s1=s1*nums[i];
                
               ans=Math.max(ans,Math.max(s1,nums[i]));
               if(s1==0)
               {
                s1=1;
               }
           }
           for(int i=nums.length-1;i>=0;i--)
           {
             s2=s2*nums[i];
              ans=Math.max(ans,Math.max(s2,nums[i]));
               
               if(s1==0)
               {
                s1=1;
               }
           }
           return ans;
        
    }
}