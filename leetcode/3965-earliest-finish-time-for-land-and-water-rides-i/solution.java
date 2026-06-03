class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int n = landStartTime.length;
        int m = waterStartTime.length;

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int landFinish = landStartTime[i] + landDuration[i];
                int waterFinish = waterStartTime[j] + waterDuration[j];

                // Land -> Water
                int finish1 =
                    Math.max(waterStartTime[j], landFinish) + waterDuration[j];

                // Water -> Land
                int finish2 =
                    Math.max(landStartTime[i], waterFinish) + landDuration[i];

                result = Math.min(result, Math.min(finish1, finish2));
            }
        }

        return result;
    }
}
