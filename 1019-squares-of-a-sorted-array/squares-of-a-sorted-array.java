class Solution {
    public int[] sortedSquares(int[] arr1) {
        int n = arr1.length;
        int[] arr2 = new int[n];

        int a = 0;
        int b = arr1.length - 1;
        int k = arr2.length - 1;
        for(int i=0;i<n;i++){
            int left = arr1[a]*arr1[a];
            int right = arr1[b]*arr1[b];
            if(left<=right){
                arr2[k] = right;
                k--;
                b--;
            }
            else{
                arr2[k] = left;
                k--;
                a++;
            }
        }
        return arr2;
    }
}