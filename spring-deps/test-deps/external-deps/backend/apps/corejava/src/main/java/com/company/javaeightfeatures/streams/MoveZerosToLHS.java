package com.company.javaeightfeatures.streams;

import java.util.Arrays;

public class MoveZerosToLHS {
    public static void main(String[] args) {
        MoveZerosToLHS obj = new MoveZerosToLHS();
        int[] nums = {2, 9, 0, 3, 1, 0, 4};
        int n = nums.length;
        System.out.println(Arrays.toString(nums));

        int[] nums2 = {2, 9, 0, 3, 1, 0, 4};
        obj.moveZeroesToLHS(nums2, n);
        System.out.println(Arrays.toString(nums2));
    }

    private void moveZeroesToLHS(int[] nums, int n) {
        int j = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != 0)
                nums[j--] = nums[i];
        }


        while (j >= 0)
            nums[j--] = 0;
    }
}
