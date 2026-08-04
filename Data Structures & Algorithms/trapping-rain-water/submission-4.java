class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax=height[i];
        int rmax=height[j];
        int capacity=0;
        while(i<j){
            if(lmax<rmax){
                i+=1;
                lmax=Math.max(lmax,height[i]);
                capacity+=lmax-height[i];
            }
            else{
                j-=1;
                rmax=Math.max(rmax,height[j]);
                capacity+=rmax-height[j];
            }
        }
        return capacity;
    }
}
