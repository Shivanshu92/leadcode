class Solution {
    public List<List<Integer>> kSmallestPairs(int[] arr1, int[] arr2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (arr1.length == 0 || arr2.length == 0 || k == 0) {
            return ans;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < Math.min(arr1.length, k); i++) {
            pq.offer(new int[] { arr1[i] + arr2[0], i, 0 });
        }
        while (k > 0 && !pq.isEmpty()) {
            int[] curr = pq.remove();

            // {sum, arr1 index, arr2 index}
            // curr[0] = sum
            int i = curr[1]; // index
            int j = curr[2];
            ans.add(Arrays.asList(arr1[i], arr2[j])); // add pair to ans

            if (j + 1 < arr2.length) {
                pq.offer(new int[]{arr1[i] + arr2[j + 1],i,j + 1});
            }
            k--;
        }
        return ans;
    }
}