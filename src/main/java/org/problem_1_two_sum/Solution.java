package org.problem_1_two_sum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }
        return sum;
    }
}
