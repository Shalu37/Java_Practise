class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray obj =
                new RemoveDuplicatesFromSortedArray();

        int[] nums = {1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("Unique elements: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}