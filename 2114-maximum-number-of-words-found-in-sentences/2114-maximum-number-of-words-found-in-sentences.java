class Solution {
    public int mostWordsFound(String[] sentences) {

        ArrayList<Integer> wordsCount = new ArrayList<Integer>();

        for(int i = 0; i < sentences.length; i++) {
            char sentence[] = sentences[i].toCharArray();
            int tempWordCount = 1;
            for(int j = 0; j < sentence.length; j++) {
                if(sentence[j] == ' ')
                    tempWordCount++;
            }
            wordsCount.add(tempWordCount);

        }

        System.out.println(Collections.max(wordsCount)); // Debug
        return Collections.max(wordsCount);
    }
}