class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr, 1);
        if (Arrays.equals(nums, arr)) return 0;
        
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 1) continue;

            // Toggle current element and next two elements
            nums[i] = 1 - nums[i];
            nums[i + 1] = 1 - nums[i + 1];
            nums[i + 2] = 1 - nums[i + 2];
            count++;

            // Check if the array is now equal to the target array
            if (Arrays.equals(nums, arr)) return count;
        }

        // Final check outside the loop if we haven't returned yet
        if (Arrays.equals(nums, arr)) return count;
        return -1;
    }
}
