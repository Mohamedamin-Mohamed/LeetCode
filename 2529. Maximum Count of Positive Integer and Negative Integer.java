class Solution {
    public int maximumCount(int[] nums) {
        return Math.max(getPositiveNumbers(nums), getNegativeNumbers(nums));
    }
    private int getPositiveNumbers(int[] nums){
        //goal of this method is to find first occurence of postive number
        int lowerBound = 0;
        int upperBound = nums.length - 1;
        while(lowerBound <= upperBound){
            int mid = lowerBound + (upperBound - lowerBound) /2;
            if(nums[mid] > 0) //if true, we look for any positive numbers to the left of upperBound
            upperBound = mid - 1;
            else lowerBound = mid + 1;
        }
        return nums.length - lowerBound;
    }
     private int getNegativeNumbers(int[] nums){
         //goal of this method is to find last occurence of negative number
        int lowerBound = 0;
        int upperBound = nums.length - 1;
           while(lowerBound <= upperBound){
            int mid = lowerBound + (upperBound - lowerBound) /2;
            if(nums[mid] < 0)
            lowerBound = mid + 1;
            else 
            upperBound = mid -1;
           }
           return upperBound + 1;
    }
}
