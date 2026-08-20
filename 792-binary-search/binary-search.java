class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>target){ // go left
                hi = mid -1;
            }
            else if(arr[mid]<target){ // go right
                lo = mid + 1;
            }
            else{ // here mid is the index
                return mid;
            }
        }
        return -1;
    }
}