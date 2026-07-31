class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        int start=0;
        int mLength =0;
        for(int i : nums){
            if(set.contains(i-1)){
                continue;
            }
            int current=i;
            int length =1;

            while(set.contains(current+1)){
                current+=1;
                length+=1;
            }
            System.out.println("Length :: "+length);
            if(length>mLength){
                start=i;
                mLength=length;
            }

        }
        
        return mLength;
    }
}
