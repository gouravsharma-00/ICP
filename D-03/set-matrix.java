// 73. Set Matrix Zeroes

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> list = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == 0) {
                    list.add(new int[] {i, j});
                }
            }
        }

        for(int i = 0; i < list.size(); i++) {
            int[] arr = list.get(i);

            int row = 0;
            int column = 0;

            while(row < matrix.length) {
                matrix[row++][arr[1]] = 0;
            }

            while(column < matrix[0].length) {
                matrix[arr[0]][column++] = 0;
            }
        }
    }
}