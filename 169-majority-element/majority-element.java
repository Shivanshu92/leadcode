class Solution {
    public int majorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;
        for(int num : arr){
            if(count==0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }

        }
        return candidate;
    }
}