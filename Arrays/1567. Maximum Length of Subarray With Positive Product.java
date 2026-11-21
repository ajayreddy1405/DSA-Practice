class Solution {
    public int getMaxLen(int[] nums) {


         int j=-1; int neg=0,ans=0,first=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                neg++;
            
             if(first==-1)
             {
                first=i;
             }
            }
             if(nums[i]==0)
             {
                neg=0;
                j=i;
                first=-1;
             }
             else 
            {
                  if(neg%2==0)
                 ans=Math.max(ans,i-j);
                 else
                  ans=Math.max(ans,i-first);
            }
        }
        return ans;
    }
}