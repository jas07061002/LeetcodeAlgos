package com.leetcode.practice.days.Day1;


public class Solution2 extends VersionControl {

    public static void main(String[] args) {
        // write your code here
        int n = 2126753390;
        System.out.println(firstBadVersion(n));

    }

    public static int firstBadVersion(int n) {

        return recursive(0,n-1);
    }

    public static int recursive(int low, int high){
        int mid =0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(isBadVersion(mid) == false){
                return recursive(mid+1,high);
            }
            else {
                return recursive(low,mid+1);
            }
        }

        return low;


    }
}