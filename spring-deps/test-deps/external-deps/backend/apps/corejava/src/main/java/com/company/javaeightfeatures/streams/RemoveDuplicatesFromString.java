package com.company.javaeightfeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        RemoveDuplicatesFromString obj = new RemoveDuplicatesFromString();
        int[] nums = {1,1,1,2,2,3,3,3,3,4,4,4,4,5};
        System.out.println(obj.removeDuplicatesFromString(nums));
        System.out.println(obj.removeDuplicates(nums));
    }

    public List<Integer> removeDuplicatesFromString(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n == 0 || n == 1)
            return n;

        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];

        nums[j++] = nums[n-1];

        return j;
    }
}
