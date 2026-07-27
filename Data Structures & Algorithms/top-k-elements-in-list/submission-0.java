class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap= new HashMap<>();
        for(int i :nums){
            if(countMap.containsKey(i)){
                int newcount= countMap.get(i)+1;
                countMap.put(i,newcount);
            }
            else{
                countMap.put(i,1);
            }
        }
        int[] freqArr= countMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(k)
                        .map(Map.Entry::getKey)                                        // Get Integer keys
                        .mapToInt(Integer::intValue)                                   // Convert to primitive int
                        .toArray(); 
        return freqArr;
    }
}
