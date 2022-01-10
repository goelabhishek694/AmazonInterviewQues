//leetcode 189

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        nums=reverseArr(nums,0,nums.length-1);
        nums=reverseArr(nums,0,k-1);
        nums=reverseArr(nums,k,nums.length-1);
    }

    public int[] reverseArr(int[] arr, int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        return arr;
    }
}