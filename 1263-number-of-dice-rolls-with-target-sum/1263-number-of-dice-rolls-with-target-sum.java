class Solution {
    public int numRollsToTarget(int d, int f, int target) {
         int maxSum = d * f;
    if(maxSum < target){
        return 0;
    }
    int[][] probabilities = new int[2][maxSum + 1];
    int flag = 0;
    for (int i = 1; i <= f; i++) {
        probabilities[flag][i] = 1;
    }
    for (int k = 2; k <= d; k++) {
        flag = 1 - flag;
        for (int i = 1; i < k; i++) {
            probabilities[flag][i] = 0;
        }
        for (int i = k; i <= f * k; i++) {
            int count = 1;
            probabilities[flag][i] = 0;
            while (i - count > 0 && count <= f) {
                probabilities[flag][i] += probabilities[1 - flag][i - count];
                probabilities[flag][i] %= 1000000007;
                count++;
            }
        }
    }
    return probabilities[flag][target];
    }
}