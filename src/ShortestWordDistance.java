/**
 * Created by Vishwas on 05-02-2018.
 * https://leetcode.com/problems/shortest-word-distance
 */
public class ShortestWordDistance {

    public static void main(String[] args) {
        ShortestWordDistance shortestWordDistance = new ShortestWordDistance();
        String word1 = "cat", word2 = "bat";
        int distance = shortestWordDistance.distance(new String[]{"cat", "cat",
                        "cat", "lat", "abat", "adsf", "adsf", "aoudh", "bat",
                        "cadat", "cat"},
                word1, word2, 0);
        System.out.print("Distance between " + word1
                + " and " + word2 + " is " + distance);
    }

    public int distance(String[] words, String word1, String word2, int startIdx) {
        int distance = Integer.MAX_VALUE;
        int word1Index = -1, word2Index = -1;
        for (int i = startIdx; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.equals(word1)) {
                word1Index = i;
            } else if (currentWord.equals(word2)) {
                word2Index = i;
            }
            if (word1Index > -1 && word2Index > -1) {
                return Math.min(Math.abs(word1Index - word2Index),
                        distance(words, word1, word2, i));
            }
        }
        return distance;
    }

}
