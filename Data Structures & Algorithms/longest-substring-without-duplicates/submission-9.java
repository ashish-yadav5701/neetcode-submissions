class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int max=0;
        HashSet<Character> charSet=new HashSet<>();
        for(int j=0;j<n;j++){
            while(charSet.contains(s.charAt(j))){
                charSet.remove(s.charAt(i));
                i+=1;
            }
            charSet.add(s.charAt(j)); 
            max= Math.max(j-i+1, max);
        }
        return max;
    }
}
