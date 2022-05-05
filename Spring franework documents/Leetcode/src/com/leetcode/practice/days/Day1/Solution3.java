package com.leetcode.practice.days.Day1;


public class Solution3  {

    public static void main(String[] args) {
        // write your code here
        int nums[] = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));

    }

    public static int searchInsert(int[] nums, int target) {

        for(int i=0;i< nums.length;i++){
            if (target-nums[i]==0){
                return i;
            }
            if(target-nums[i]<0){
                return i;
            }

        }

        return nums.length;
    }



}