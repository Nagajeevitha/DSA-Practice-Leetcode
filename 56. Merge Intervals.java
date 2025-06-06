class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        List<int[]> res = new ArrayList<>();
        int[] interval = intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] current = intervals[i];
            if(interval[1]>=current[0])
                interval[1] = Math.max(interval[1],current[1]);
            else{
                res.add(interval);
                interval = current;
            }
        }
        res.add(interval);
        return res.toArray(new int[res.size()][]);
    }
}
