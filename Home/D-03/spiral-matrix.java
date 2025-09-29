// 54. Spiral Matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;

        int startCol = 0;
        int endCol = matrix[0].length - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while(startRow <= endRow && startCol <= endCol) {
            
            for(int i = startCol; i <= endCol; i++) {
                list.add(matrix[startRow][i]);
            }
            startRow++;

            if(!(startRow <= endRow && startCol <= endCol)) break;


            for(int i = startRow; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }
            endCol--;

            if(!(startRow <= endRow && startCol <= endCol)) break;


            for(int i = endCol; i >= startCol; i--) {
                list.add(matrix[endRow][i]);
            }
            endRow--;

            if(!(startRow <= endRow && startCol <= endCol)) break;


            for(int i = endRow; i >= startRow; i--) {
                list.add(matrix[i][startCol]);
            }
            startCol++;

            if(!(startRow <= endRow && startCol <= endCol)) break;
        }

        return list;
    }
}