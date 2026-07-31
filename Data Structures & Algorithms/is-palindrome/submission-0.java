class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
        int j= s.length();
        System.out.println(s);
        while(i<j){
            if(s.charAt(i)!=s.charAt(j-1)){
                 return false;

            }
            System.out.printf(" at %d : %c and at %d : %c",i,s.charAt(i),j,s.charAt(j-1));
                i++;
                j--;
           
        }
        return true;
    }
}
