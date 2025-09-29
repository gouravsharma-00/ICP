//  48. Rotate Image

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++){

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        for(int[] m : matrix) {

            int start = 0;
            int end = n - 1;

            while(start < end) {
                int temp = m[start];

                m[start] = m[end];
                m[end] = temp;

                end--;
                start++;
            }
        }
    }
}