class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequency = new int[26];
        int maxf=0;
        int l=0;
        int result =0;
        for(int r=0; r<s.length();r++){
            int index = s.charAt(r)-'A';
            frequency[index]+=1;
            maxf =Math.max(frequency[index],maxf);
            while((r-l+1)-maxf>k){
                int indexleft = s.charAt(l)-'A';
                frequency[indexleft]-=1;
                l+=1;
            }
            result = Math.max(result,r-l+1);
        }
        return result;
    }
}
