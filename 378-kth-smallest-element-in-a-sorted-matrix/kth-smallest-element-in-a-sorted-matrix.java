class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        // Each entry stores {value, row, column}
        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>((a, b) ->
                        Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{matrix[i][0], i, 0});
        }

        int result = 0;

        for (int count = 0; count < k; count++) {
            int[] current = minHeap.poll();

            result = current[0];

            int row = current[1];
            int col = current[2];

            if (col + 1 < n) {
                minHeap.offer(
                        new int[]{matrix[row][col + 1], row, col + 1}
                );
            }
        }

        return result;
    }
}
