// 452. Minimum Number of Arrows to Burst Balloons

class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                if(a1[1] == a2[1]) {
                    return 0;
                }

                if(a1[1] < a2[1]) {
                    return -1;
                }

                return 1;
            }
        });

        int arrow = 1;
        int interval = points[0][1];

        for(int i = 1; i < points.length; i++) {
            int CurrS = points[i][0];
            int CurrE = points[i][1];
            
            if(CurrS > interval) {
                arrow++;
                interval = CurrE;
            }

            // interval = Math.min(interval, CurrE);
        }

        return arrow;
    }
}