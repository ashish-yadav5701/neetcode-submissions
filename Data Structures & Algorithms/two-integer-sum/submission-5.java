class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] indices=new int[2];
        for(int i=0 ;i<nums.length;i++){
            int j=0;
            for(;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                indices[0]=j;
                indices[1]=i;
                break;
            }
            }
        }
        
        return indices;
    }
}
