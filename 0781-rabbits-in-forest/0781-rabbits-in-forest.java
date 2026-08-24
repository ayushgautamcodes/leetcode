class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int totalRabbits = 0;
        int i = 0;
        int n = answers.length;
        while (i < n) {
            int currAnswer = answers[i];
            int groupSize = currAnswer + 1;
            int count = 0;
            while (i < n && answers[i] == currAnswer && count<groupSize) {
                count++;
                i++;
            }
            totalRabbits += groupSize;
        }
        return totalRabbits; 
    }
}