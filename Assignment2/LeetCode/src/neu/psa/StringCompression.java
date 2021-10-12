package neu.psa;

public class StringCompression {
    public int stringCompress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        int totalCount = 0;
        while(i < chars.length){
            char c = chars[i];
            int charCount = 1;
            int j  = i+1;
            while (j < chars.length){

                if (chars[j] == c){
                    charCount ++;
                    j++;
                }

                else{
                    s.append(c);
                    totalCount += charCount;

                    if (charCount > 1){
                        s.append(charCount);
                    }

                    i = j;
                    break;
                }
            }

            if (j > chars.length - 1){
                s.append(c);
                if (charCount > 1){
                    s.append(charCount);
                }
                break;
            }
        }
        int k = 0;
        while(k < s.length()){
            chars[k] = s.charAt(k);
            k++;
        }
        return s.length();
    }
}
