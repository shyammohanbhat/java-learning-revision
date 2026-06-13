package com.revision.binarysearch;

public class BinarySearch {

    /*
        Variant 1: Standard Binary Search (Find Exact Target)
     */

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Avoid overflow

            if (nums[mid] == target) {
                return mid;  // Found it

            } else if (nums[mid] < target) {
                left = mid + 1;  // Target is in right half
            } else {
                right = mid - 1;  // Target is in left half
            }
        }

        return -1;  // Not found
    }


    /* Variant 2: Find Lower Bound (First Occurrence)
     */
    public int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length;  // Note: right is nums.length, not nums.length - 1

        while (left < right) {  // Note: < not <=
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;  // All elements at mid and before are too small
            } else {
                right = mid;  // This could be the answer, but check left half too
            }
        }

        // left is the index of first element >= target
        // Check if it equals target
        if (left < nums.length && nums[left] == target) {
            return left;
        }
        return -1;  // Target not found
    }

    /*Variant 3: Find Upper Bound (Last Occurrence)*/
    public int upperBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;  // All elements at mid and before might be the target or smaller
            } else {
                right = mid;  // This element is too big
            }
        }

        // left is the index of first element > target
        // So last occurrence of target (if exists) is at left - 1
        if (left > 0 && nums[left - 1] == target) {
            return left - 1;
        }
        return -1;  // Target not found
    }

    /*Variant 4: Find First Element Greater Than Target*/
    public int firstGreater(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;  // Need something strictly greater
            } else {
                right = mid;  // This could be the answer
            }
        }
        // left is the index of first element > target
        // Returns nums.length if no such element exists
        return left;
    }

    /*Variant 5: Find First Element Greater Than or Equal To Target*/
    public int firstGreaterOrEqual(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;  // Need something >= target
            } else {
                right = mid;  // This could be the answer
            }
        }

        // left is the index of first element >= target
        return left;
    }

    /*Variant 6: Binary Search on Answer Space*/
    public int binarySearchOnAnswer(int minAnswer, int maxAnswer) {
        int left = minAnswer;
        int right = maxAnswer;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isFeasible(mid)) {
                right = mid;  // This works, but maybe we can do better
            } else {
                left = mid + 1;  // This does not work, need a larger value
            }
        }

        return left;  // Minimum feasible answer
    }

    private boolean isFeasible(int candidate) {
        // stub: replace with actual feasibility check
        // This is problem-specific
        return false;
    }
}
