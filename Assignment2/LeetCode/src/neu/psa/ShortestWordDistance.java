package neu.psa;

public class ShortestWordDistance {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int distance = wordsDict.length;
        for(int i = 0; i < wordsDict.length; i++){
            if (wordsDict[i].equals(word1)){
                index1 = i;
            }
            if (wordsDict[i].equals(word2)){
                index2 = i;
            }

            if (index1 != -1 && index2 != -1){
                distance =  Math.min(distance, Math.abs(index1 - index2));
            }
        }
        return distance;
    }
}
