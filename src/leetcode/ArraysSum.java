package leetcode;

import java.util.Arrays;

public class ArraysSum {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 2));
        System.out.println(threeSumClosest(new int[]{0,0,0}, 1));
        System.out.println(threeSumClosest(new int[]{1,1,1,0}, -100));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int difference = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int first = nums[i];
            int start = i+1;
            int end = nums.length - 1;
            while (start < end) {
                if((first + nums[start] + nums[end]) == target) return target;
                else if(Math.abs(first + nums[start] + nums[end] - target) < difference) {
                    difference = Math.abs(first + nums[start] + nums[end] - target);
                    res = first + nums[start] + nums[end];
                }
                if (first + nums[start] + nums[end] > target) end--;
                else start++;
            }
        }
            return res;
    }
}
