package leetcode;

public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = new int[]{1,7,3,6,5,6};
        int[] nums1 = new int[]{2,1,-1};
        int[] nums2 = new int[]{-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums2));

    }

    public static int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 0, j = nums.length -1; i < nums.length && j>=0 ; i++, j--) {
            leftSum[i] = i-1 < 0 ? 0 : leftSum[i-1] + nums[i-1];
            rightSum[j] = j+1 >=nums.length ? 0 : rightSum[j+1] + nums[j+1];
        }
        for (int i = 0 ; i< nums.length; i++) {
            if(leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }
}
