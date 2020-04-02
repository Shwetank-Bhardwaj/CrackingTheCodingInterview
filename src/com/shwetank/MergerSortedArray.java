package com.shwetank;

public class MergerSortedArray {
    public static void main(String[] args) {
        /*int[] nums1 = new int[]{1, 2, 3, 4, 5, 0, 0, 0};
        int m = 5;
        int[] nums2 = new int[]{2, 3, 4};
        int n = 3;*/
        int[] nums1 = new int[]{2, 0};
        int m = 1;
        int[] nums2 = new int[]{1};
        int n = 1;
        int[] value = merge(nums1, m, nums2, n);
        for (int i : value) {
            System.out.print(i);
            System.out.print(",");
        }

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length - 1;
        m -= 1;
        n -= 1;

        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[len--] = nums1[m--];
            } else {
                nums1[len--] = nums2[n--];
            }
        }
        return nums1;
    }
}

