class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
         int p1=0,p2=n-1;
         int sum=0;
          while(p1<p2)
          {
              sum=numbers[p1]+numbers[p2];
             if(sum==target)
             {
                return new int[]{p1+1,p2+1};
             }
             else if(sum>target)
             {
                p2--;
             }else{
                p1++;
             }
          }
        return new int[]{-1,-1};
    }
}