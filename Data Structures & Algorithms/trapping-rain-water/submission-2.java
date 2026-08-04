class Solution {
    public int trap(int[] height) {
        int[] maxLeft= new int[height.length];
        int[] maxRight =new int[height.length];
        int lmax=0;
        int rmax=0;
        int capacity=0;
        for(int i=0 ; i<height.length;i++){
            if(i==0){
                maxLeft[i]=0;
                lmax=height[i];
                continue;
            }
           maxLeft[i]=lmax;
           lmax=Math.max(lmax,height[i]);
        }
        for(int j=height.length-1 ; j>=0;j--){
            if(j==height.length-1){
                maxRight[j]=0;
                rmax=height[j];
                continue;
            }
            maxRight[j]=rmax;
            rmax=Math.max(rmax,height[j]);


        }
        System.out.println(Arrays.toString(maxLeft));
        System.out.println(Arrays.toString(maxRight));
        for(int i=0; i<height.length;i++){
            int temp= Math.min(maxRight[i],maxLeft[i])-height[i];
            if(temp>0){
                capacity+=temp;
            }
        }
        return capacity;
    }
}
