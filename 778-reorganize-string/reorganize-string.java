class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //  maxheap
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        for (char ch : map.keySet()) {
            pq.offer(new int[]{map.get(ch), ch});
        }

        StringBuilder ans = new StringBuilder();
        int[] prev = null;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            ans.append((char) curr[1]);
            curr[0]--;

            if (prev != null && prev[0] > 0) {
                pq.offer(prev);
            }

            prev = curr;
        }

        return ans.length() == s.length() ? ans.toString() : "";
    }
}
