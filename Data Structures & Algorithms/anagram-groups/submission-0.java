class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupA= new ArrayList<>();
        boolean[] visited= new boolean[strs.length];
        for(int i=0;i<strs.length;i++){

            if(visited[i]){
                continue;
            };
            visited[i]=true;
            List<String> anagramList=new ArrayList<>();
            anagramList.add(strs[i]);
            for(int j=0;j<strs.length;j++){
                if(i==j){
                    continue;
                }
                if(isAnagram(strs[i],strs[j])){

                    anagramList.add(strs[j]);
                    visited[j]=true;
                }

            }
            
            groupA.add(anagramList);

        }
        return groupA;
    }
    public boolean isAnagram(String str1, String str2){
        char[] charArray1=str1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] charArray2=str2.replaceAll("\\s","").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
      
        return Arrays.equals(charArray1,charArray2);
    }
}
