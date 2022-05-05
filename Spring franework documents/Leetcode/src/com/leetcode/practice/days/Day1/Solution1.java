package com.leetcode.practice.days.Day1;

import java.util.stream.IntStream;

public class Solution1 {

    public static void main(String[] args) {
        // write your code here
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {

        return IntStream.range(0, nums.length).filter(i -> target - nums[i] == 0).findFirst().orElse(-1);

    }


}
