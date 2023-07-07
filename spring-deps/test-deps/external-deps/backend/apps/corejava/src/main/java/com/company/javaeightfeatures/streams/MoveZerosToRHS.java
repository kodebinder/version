package com.company.javaeightfeatures.streams;

import java.util.Arrays;

public class MoveZerosToRHS {
    public static void main(String[] args) {
        MoveZerosToRHS obj = new MoveZerosToRHS();
        int[] nums = {2, 9, 0, 3, 1, 0, 4};
        int n = nums.length;
        System.out.println(Arrays.toString(nums));

        obj.moveZeroesToRHS(nums, n);
        System.out.println(Arrays.toString(nums));
    }

    private void moveZeroesToRHS(int[] nums, int n) {

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                nums[j++] = nums[i];
        }

        while (j < n)
            nums[j++] = 0;
    }

}
