class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count1=new int[26];
        int[] count2= new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i =0 ; i<s1.length();i++){
            count1[s1.charAt(i)-'a']+=1;
            count2[s2.charAt(i)-'a']+=1;
        }
        if(Arrays.equals(count1,count2)){return true;}
        for(int r = s1.length();r<s2.length();r++){
            count2[s2.charAt(r)-'a']+=1;
            count2[s2.charAt(r - s1.length())-'a']-=1;
            if(Arrays.equals(count1,count2)){return true;}
        }
        return false;
    }
}
