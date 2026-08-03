class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] twoSum=new int[2];
        int i=0;
        int j=numbers.length - 1;
        while (i<j){
            if(numbers[i]+numbers[j]==target){
                twoSum[0]=i+1;
                twoSum[1]=j+1;
                break;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            if(numbers[i]+numbers[j]>target){
                j--;
            }
        }
        return twoSum;
    }
}
