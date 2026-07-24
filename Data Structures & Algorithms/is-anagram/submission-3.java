class Solution {
    public boolean isAnagram(String s, String t) {
        String[] s1= s.split("");
        String[] s2= t.split("");
        ArrayList<String> st= new ArrayList<>();
        if(s1.length==s2.length){
            for(int i=0;i<s1.length;i++){
                st.add(s1[i]);
            }  
            
             for(int i=0;i<s2.length;i++){
                if(st.contains(s2[i])){
                    st.remove(s2[i]);
                }
                else{
                    st.add(s2[i]);
                }
                 
            }   
             
        if(st.size()==0){
            return true;
        }
        }
       

        return false;

    }
}
