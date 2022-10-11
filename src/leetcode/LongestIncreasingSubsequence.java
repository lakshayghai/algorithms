package leetcode;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1,3,5,4,7,}));
    }

    public static int findLengthOfLCIS(int[] nums) {

        int longest = 1;
        int current = 1;
        if(nums.length == 1) {
            return longest;
        }
        for(int i = 1 ; i< nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                current++;
            } else {
                current = 1;
            }
            if(current>=longest) {
                longest = current;
            }
        }
        return longest;
    }
}
