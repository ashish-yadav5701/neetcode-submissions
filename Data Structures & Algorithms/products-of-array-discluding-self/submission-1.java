class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre= new int[nums.length];
        int[]  suf = new int[nums.length];
        Arrays.fill(pre, 1); 
        Arrays.fill(suf, 1); 
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i-1]*pre[i-1];
            // System.out.println("nums["+i+"-1]="+ nums[i-1]+":pre["+i+"-1]="+pre[i-1]);
        }
        System.out.println(Arrays.toString(pre));
        for(int j=suf.length-2;j>=0;j--){
            suf[j]=suf[j+1]*nums[j+1];
        }
        for (int k=0;k<nums.length;k++){
            nums[k]=pre[k]*suf[k];
        }
        return nums;
    }
}  
