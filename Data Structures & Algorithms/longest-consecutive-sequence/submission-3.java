class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        int mLength =0;
        for(int i : nums){
            if(!set.contains(i-1)){
            int length =1;
            while(set.contains(i+length)){
                length++;
            }
            mLength= Math.max(mLength,length);

        }
        }
        return mLength;
    
}
}
