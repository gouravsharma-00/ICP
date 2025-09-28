// 452. Minimum Number of Arrows to Burst Balloons

class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                if(a1[0] == a2[0]) {
                    return 0;
                }

                if(a1[0] < a2[0]) {
                    return -1;
                }

                return 1;
            }
        });

        int arrow = 1;
        int[] interval = points[0];

        for(int i = 1; i < points.length; i++) {
            int CurrS = points[i][0];
            int CurrE = points[i][1];
            
            if(CurrS > interval[1]) {
                arrow++;
                interval = points[i];
            }
            
            interval[0] = Math.max(interval[0], CurrS);
            interval[1] = Math.min(interval[1], CurrE);
        }

        return arrow;
    }
}