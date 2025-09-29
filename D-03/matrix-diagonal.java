// 1572. Matrix Diagonal Sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int primary = 0;
        for(int i = 0; i < mat.length; i++) {
            primary += mat[i][i];
        }

        int secondary = 0;
        int idx = mat.length - 1;
        for(int i = 0; i < mat.length; i++) {
            if(i != idx) {
                secondary += mat[i][idx];
            }

            idx--;

        }

        return primary + secondary;
    }
}