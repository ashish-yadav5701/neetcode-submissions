class Solution {

    public String encode(List<String> strs) {
        String encodedStr=new String();
        for(String s:strs){
            encodedStr+=(":"+s.length());
            for(int i=0;i<s.length();i++ ){
                encodedStr=encodedStr+" ";
                int c =  s.charAt(i);
                encodedStr=encodedStr+c;
            }
            encodedStr=encodedStr+" ";
           
        }
        System.out.println(encodedStr);
        return encodedStr;
    }

    public List<String> decode(String str) {
        String[] chunk=str.split(" ");
        List<String> decode= new ArrayList<>();
        int i=0;
        while(i<chunk.length){
            if(chunk[i].startsWith(":")){
                int length = Integer.parseInt(chunk[i].substring(1));
                StringBuilder word = new StringBuilder();

                            for (int j = 1; j <= length; j++) {
                    if (i + j < chunk.length) {
                        int ascii = Integer.parseInt(chunk[i + j]);
                        word.append((char) ascii);
                    }
                }
                
                decode.add(word.toString());
                // Move the pointer past the prefix and its read characters
                i += (length + 1);
            } else {
                i++; // Fallback pointer advance
            }
        }
        System.out.println(Arrays.toString(chunk));

        return decode;
    }
}
