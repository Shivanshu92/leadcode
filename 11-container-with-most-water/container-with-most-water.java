class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int a = 0;
        int b = height.length-1;
        while(a<b){
            int width = b-a;
            int minHeight = Math.min(height[a],height[b]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea,area);
            if(height[a]<height[b]){
                a++;
            }
            else{
                b--;
            }
        }
        return maxArea;
    }
}