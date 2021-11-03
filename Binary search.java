class Solution {
    public int search(int[] nums, int target) {
        return recursion(nums,0,nums.length-1,target);
    }
    
    public static int recursion(int[] nums, int left, int right, int target){
        if(left>right){
            return -1;
        }
        
        int mid= (left+right)/2;
        
        if(target==nums[mid]){
            return mid;
        } else if(target<nums[mid]){
            return recursion(nums,left,mid-1,target);
        } 
        
        return recursion(nums,mid+1,right,target);
    }
}
